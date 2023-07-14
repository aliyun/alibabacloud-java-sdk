// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ImportAppAlertRulesRequest extends TeaModel {
    /**
     * <p>## Additional information about the **TemplageAlertConfig** parameter</p>
     * <br>
     * <p>**JSON string example and description**</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>[</p>
     * <p>  {</p>
     * <br>
     * <p>    "contactGroupIds": "381",                         // The ID of the alert contact group. Multiple IDs are separated by commas (,). You can ignore this parameter in the alert template configuration. The value is automatically generated when ARMS creates the alert rule based on the alert template. </p>
     * <p>    "alertType": 5,                                // The alert type. Valid values: 4 and 5. A value of 4 indicates browser monitoring. A value of 5 indicates application monitoring. </p>
     * <p>    "alarmContext": {                                // The template of the alert notification. </p>
     * <p>      "subTitle": "",</p>
     * <p>      "content": "Alert name: $alert name\nFilter condition: $filter\nAlert time: $alert time\nAlert content: $alert content\nNote: The alert remains being triggered until a reply email is received. The system will remind you 24 hours later."</p>
     * <p>    },</p>
     * <p>    "alertLevel": "WARN",                              // The alert severity. Valid values: FATAL, ERROR, and WARN. </p>
     * <p>    "metricParam": {</p>
     * <p>      "appId": "70901",                              // The ID of the associated application. You can specify an arbitrary value in the alert template configuration. The actual value is automatically generated when ARMS creates the alert rule based on the alert template. </p>
     * <p>      "pid": "atc889zkcf@d8deedfa9bf****",            // The PID of the associated application. You can specify an arbitrary value in the alert template configuration. The actual value is automatically generated when ARMS creates the alert rule based on the alert template. </p>
     * <p>      "type": "TXN",                                   // The type of the alert metric. For more information, see the following section. </p>
     * <p>      "dimensions": [                                 // The information about the associated dimension. For more information, see the following section. </p>
     * <p>        {</p>
     * <p>          "type": "STATIC",</p>
     * <p>          "value": "\/hello_test_api_address\/test1",</p>
     * <p>          "key": "rpc"</p>
     * <p>        }</p>
     * <p>      ]</p>
     * <p>    },</p>
     * <p>    "alertWay": [                                      // The notification method. Valid values: SMS, MAIL, and DING_ROBOT. </p>
     * <p>      "SMS",</p>
     * <p>      "MAIL",</p>
     * <p>      "DING_ROBOT"</p>
     * <p>    ],</p>
     * <p>    "alertRule": {</p>
     * <p>      "rules": [                                          // The conditions of the alert rule.</p>
     * <p>        {</p>
     * <p>          "measure": "appstat.txn.rt",                     // The metric based on which alerts are triggered. For more information, see the following section. </p>
     * <p>          "alias": "the response time of API calls in milliseconds",                 // The display parameter of the alert metric. You do not need to set this parameter for an alert template. </p>
     * <p>          "aggregates": "AVG",                            // The aggregation logic of the alert rule. Valid values: AVG, SUM, MIN, and MAX. </p>
     * <p>          "nValue": 1,                                    // The time range to query. </p>
     * <p>          "value": 1,                                     // The threshold of the condition. </p>
     * <p>          "operator": "CURRENT_GTE"                       // The operation logic of the condition. Valid values: CURRENT_GTE: greater than or equal to. CURRENT_LTE: less than or equal to. PREVIOUS_UP: the minute-to-minute increase percentage. PREVIOUS_DOWN: the minute-to-minute decrease percentage. HOH_UP: the increase percentage compared with the previous hour. HOH_DOWN: the decrease percentage compared with the previous hour. DOD_UP: the increase percentage compared with the last day. DOD_DOWN: the decrease percentage compared with the last day. </p>
     * <p>        }</p>
     * <p>      ],</p>
     * <p>      "operator": "|"                                    // The logical operator between conditions. Valid values: &: AND. |: OR. </p>
     * <p>    },</p>
     * <p>    "title": "Template alert name",                              // The alert name. An alert rule name in the format of {title}-Application name is generated when ARMS creates the alert rule based on the alert template. </p>
     * <p>    "config": "{\"continuous\":false,\"dataRevision\":2,\"ownerId\":\"123412341234\"}",          // If the continuous parameter is set to true, ARMS sends alert notifications without interruption. If the continuous parameter is set to false, an alert silence period of 24 hours is enabled. The dataRevision parameter specifies the data revision policy to be used if no data is obtained or the data is null. Valid values: 0: overwrites the data by using the value 0. 1: overwrites the data by using the value 1. 2: overwrites the data by using the value null, which means that no alert is triggered if no data exists. </p>
     * <p>    "notice": {                                                                                  // The noticeStartTime and noticeEndTime parameters specify the time range when alert notifications are sent. The startTime and endTime parameters specify the time range when the alert rule takes effect. The values are UNIX timestamps in milliseconds. Each timestamp indicates a point in time on the current day. For example, the 1565964097071 timestamp indicates 22:01:37 on August 16, 2019. </p>
     * <p>      "noticeStartTime": 1480521600000,</p>
     * <p>      "startTime": 1480521600000,</p>
     * <p>      "endTime": 1480607940000,</p>
     * <p>      "noticeEndTime": 1480607940000</p>
     * <p>    },</p>
     * <p>    "status": "NON"                                        // The status of the alert rule. You can ignore this parameter in the alert template configuration. The value is automatically generated when ARMS creates the alert rule based on the alert template. </p>
     * <p>  }</p>
     * <p>]</p>
     * <p>            </p>
     * <p>```</p>
     * <br>
     * <p>**Description of the Measure, Dimension, and metricParam.type parameters**</p>
     * <br>
     * <p>The **metricParam.type** parameter specifies the unique type of each alert rule. Each type of alert rules can use a dimension for the conditions. Multiple conditions can be set for each type of alert rules. Each condition can use multiple metrics of the same type for calculation.****</p>
     * <br>
     * <p>The **Dimensions.type** parameter has the following valid values:</p>
     * <br>
     * <p>*   `STATIC`: checks only the value of this dimension. In this case, you must set the **dimensions.value** parameter.</p>
     * <p>*   `ALL`: checks the values of all dimensions. The metrics of all API operations are checked. If an operation triggers an alert, the operation name is displayed in the alert notification. In this case, you do not need to set the **dimensions.value** parameter.</p>
     * <p>*   `DISABLE`: aggregates the values of all dimensions. In this case, you do not need to set the **dimensions.value** parameter.</p>
     * <br>
     * <p>**Alert metrics**</p>
     * <br>
     * <p>*   Alert type (metricParam.type): TXN</p>
     * <br>
     * <p>    *   Dimension (dimensions.key): rpc</p>
     * <br>
     * <p>    *   Metrics (alertRule.rules.measure):</p>
     * <br>
     * <p>        *   appstat.txn.rt: the response time of API calls in milliseconds</p>
     * <p>        *   appstat.txn.count: the number of API calls</p>
     * <p>        *   appstat.txn.errcount: the number of API call errors</p>
     * <br>
     * <p>*   Alert type (metricParam.type): TXN_TYPE</p>
     * <br>
     * <p>    *   Dimension (dimensions.key): rpcType</p>
     * <br>
     * <p>    *   Metrics (alertRule.rules.measure):</p>
     * <br>
     * <p>        *   appstat.incall.rt: the response time of API calls for the services that are provided by the application, in milliseconds</p>
     * <p>        *   appstat.incall.count: the number of API calls for the services that are provided by the application</p>
     * <p>        *   appstat.incall.error: the number of API call errors for the services that are provided by the application</p>
     * <p>        *   appstat.outcall.rt: the response time of API calls for the services on which the application depends, in milliseconds</p>
     * <p>        *   appstat.outcall.count: the number of API calls for the services on which the application depends</p>
     * <p>        *   appstat.outcall.error: the number of API call errors for the services on which the application depends</p>
     * <br>
     * <p>*   Alert type (metricParam.type): DB</p>
     * <br>
     * <p>    *   Dimension (dimensions.key): endpoint</p>
     * <br>
     * <p>    *   Metrics (alertRule.rules.measure):</p>
     * <br>
     * <p>        *   appstat.database.rt: the response time of API calls for the database</p>
     * <p>        *   appstat.database.count: the number of API calls for the database</p>
     * <p>        *   appstat.database.errcount: the number of API call errors for the database</p>
     * <br>
     * <p>*   Alert type (metricParam.type): JVM</p>
     * <br>
     * <p>    *   Dimension (dimensions.key): rootIp</p>
     * <br>
     * <p>    *   Metrics (alertRule.rules.measure):</p>
     * <br>
     * <p>        *   appstat.jvm.heap_used: the total memory space in the JVM heap, in bytes</p>
     * <p>        *   appstat.jvm.GcPsScavengeCount: the number of garbage collections (GCs) in JVM</p>
     * <p>        *   appstat.jvm.GcPsMarkSweepCount: the number of tag deletions in JVM</p>
     * <p>        *   appstat.jvm.GcG1OldGenCount: the number of Garbage-First (G1) GCs in the old generation</p>
     * <p>        *   appstat.jvm.GcG1YoungGenCount: the number of G1 GCs in the young generation</p>
     * <p>        *   appstat.jvm.gc.YoungGcCountInstant: the number of GCs in the young generation</p>
     * <p>        *   appstat.jvm.gc.OldGcCountInstant: the number of full heap GCs (Full GCs) in JVM</p>
     * <p>        *   appstat.jvm.gc.YoungGcTimeInstant: the time that is consumed for the GCs in the young generation, in milliseconds</p>
     * <p>        *   appstat.jvm.gc.OldGcTimeInstant: the time that is consumed for the Full GCs in JVM, in milliseconds</p>
     * <p>        *   appstat.jvm.ThreadCount: the total number of JVM threads</p>
     * <p>        *   appstat.jvm.non_heap_used: the used space of the non-heap JVM memory, in bytes</p>
     * <p>        *   appstat.jvm.non_heap_max: the maximum space of the non-heap JVM memory, in bytes</p>
     * <p>        *   appstat.jvm.non_heap_init: the initial space of the non-heap JVM memory, in bytes</p>
     * <p>        *   appstat.jvm.non_heap_committed: the submitted space of the non-heap JVM memory, in bytes</p>
     * <br>
     * <p>*   Alert type (metricParam.type): HOST</p>
     * <br>
     * <p>    *   Dimension (dimensions.key): rootIp</p>
     * <br>
     * <p>    *   Metrics (alertRule.rules.measure):</p>
     * <br>
     * <p>        *   appstat.jvm.SystemCpuUser: the used CPU of the host, in percentage</p>
     * <p>        *   appstat.jvm.SystemMemFree: the idle memory space of the host, in bytes</p>
     * <p>        *   appstat.jvm.SystemDiskFree: the idle disk space of the host, in bytes</p>
     * <p>        *   appstat.jvm.SystemNetInErrs: the number of error messages that is received by the host</p>
     * <p>        *   appstat.jvm.SystemNetOutErrs: the number of error messages that is sent by the host</p>
     * <p>        *   appstat.jvm.SystemLoad: the system load of the host</p>
     * <br>
     * <p>*   Alert type (metricParam.type): EXCEPTION</p>
     * <br>
     * <p>    *   Dimension (dimensions.key): rpc</p>
     * <br>
     * <p>    *   Metrics (alertRule.rules.measure):</p>
     * <br>
     * <p>        *   appstat.exception.rt: the response time of abnormal API calls for the application, in milliseconds</p>
     * <p>        *   appstat.exception.count: the number of abnormal API calls for the application</p>
     */
    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    @NameInMap("IsAutoStart")
    public Boolean isAutoStart;

    /**
     * <p>The operation that you want to perform. Set the value to **ImportAppAlertRules**.</p>
     */
    @NameInMap("Pids")
    public String pids;

    /**
     * <p>Specifies whether to enable the alert rule after it is created. Default value: `false`.</p>
     * <br>
     * <p>*   `true`: enables the alert rule.</p>
     * <p>*   `false`: disables the alert rule.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tags")
    public java.util.List<ImportAppAlertRulesRequestTags> tags;

    @NameInMap("TemplageAlertConfig")
    public String templageAlertConfig;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("TemplateAlertId")
    public String templateAlertId;

    public static ImportAppAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAppAlertRulesRequest self = new ImportAppAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public ImportAppAlertRulesRequest setContactGroupIds(String contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    public ImportAppAlertRulesRequest setIsAutoStart(Boolean isAutoStart) {
        this.isAutoStart = isAutoStart;
        return this;
    }
    public Boolean getIsAutoStart() {
        return this.isAutoStart;
    }

    public ImportAppAlertRulesRequest setPids(String pids) {
        this.pids = pids;
        return this;
    }
    public String getPids() {
        return this.pids;
    }

    public ImportAppAlertRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportAppAlertRulesRequest setTags(java.util.List<ImportAppAlertRulesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ImportAppAlertRulesRequestTags> getTags() {
        return this.tags;
    }

    public ImportAppAlertRulesRequest setTemplageAlertConfig(String templageAlertConfig) {
        this.templageAlertConfig = templageAlertConfig;
        return this;
    }
    public String getTemplageAlertConfig() {
        return this.templageAlertConfig;
    }

    public ImportAppAlertRulesRequest setTemplateAlertId(String templateAlertId) {
        this.templateAlertId = templateAlertId;
        return this;
    }
    public String getTemplateAlertId() {
        return this.templateAlertId;
    }

    public static class ImportAppAlertRulesRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ImportAppAlertRulesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ImportAppAlertRulesRequestTags self = new ImportAppAlertRulesRequestTags();
            return TeaModel.build(map, self);
        }

        public ImportAppAlertRulesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ImportAppAlertRulesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
