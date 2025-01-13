// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncTaskResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public GetDISyncTaskResponseBodyData data;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1411515937635973****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>True</li>
     * <li>False</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskResponseBody self = new GetDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskResponseBody setData(GetDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public GetDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList extends TeaModel {
        @NameInMap("Aggregator")
        public String aggregator;

        @NameInMap("Comparator")
        public String comparator;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Level")
        public String level;

        @NameInMap("Threshold")
        public Long threshold;

        public static GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList self = new GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList setAggregator(String aggregator) {
            this.aggregator = aggregator;
            return this;
        }
        public String getAggregator() {
            return this.aggregator;
        }

        public GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList setComparator(String comparator) {
            this.comparator = comparator;
            return this;
        }
        public String getComparator() {
            return this.comparator;
        }

        public GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

    }

    public static class GetDISyncTaskResponseBodyDataAlarmListNotifyRule extends TeaModel {
        @NameInMap("Critical")
        public java.util.List<String> critical;

        @NameInMap("Interval")
        public Long interval;

        @NameInMap("Warning")
        public java.util.List<String> warning;

        public static GetDISyncTaskResponseBodyDataAlarmListNotifyRule build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseBodyDataAlarmListNotifyRule self = new GetDISyncTaskResponseBodyDataAlarmListNotifyRule();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseBodyDataAlarmListNotifyRule setCritical(java.util.List<String> critical) {
            this.critical = critical;
            return this;
        }
        public java.util.List<String> getCritical() {
            return this.critical;
        }

        public GetDISyncTaskResponseBodyDataAlarmListNotifyRule setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public GetDISyncTaskResponseBodyDataAlarmListNotifyRule setWarning(java.util.List<String> warning) {
            this.warning = warning;
            return this;
        }
        public java.util.List<String> getWarning() {
            return this.warning;
        }

    }

    public static class GetDISyncTaskResponseBodyDataAlarmList extends TeaModel {
        @NameInMap("AlarmRuleList")
        public java.util.List<GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList> alarmRuleList;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Metric")
        public String metric;

        @NameInMap("NotifyRule")
        public GetDISyncTaskResponseBodyDataAlarmListNotifyRule notifyRule;

        @NameInMap("RuleName")
        public String ruleName;

        public static GetDISyncTaskResponseBodyDataAlarmList build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseBodyDataAlarmList self = new GetDISyncTaskResponseBodyDataAlarmList();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseBodyDataAlarmList setAlarmRuleList(java.util.List<GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList> alarmRuleList) {
            this.alarmRuleList = alarmRuleList;
            return this;
        }
        public java.util.List<GetDISyncTaskResponseBodyDataAlarmListAlarmRuleList> getAlarmRuleList() {
            return this.alarmRuleList;
        }

        public GetDISyncTaskResponseBodyDataAlarmList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDISyncTaskResponseBodyDataAlarmList setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetDISyncTaskResponseBodyDataAlarmList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDISyncTaskResponseBodyDataAlarmList setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public GetDISyncTaskResponseBodyDataAlarmList setNotifyRule(GetDISyncTaskResponseBodyDataAlarmListNotifyRule notifyRule) {
            this.notifyRule = notifyRule;
            return this;
        }
        public GetDISyncTaskResponseBodyDataAlarmListNotifyRule getNotifyRule() {
            return this.notifyRule;
        }

        public GetDISyncTaskResponseBodyDataAlarmList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class GetDISyncTaskResponseBodyDataSolutionDetail extends TeaModel {
        /**
         * <p>The creator of the data synchronization solution.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks_di</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The ID of the data synchronization solution.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data synchronization solution.</p>
         * 
         * <strong>example:</strong>
         * <p>holo_20211206161025</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configuration details of the data synchronization solution.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;holoDatasource&quot;:&quot;holo&quot;,&quot;offlineSyncConfig&quot;:{&quot;nodeNameRule&quot;:&quot;oneclick_holo_di_${db_table_name_src}<em>to</em>${db_table_name_dest}&quot;,&quot;resourceGroup&quot;:&quot;group_219193793999490&quot;},&quot;processRuleId&quot;:1007,&quot;readerConcurrent&quot;:10,&quot;realtimeSyncConfig&quot;:{&quot;content&quot;:{&quot;order&quot;:{&quot;hops&quot;:[{&quot;from&quot;:&quot;reader&quot;,&quot;to&quot;:&quot;writer&quot;}]},&quot;setting&quot;:{&quot;speed&quot;:{&quot;readerConcurrent&quot;:10}},&quot;steps&quot;:[{&quot;stepType&quot;:&quot;mysql&quot;,&quot;name&quot;:&quot;reader&quot;,&quot;category&quot;:&quot;reader&quot;,&quot;parameter&quot;:{&quot;connection&quot;:[{&quot;datasource&quot;:&quot;mm&quot;,&quot;datasourceType&quot;:&quot;mysql&quot;,&quot;table&quot;:[]}]}},{&quot;stepType&quot;:&quot;holo&quot;,&quot;name&quot;:&quot;writer&quot;,&quot;category&quot;:&quot;writer&quot;,&quot;parameter&quot;:{&quot;datasource&quot;:&quot;holo&quot;,&quot;writeMode&quot;:&quot;replay&quot;,&quot;datasourceSchema&quot;:&quot;public&quot;,&quot;tableMappingRule&quot;:{&quot;datasource&quot;:[{&quot;tableRule&quot;:[],&quot;srcDatasourceName&quot;:&quot;mm&quot;}]}}}]},&quot;extend&quot;:{&quot;mode&quot;:&quot;migration_holo&quot;,&quot;resourceGroup&quot;:&quot;group_219193793999490&quot;}},&quot;setting&quot;:{&quot;autoCreateWorkflow&quot;:true,&quot;userDefinedFileNameExpression&quot;:&quot;oneclick&quot;},&quot;srcType&quot;:&quot;mysql&quot;,&quot;tableMappingRuleFromRealtimeSyncConfig&quot;:{&quot;datasource&quot;:[{&quot;srcDatasourceName&quot;:&quot;mm&quot;,&quot;tableRule&quot;:[]}]}}</p>
         */
        @NameInMap("ProcessContent")
        public String processContent;

        /**
         * <p>The additional parameters of the data synchronization solution.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;processType&quot;:&quot;new&quot;,&quot;tableNum&quot;:300}</p>
         */
        @NameInMap("ProcessExtra")
        public String processExtra;

        /**
         * <p>The ID of the project to which the data synchronization solution belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The type of the source of the data synchronization solution.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The start time of the data synchronization solution.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-07 14:40:51</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the data synchronization solution. Valid values:</p>
         * <ul>
         * <li>0: successful</li>
         * <li>1: not running</li>
         * <li>2: running</li>
         * <li>3: failed</li>
         * <li>4: committed</li>
         * <li>5: pending manual confirmation</li>
         * <li>6: manually confirmed</li>
         * <li>7: others</li>
         * <li>8: waiting</li>
         * <li>9: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the data synchronization solution was committed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-07 14:40:51</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The type of the data synchronization solution.</p>
         * 
         * <strong>example:</strong>
         * <p>holo</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDISyncTaskResponseBodyDataSolutionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseBodyDataSolutionDetail self = new GetDISyncTaskResponseBodyDataSolutionDetail();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setProcessContent(String processContent) {
            this.processContent = processContent;
            return this;
        }
        public String getProcessContent() {
            return this.processContent;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setProcessExtra(String processExtra) {
            this.processExtra = processExtra;
            return this;
        }
        public String getProcessExtra() {
            return this.processExtra;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetDISyncTaskResponseBodyDataSolutionDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDISyncTaskResponseBodyData extends TeaModel {
        @NameInMap("AlarmList")
        public java.util.List<GetDISyncTaskResponseBodyDataAlarmList> alarmList;

        /**
         * <ul>
         * <li>If the TaskType parameter is set to DI_REALTIME, the details of the real-time synchronization task are returned.</li>
         * <li>If the TaskType parameter is set to DI_SOLUTION, the value null is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;extend&quot;:{&quot;mode&quot;:&quot;wizard&quot;,&quot;resourceGroup&quot;:&quot;S_res_group_287114642182658_1560324290517&quot;},&quot;nodeDef&quot;:{},&quot;order&quot;:{&quot;hops&quot;:[{&quot;from&quot;:&quot;datahub_8htXSsfiS2vtZCVG&quot;,&quot;to&quot;:&quot;datahub_CRHBAyGfhSaLmv2f&quot;}]},&quot;setting&quot;:{&quot;errorLimit&quot;:{},&quot;jvmOption&quot;:&quot;&quot;},&quot;steps&quot;:[{&quot;stepType&quot;:&quot;datahub&quot;,&quot;category&quot;:&quot;writer&quot;,&quot;displayName&quot;:&quot;DataHub1&quot;,&quot;parameter&quot;:{&quot;batchSize&quot;:1000,&quot;datasource&quot;:&quot;datahub_cloud_dev_test&quot;,&quot;topic&quot;:&quot;dwd_tfc_opt_speed_rid_amap_rt&quot;},&quot;name&quot;:&quot;datahub_CRHBAyGfhSaLmv2f&quot;,&quot;gui&quot;:{&quot;x&quot;:262,&quot;y&quot;:325}},{&quot;stepType&quot;:&quot;datahub&quot;,&quot;displayName&quot;:&quot;DataHub2&quot;,&quot;parameter&quot;:{&quot;datasource&quot;:&quot;datahub_uric_test&quot;,&quot;topic&quot;:&quot;dwd_tfc_opt_speed_rid_amap_rt_330000&quot;,&quot;batchSize&quot;:1000},&quot;name&quot;:&quot;datahub_8htXSsfiS2vtZCVG&quot;,&quot;gui&quot;:{&quot;x&quot;:268,&quot;y&quot;:160.5},&quot;category&quot;:&quot;writer&quot;}]}</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The cause of the failure to obtain the details of the real-time synchronization task or data synchronization solution.</p>
         * <p>If the details of the real-time synchronization task or data synchronization solution are obtained, the value null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>fileId:[100] is invalid.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <ul>
         * <li>If the TaskType parameter is set to DI_REALTIME, the value null is returned.</li>
         * <li>If the TaskType parameter is set to DI_SOLUTION, the details of the data synchronization solution are returned.</li>
         * </ul>
         */
        @NameInMap("SolutionDetail")
        public GetDISyncTaskResponseBodyDataSolutionDetail solutionDetail;

        /**
         * <p>Indicates whether the details of the real-time synchronization task or data synchronization solution are obtained. Valid values:</p>
         * <p>success: The details are obtained. fail: The details fail to be obtained.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseBodyData self = new GetDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseBodyData setAlarmList(java.util.List<GetDISyncTaskResponseBodyDataAlarmList> alarmList) {
            this.alarmList = alarmList;
            return this;
        }
        public java.util.List<GetDISyncTaskResponseBodyDataAlarmList> getAlarmList() {
            return this.alarmList;
        }

        public GetDISyncTaskResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDISyncTaskResponseBodyData setSolutionDetail(GetDISyncTaskResponseBodyDataSolutionDetail solutionDetail) {
            this.solutionDetail = solutionDetail;
            return this;
        }
        public GetDISyncTaskResponseBodyDataSolutionDetail getSolutionDetail() {
            return this.solutionDetail;
        }

        public GetDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
