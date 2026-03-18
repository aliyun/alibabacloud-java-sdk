// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobInfosResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListJobInfosResponseBodyData data;

    /**
     * <p>Indicates whether the business logic was successful. A value other than 200 indicates a failure.</p>
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
     * <p>0bc13a9516807484336515320e38f5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListJobInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobInfosResponseBody self = new ListJobInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobInfosResponseBody setData(ListJobInfosResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobInfosResponseBodyData getData() {
        return this.data;
    }

    public ListJobInfosResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListJobInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListJobInfosResponseBodyDataJobInfoListSceneResults extends TeaModel {
        /**
         * <p>The details of the smart diagnosis result.</p>
         * 
         * <strong>example:</strong>
         * <p>This job uses annual and monthly computing resources. It may be that the job is waiting for resources due to the large amount of overall job running data, many resources requested, and low job priority. Please go to Resource Consumption to view the specific situation. You can also go to Cost Optimization to see if you need to adjust resource configuration.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Information about the nodes that have data skew or data bloat. This parameter is returned only when the diagnosis scenario is data skew or data bloat.</p>
         */
        @NameInMap("params")
        public java.util.Map<String, String> params;

        /**
         * <p>The scenario of the smart diagnosis result.</p>
         * 
         * <strong>example:</strong>
         * <p>LackResource</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The tag of the smart diagnosis result.</p>
         * 
         * <strong>example:</strong>
         * <p>SubscriptionLackResource</p>
         */
        @NameInMap("sceneTag")
        public String sceneTag;

        /**
         * <p>A summary of the smart diagnosis result.</p>
         * 
         * <strong>example:</strong>
         * <p>Insufficient computing resources available for the job. Click to view details.</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <p>The type of the smart diagnosis result.</p>
         * 
         * <strong>example:</strong>
         * <p>warning</p>
         */
        @NameInMap("type")
        public String type;

        public static ListJobInfosResponseBodyDataJobInfoListSceneResults build(java.util.Map<String, ?> map) throws Exception {
            ListJobInfosResponseBodyDataJobInfoListSceneResults self = new ListJobInfosResponseBodyDataJobInfoListSceneResults();
            return TeaModel.build(map, self);
        }

        public ListJobInfosResponseBodyDataJobInfoListSceneResults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJobInfosResponseBodyDataJobInfoListSceneResults setParams(java.util.Map<String, String> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, String> getParams() {
            return this.params;
        }

        public ListJobInfosResponseBodyDataJobInfoListSceneResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListJobInfosResponseBodyDataJobInfoListSceneResults setSceneTag(String sceneTag) {
            this.sceneTag = sceneTag;
            return this;
        }
        public String getSceneTag() {
            return this.sceneTag;
        }

        public ListJobInfosResponseBodyDataJobInfoListSceneResults setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListJobInfosResponseBodyDataJobInfoListSceneResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListJobInfosResponseBodyDataJobInfoList extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AY20A</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The proportion of CUs in the job snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>0.48</p>
         */
        @NameInMap("cuSnapshot")
        public Double cuSnapshot;

        /**
         * <p>The total CUs used.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cuUsage")
        public Long cuUsage;

        /**
         * <p>The time when the job finished.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("endAtTime")
        public Long endAtTime;

        /**
         * <p>The ID of the DataWorks node.</p>
         * 
         * <strong>example:</strong>
         * <p>node_4</p>
         */
        @NameInMap("extNodeId")
        public String extNodeId;

        @NameInMap("extNodeName")
        public String extNodeName;

        /**
         * <p>The person in charge of the execution.</p>
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

        @NameInMap("extPlatformId")
        public String extPlatformId;

        /**
         * <p>The amount of data scanned by the job. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("inputBytes")
        public Double inputBytes;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20230410050036549gfmsdwf60gg</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The account that submitted the job.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$<a href="mailto:xxx@test.aliyunid.com">xxx@test.aliyunid.com</a></p>
         */
        @NameInMap("jobOwner")
        public String jobOwner;

        /**
         * <p>The job type.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("jobType")
        public String jobType;

        /**
         * <p>The proportion of memory in the job snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>0.42</p>
         */
        @NameInMap("memorySnapshot")
        public Double memorySnapshot;

        /**
         * <p>The total memory used.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("memoryUsage")
        public Long memoryUsage;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <p>The name of the MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>openrec_new</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The nickname of the quota that the job uses.</p>
         * 
         * <strong>example:</strong>
         * <p>my_quota</p>
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
         * <p>The time when the job started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>1672112113</p>
         */
        @NameInMap("runningAtTime")
        public Long runningAtTime;

        /**
         * <p>The runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("runningTime")
        public Long runningTime;

        /**
         * <p>The smart diagnosis results.</p>
         */
        @NameInMap("sceneResults")
        public java.util.List<ListJobInfosResponseBodyDataJobInfoListSceneResults> sceneResults;

        /**
         * <p>The SQL signature.</p>
         * 
         * <strong>example:</strong>
         * <p>i094KijGrN3kOXZ74kbexB77XQY=</p>
         */
        @NameInMap("signature")
        public String signature;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The status of the job snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("statusSnapshot")
        public String statusSnapshot;

        /**
         * <p>The time when the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>1672112013</p>
         */
        @NameInMap("submittedAtTime")
        public Long submittedAtTime;

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("tags")
        public String tags;

        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>213065738244354</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The total runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("totalTime")
        public Long totalTime;

        /**
         * <p>The waiting time.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("waitingTime")
        public Long waitingTime;

        public static ListJobInfosResponseBodyDataJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListJobInfosResponseBodyDataJobInfoList self = new ListJobInfosResponseBodyDataJobInfoList();
            return TeaModel.build(map, self);
        }

        public ListJobInfosResponseBodyDataJobInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListJobInfosResponseBodyDataJobInfoList setCuSnapshot(Double cuSnapshot) {
            this.cuSnapshot = cuSnapshot;
            return this;
        }
        public Double getCuSnapshot() {
            return this.cuSnapshot;
        }

        public ListJobInfosResponseBodyDataJobInfoList setCuUsage(Long cuUsage) {
            this.cuUsage = cuUsage;
            return this;
        }
        public Long getCuUsage() {
            return this.cuUsage;
        }

        public ListJobInfosResponseBodyDataJobInfoList setEndAtTime(Long endAtTime) {
            this.endAtTime = endAtTime;
            return this;
        }
        public Long getEndAtTime() {
            return this.endAtTime;
        }

        public ListJobInfosResponseBodyDataJobInfoList setExtNodeId(String extNodeId) {
            this.extNodeId = extNodeId;
            return this;
        }
        public String getExtNodeId() {
            return this.extNodeId;
        }

        public ListJobInfosResponseBodyDataJobInfoList setExtNodeName(String extNodeName) {
            this.extNodeName = extNodeName;
            return this;
        }
        public String getExtNodeName() {
            return this.extNodeName;
        }

        public ListJobInfosResponseBodyDataJobInfoList setExtNodeOnDuty(String extNodeOnDuty) {
            this.extNodeOnDuty = extNodeOnDuty;
            return this;
        }
        public String getExtNodeOnDuty() {
            return this.extNodeOnDuty;
        }

        public ListJobInfosResponseBodyDataJobInfoList setExtPlantFrom(String extPlantFrom) {
            this.extPlantFrom = extPlantFrom;
            return this;
        }
        public String getExtPlantFrom() {
            return this.extPlantFrom;
        }

        public ListJobInfosResponseBodyDataJobInfoList setExtPlatformId(String extPlatformId) {
            this.extPlatformId = extPlatformId;
            return this;
        }
        public String getExtPlatformId() {
            return this.extPlatformId;
        }

        public ListJobInfosResponseBodyDataJobInfoList setInputBytes(Double inputBytes) {
            this.inputBytes = inputBytes;
            return this;
        }
        public Double getInputBytes() {
            return this.inputBytes;
        }

        public ListJobInfosResponseBodyDataJobInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListJobInfosResponseBodyDataJobInfoList setJobOwner(String jobOwner) {
            this.jobOwner = jobOwner;
            return this;
        }
        public String getJobOwner() {
            return this.jobOwner;
        }

        public ListJobInfosResponseBodyDataJobInfoList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListJobInfosResponseBodyDataJobInfoList setMemorySnapshot(Double memorySnapshot) {
            this.memorySnapshot = memorySnapshot;
            return this;
        }
        public Double getMemorySnapshot() {
            return this.memorySnapshot;
        }

        public ListJobInfosResponseBodyDataJobInfoList setMemoryUsage(Long memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        public ListJobInfosResponseBodyDataJobInfoList setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ListJobInfosResponseBodyDataJobInfoList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListJobInfosResponseBodyDataJobInfoList setQuotaNickname(String quotaNickname) {
            this.quotaNickname = quotaNickname;
            return this;
        }
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

        public ListJobInfosResponseBodyDataJobInfoList setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public ListJobInfosResponseBodyDataJobInfoList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListJobInfosResponseBodyDataJobInfoList setRunningAtTime(Long runningAtTime) {
            this.runningAtTime = runningAtTime;
            return this;
        }
        public Long getRunningAtTime() {
            return this.runningAtTime;
        }

        public ListJobInfosResponseBodyDataJobInfoList setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public ListJobInfosResponseBodyDataJobInfoList setSceneResults(java.util.List<ListJobInfosResponseBodyDataJobInfoListSceneResults> sceneResults) {
            this.sceneResults = sceneResults;
            return this;
        }
        public java.util.List<ListJobInfosResponseBodyDataJobInfoListSceneResults> getSceneResults() {
            return this.sceneResults;
        }

        public ListJobInfosResponseBodyDataJobInfoList setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public ListJobInfosResponseBodyDataJobInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobInfosResponseBodyDataJobInfoList setStatusSnapshot(String statusSnapshot) {
            this.statusSnapshot = statusSnapshot;
            return this;
        }
        public String getStatusSnapshot() {
            return this.statusSnapshot;
        }

        public ListJobInfosResponseBodyDataJobInfoList setSubmittedAtTime(Long submittedAtTime) {
            this.submittedAtTime = submittedAtTime;
            return this;
        }
        public Long getSubmittedAtTime() {
            return this.submittedAtTime;
        }

        public ListJobInfosResponseBodyDataJobInfoList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListJobInfosResponseBodyDataJobInfoList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListJobInfosResponseBodyDataJobInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListJobInfosResponseBodyDataJobInfoList setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public ListJobInfosResponseBodyDataJobInfoList setWaitingTime(Long waitingTime) {
            this.waitingTime = waitingTime;
            return this;
        }
        public Long getWaitingTime() {
            return this.waitingTime;
        }

    }

    public static class ListJobInfosResponseBodyData extends TeaModel {
        /**
         * <p>The list of job information.</p>
         */
        @NameInMap("jobInfoList")
        public java.util.List<ListJobInfosResponseBodyDataJobInfoList> jobInfoList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListJobInfosResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobInfosResponseBodyData self = new ListJobInfosResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobInfosResponseBodyData setJobInfoList(java.util.List<ListJobInfosResponseBodyDataJobInfoList> jobInfoList) {
            this.jobInfoList = jobInfoList;
            return this;
        }
        public java.util.List<ListJobInfosResponseBodyDataJobInfoList> getJobInfoList() {
            return this.jobInfoList;
        }

        public ListJobInfosResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListJobInfosResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListJobInfosResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
