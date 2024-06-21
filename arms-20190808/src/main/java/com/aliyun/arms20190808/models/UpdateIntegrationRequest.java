// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateIntegrationRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically clear alert events. Valid values:</p>
     * <ul>
     * <li>true (default)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRecover")
    public Boolean autoRecover;

    /**
     * <p>The description of the alert integration.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The fields whose values are deduplicated.</p>
     * 
     * <strong>example:</strong>
     * <p>LABEL.dimensions::LABEL.ruleId</p>
     */
    @NameInMap("DuplicateKey")
    public String duplicateKey;

    /**
     * <p>The extended mapped fields are mapped to the fields of ARMS alerts. For more information, see the description of the ExtendedFieldRedefineRules parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;redefineType&quot;:&quot;EXTRACT&quot;,
     *         &quot;matchExpression&quot;:null,
     *         &quot;fieldName&quot;:&quot;dimensions&quot;,
     *         &quot;expression&quot;:null,
     *         &quot;mappingRuleList&quot;:[</p>
     * <pre><code>    ],
     *     &quot;name&quot;:&quot;dimensions&quot;,
     *     &quot;integrationId&quot;:1234,
     *     &quot;jsonPath&quot;:&quot;$.dimensions&quot;,
     *     &quot;id&quot;:10013,
     *     &quot;fieldType&quot;:&quot;LABEL&quot;
     * },
     * {
     *     &quot;redefineType&quot;:&quot;EXTRACT&quot;,
     *     &quot;matchExpression&quot;:null,
     *     &quot;fieldName&quot;:&quot;expression&quot;,
     *     &quot;expression&quot;:null,
     *     &quot;mappingRuleList&quot;:[
     * 
     *     ],
     *     &quot;name&quot;:&quot;expression&quot;,
     *     &quot;integrationId&quot;:1234,
     *     &quot;jsonPath&quot;:&quot;$.expression&quot;,
     *     &quot;id&quot;:10014,
     *     &quot;fieldType&quot;:&quot;LABEL&quot;
     * }
     * </code></pre>
     * <p>]</p>
     */
    @NameInMap("ExtendedFieldRedefineRules")
    public String extendedFieldRedefineRules;

    /**
     * <p>The predefined mapped fields are mapped to the fields of ARMS alerts. The predefined mapped fields were generated when the alert integration was created. For more information, see the description of the FieldRedefineRules parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;redefineType&quot;:&quot;EXTRACT&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;alertname&quot;, &quot;expression&quot;:null, &quot;mappingRuleList&quot;:[ ], &quot;name&quot;:&quot;Alert name&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:&quot;$.alertName&quot;, &quot;id&quot;:10001, &quot;fieldType&quot;:&quot;LABEL&quot; }, { &quot;redefineType&quot;:&quot;MAP&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;severity&quot;, &quot;expression&quot;:null, &quot;mappingRuleList&quot;:[ { &quot;mappingValue&quot;:&quot;critical&quot;, &quot;mappingName&quot;:&quot;P1&quot;, &quot;mappingType&quot;:&quot;MAP&quot;, &quot;originValue&quot;:&quot;CRITICAL&quot; }, { &quot;mappingValue&quot;:&quot;error&quot;, &quot;mappingName&quot;:&quot;P2&quot;, &quot;mappingType&quot;:&quot;MAP&quot;, &quot;originValue&quot;:&quot;WARN&quot; }, { &quot;mappingValue&quot;:&quot;warning&quot;, &quot;mappingName&quot;:&quot;P3&quot;, &quot;mappingType&quot;:&quot;MAP&quot;, &quot;originValue&quot;:&quot;INFO&quot; } ], &quot;name&quot;:&quot;Alert level&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:&quot;$.triggerLevel&quot;, &quot;id&quot;:10002, &quot;fieldType&quot;:&quot;LABEL&quot; }, { &quot;redefineType&quot;:&quot;EXTRACT&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;message&quot;, &quot;expression&quot;:&quot;{{$labels.namespace}} / {{$labels.dimensions}} Alert content {{ $labels.alertname }}, Current value {{$value}}.&quot;, &quot;mappingRuleList&quot;:[ ], &quot;name&quot;:&quot;Alert description&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:null, &quot;id&quot;:10003, &quot;fieldType&quot;:&quot;ANNOTATION&quot; }, { &quot;redefineType&quot;:&quot;EXTRACT&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;value&quot;, &quot;expression&quot;:null, &quot;mappingRuleList&quot;:[ ], &quot;name&quot;:&quot;Alert sample value&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:&quot;$.curValue&quot;, &quot;id&quot;:10004, &quot;fieldType&quot;:&quot;ANNOTATION&quot; }, { &quot;redefineType&quot;:&quot;EXTRACT&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;source&quot;, &quot;expression&quot;:null, &quot;mappingRuleList&quot;:[ ], &quot;name&quot;:&quot;Source&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:null, &quot;id&quot;:10007, &quot;fieldType&quot;:&quot;LABEL&quot; }, { &quot;redefineType&quot;:&quot;ADD&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;generatorUrl&quot;, &quot;expression&quot;:&quot;<a href="https://cloudmonitor.console.aliyun.com/index.htm#/alarmInfo/name=%7B%7B$labels.ruleId%7D%7D%5C%5C&searchValue=%5C%5C&searchType=name%5C%5C&searchProduct=/history/all/searchKey:%7B%7B$labels.ruleId%7D%7D,startTime:%7B%7Bsub">https://cloudmonitor.console.aliyun.com/index.htm#/alarmInfo/name={{$labels.ruleId}}\\&amp;searchValue=\\&amp;searchType=name\\&amp;searchProduct=/history/all/searchKey:{{$labels.ruleId}},startTime:{{sub</a> $startsAt 300000}},endTime:{{$endsAt}}&quot;, &quot;mappingRuleList&quot;:[ ], &quot;name&quot;:&quot;Event URL&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:&quot;<a href="https://cloudmonitor.console.aliyun.com/index.htm#/alarmInfo/name=%7B%7B$labels.ruleId%7D%7D%5C%5C&searchValue=%5C%5C&searchType=name%5C%5C&searchProduct=/history/all/searchKey:%7B%7B$labels.ruleId%7D%7D,startTime:%7B%7Bsub">https://cloudmonitor.console.aliyun.com/index.htm#/alarmInfo/name={{$labels.ruleId}}\\&amp;searchValue=\\&amp;searchType=name\\&amp;searchProduct=/history/all/searchKey:{{$labels.ruleId}},startTime:{{sub</a> $startsAt 300000}},endTime:{{$endsAt}}&quot;, &quot;id&quot;:10012, &quot;fieldType&quot;:&quot;GENERATE_URL&quot; } ]</p>
     */
    @NameInMap("FieldRedefineRules")
    public String fieldRedefineRules;

    /**
     * <p>The field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.</p>
     * <blockquote>
     * <p>Only the Log Service alert integration supports the parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>$.status</p>
     */
    @NameInMap("InitiativeRecoverField")
    public String initiativeRecoverField;

    /**
     * <p>The value of the field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.</p>
     * <blockquote>
     * <p>Only the Log Service alert integration supports the parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("InitiativeRecoverValue")
    public String initiativeRecoverValue;

    /**
     * <p>The ID of the alert integration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("IntegrationId")
    public Long integrationId;

    /**
     * <p>The name of the alert integration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudMonitor integration</p>
     */
    @NameInMap("IntegrationName")
    public String integrationName;

    /**
     * <p>The service of the alert integration. Valid values:</p>
     * <ul>
     * <li>CLOUD_MONITOR: CloudMonitor</li>
     * <li>LOG_SERVICE: Log Service</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLOUD_MONITOR</p>
     */
    @NameInMap("IntegrationProductType")
    public String integrationProductType;

    /**
     * <p>The activity of the alert integration</p>
     * 
     * <strong>example:</strong>
     * <p>ready</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>The period of time within which alert events are automatically cleared. Unit: seconds. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("RecoverTime")
    public Long recoverTime;

    /**
     * <p>The total number of alert events and the number of abnormal alert events in the last hour.</p>
     * 
     * <strong>example:</strong>
     * <p>[0,0]</p>
     */
    @NameInMap("Stat")
    public String stat;

    /**
     * <p>Indicates whether the alert integration was enabled. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("State")
    public Boolean state;

    public static UpdateIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegrationRequest self = new UpdateIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIntegrationRequest setAutoRecover(Boolean autoRecover) {
        this.autoRecover = autoRecover;
        return this;
    }
    public Boolean getAutoRecover() {
        return this.autoRecover;
    }

    public UpdateIntegrationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIntegrationRequest setDuplicateKey(String duplicateKey) {
        this.duplicateKey = duplicateKey;
        return this;
    }
    public String getDuplicateKey() {
        return this.duplicateKey;
    }

    public UpdateIntegrationRequest setExtendedFieldRedefineRules(String extendedFieldRedefineRules) {
        this.extendedFieldRedefineRules = extendedFieldRedefineRules;
        return this;
    }
    public String getExtendedFieldRedefineRules() {
        return this.extendedFieldRedefineRules;
    }

    public UpdateIntegrationRequest setFieldRedefineRules(String fieldRedefineRules) {
        this.fieldRedefineRules = fieldRedefineRules;
        return this;
    }
    public String getFieldRedefineRules() {
        return this.fieldRedefineRules;
    }

    public UpdateIntegrationRequest setInitiativeRecoverField(String initiativeRecoverField) {
        this.initiativeRecoverField = initiativeRecoverField;
        return this;
    }
    public String getInitiativeRecoverField() {
        return this.initiativeRecoverField;
    }

    public UpdateIntegrationRequest setInitiativeRecoverValue(String initiativeRecoverValue) {
        this.initiativeRecoverValue = initiativeRecoverValue;
        return this;
    }
    public String getInitiativeRecoverValue() {
        return this.initiativeRecoverValue;
    }

    public UpdateIntegrationRequest setIntegrationId(Long integrationId) {
        this.integrationId = integrationId;
        return this;
    }
    public Long getIntegrationId() {
        return this.integrationId;
    }

    public UpdateIntegrationRequest setIntegrationName(String integrationName) {
        this.integrationName = integrationName;
        return this;
    }
    public String getIntegrationName() {
        return this.integrationName;
    }

    public UpdateIntegrationRequest setIntegrationProductType(String integrationProductType) {
        this.integrationProductType = integrationProductType;
        return this;
    }
    public String getIntegrationProductType() {
        return this.integrationProductType;
    }

    public UpdateIntegrationRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public UpdateIntegrationRequest setRecoverTime(Long recoverTime) {
        this.recoverTime = recoverTime;
        return this;
    }
    public Long getRecoverTime() {
        return this.recoverTime;
    }

    public UpdateIntegrationRequest setStat(String stat) {
        this.stat = stat;
        return this;
    }
    public String getStat() {
        return this.stat;
    }

    public UpdateIntegrationRequest setState(Boolean state) {
        this.state = state;
        return this;
    }
    public Boolean getState() {
        return this.state;
    }

}
