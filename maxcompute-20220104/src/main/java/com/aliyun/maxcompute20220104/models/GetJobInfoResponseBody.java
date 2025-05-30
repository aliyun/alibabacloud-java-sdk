// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetJobInfoResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public GetJobInfoResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>This object does not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: informational response. The request is received and is being processed.</li>
     * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
     * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
     * <li>4xx: client error. The request contains invalid request parameters and syntaxes, or specific request conditions cannot be met.</li>
     * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0be3e0bb16654558425251398e27a9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobInfoResponseBody self = new GetJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobInfoResponseBody setData(GetJobInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobInfoResponseBodyData getData() {
        return this.data;
    }

    public GetJobInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetJobInfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetJobInfoResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobInfoResponseBodyDataJobSubStatusList extends TeaModel {
        /**
         * <p>The encoding of the substatus.</p>
         * 
         * <strong>example:</strong>
         * <p>1010</p>
         */
        @NameInMap("code")
        public Integer code;

        /**
         * <p>The description of the substatus.</p>
         * 
         * <strong>example:</strong>
         * <p>Waiting for scheduling</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The start time of the substatus.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-05 00:04:15.717364 +0800</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetJobInfoResponseBodyDataJobSubStatusList build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataJobSubStatusList self = new GetJobInfoResponseBodyDataJobSubStatusList();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataJobSubStatusList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetJobInfoResponseBodyDataJobSubStatusList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetJobInfoResponseBodyDataJobSubStatusList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetJobInfoResponseBodyDataSceneResults extends TeaModel {
        /**
         * <p>The intelligent diagnostics result description.</p>
         * 
         * <strong>example:</strong>
         * <p>This job uses annual and monthly computing resources. It may be that the job is waiting for resources due to the large amount of overall job running data, many resources requested, and low job priority. Please go to Resource Consumption to view the specific situation. You can also go to Cost Optimization to see if you need to adjust resource configuration.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Information about the nodes where data skew or data expansion is detected. This parameter is returned only when the diagnostics scenario is data skew or data expansion.</p>
         */
        @NameInMap("params")
        public java.util.Map<String, String> params;

        /**
         * <p>The intelligent diagnostics result scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>LackResource</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The intelligent diagnostics result tag.</p>
         * 
         * <strong>example:</strong>
         * <p>SubscriptionLackResource</p>
         */
        @NameInMap("sceneTag")
        public String sceneTag;

        /**
         * <p>The intelligent diagnostics result summary.</p>
         * 
         * <strong>example:</strong>
         * <p>Insufficient computing resources available for the job. Click to view details.</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <p>The intelligent diagnostics result type.</p>
         * 
         * <strong>example:</strong>
         * <p>warning</p>
         */
        @NameInMap("type")
        public String type;

        public static GetJobInfoResponseBodyDataSceneResults build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyDataSceneResults self = new GetJobInfoResponseBodyDataSceneResults();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyDataSceneResults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetJobInfoResponseBodyDataSceneResults setParams(java.util.Map<String, String> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, String> getParams() {
            return this.params;
        }

        public GetJobInfoResponseBodyDataSceneResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetJobInfoResponseBodyDataSceneResults setSceneTag(String sceneTag) {
            this.sceneTag = sceneTag;
            return this;
        }
        public String getSceneTag() {
            return this.sceneTag;
        }

        public GetJobInfoResponseBodyDataSceneResults setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetJobInfoResponseBodyDataSceneResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetJobInfoResponseBodyData extends TeaModel {
        /**
         * <p>The amount of resources consumed by the job. This parameter is returned only for jobs that are complete.Unit: 100\*Core\*s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cuUsage")
        public Long cuUsage;

        /**
         * <p>The end time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1672112913</p>
         */
        @NameInMap("endAtTime")
        public Long endAtTime;

        /**
         * <p>The ID of the ancestor node.</p>
         * 
         * <strong>example:</strong>
         * <p>node_4</p>
         */
        @NameInMap("extNodeId")
        public String extNodeId;

        /**
         * <p>The Alibaba Cloud account ID of the task owner.</p>
         * 
         * <strong>example:</strong>
         * <p>duty_2</p>
         */
        @NameInMap("extNodeOnDuty")
        public String extNodeOnDuty;

        /**
         * <p>The upstream platform.</p>
         * 
         * <strong>example:</strong>
         * <p>platform_3</p>
         */
        @NameInMap("extPlantFrom")
        public String extPlantFrom;

        /**
         * <p>The amount of data scanned by the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("inputBytes")
        public Double inputBytes;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20230410****60gg</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The owner of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$7632***@aliyun.com</p>
         */
        @NameInMap("jobOwner")
        public String jobOwner;

        /**
         * <p>The substatuses of the job lifecycle.</p>
         */
        @NameInMap("jobSubStatusList")
        public java.util.List<GetJobInfoResponseBodyDataJobSubStatusList> jobSubStatusList;

        /**
         * <p>The type of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("jobType")
        public String jobType;

        /**
         * <p>The number of memory consumed by the job. This parameter is returned only for jobs that are complete.Unit: MB\*s.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("memoryUsage")
        public Long memoryUsage;

        /**
         * <p>The priority of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>dp_cdm_prod</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The nickname of the computing quota that is used by the job.</p>
         * 
         * <strong>example:</strong>
         * <p>os_bigdata</p>
         */
        @NameInMap("quotaNickname")
        public String quotaNickname;

        /**
         * <p>The quota type.</p>
         * 
         * <strong>example:</strong>
         * <p>subscription</p>
         */
        @NameInMap("quotaType")
        public String quotaType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The start time, which is the time when the job received the first batch of computing resources. For jobs that run for a short period of time or do not consume computing resources, such as the jobs that involve DDL statements, the job submission time is used instead.</p>
         * 
         * <strong>example:</strong>
         * <p>1672112113</p>
         */
        @NameInMap("runningAtTime")
        public Long runningAtTime;

        /**
         * <p>The execution duration, which is the duration from the start time to the end time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("runningTime")
        public Long runningTime;

        /**
         * <p>The intelligent diagnostics result.</p>
         */
        @NameInMap("sceneResults")
        public java.util.List<GetJobInfoResponseBodyDataSceneResults> sceneResults;

        /**
         * <p>The signature of the SQL job. You can use the signature to find the instances on which each time an SQL statement is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>20c1efb4a7caca1865f4aa784bb500efae74af04</p>
         */
        @NameInMap("signature")
        public String signature;

        /**
         * <p>The job status.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>1672112013</p>
         */
        @NameInMap("submittedAtTime")
        public Long submittedAtTime;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4784****5249</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The total duration from the time a job is submitted to the time the job is terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("totalTime")
        public Long totalTime;

        /**
         * <p>The wait time, which is the duration from the time the job is submitted to the time the job starts to run.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("waitingTime")
        public Long waitingTime;

        public static GetJobInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyData self = new GetJobInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyData setCuUsage(Long cuUsage) {
            this.cuUsage = cuUsage;
            return this;
        }
        public Long getCuUsage() {
            return this.cuUsage;
        }

        public GetJobInfoResponseBodyData setEndAtTime(Long endAtTime) {
            this.endAtTime = endAtTime;
            return this;
        }
        public Long getEndAtTime() {
            return this.endAtTime;
        }

        public GetJobInfoResponseBodyData setExtNodeId(String extNodeId) {
            this.extNodeId = extNodeId;
            return this;
        }
        public String getExtNodeId() {
            return this.extNodeId;
        }

        public GetJobInfoResponseBodyData setExtNodeOnDuty(String extNodeOnDuty) {
            this.extNodeOnDuty = extNodeOnDuty;
            return this;
        }
        public String getExtNodeOnDuty() {
            return this.extNodeOnDuty;
        }

        public GetJobInfoResponseBodyData setExtPlantFrom(String extPlantFrom) {
            this.extPlantFrom = extPlantFrom;
            return this;
        }
        public String getExtPlantFrom() {
            return this.extPlantFrom;
        }

        public GetJobInfoResponseBodyData setInputBytes(Double inputBytes) {
            this.inputBytes = inputBytes;
            return this;
        }
        public Double getInputBytes() {
            return this.inputBytes;
        }

        public GetJobInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetJobInfoResponseBodyData setJobOwner(String jobOwner) {
            this.jobOwner = jobOwner;
            return this;
        }
        public String getJobOwner() {
            return this.jobOwner;
        }

        public GetJobInfoResponseBodyData setJobSubStatusList(java.util.List<GetJobInfoResponseBodyDataJobSubStatusList> jobSubStatusList) {
            this.jobSubStatusList = jobSubStatusList;
            return this;
        }
        public java.util.List<GetJobInfoResponseBodyDataJobSubStatusList> getJobSubStatusList() {
            return this.jobSubStatusList;
        }

        public GetJobInfoResponseBodyData setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetJobInfoResponseBodyData setMemoryUsage(Long memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        public GetJobInfoResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public GetJobInfoResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetJobInfoResponseBodyData setQuotaNickname(String quotaNickname) {
            this.quotaNickname = quotaNickname;
            return this;
        }
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

        public GetJobInfoResponseBodyData setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public GetJobInfoResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetJobInfoResponseBodyData setRunningAtTime(Long runningAtTime) {
            this.runningAtTime = runningAtTime;
            return this;
        }
        public Long getRunningAtTime() {
            return this.runningAtTime;
        }

        public GetJobInfoResponseBodyData setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public GetJobInfoResponseBodyData setSceneResults(java.util.List<GetJobInfoResponseBodyDataSceneResults> sceneResults) {
            this.sceneResults = sceneResults;
            return this;
        }
        public java.util.List<GetJobInfoResponseBodyDataSceneResults> getSceneResults() {
            return this.sceneResults;
        }

        public GetJobInfoResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetJobInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobInfoResponseBodyData setSubmittedAtTime(Long submittedAtTime) {
            this.submittedAtTime = submittedAtTime;
            return this;
        }
        public Long getSubmittedAtTime() {
            return this.submittedAtTime;
        }

        public GetJobInfoResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetJobInfoResponseBodyData setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public GetJobInfoResponseBodyData setWaitingTime(Long waitingTime) {
            this.waitingTime = waitingTime;
            return this;
        }
        public Long getWaitingTime() {
            return this.waitingTime;
        }

    }

}
