// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    @NameInMap("Instances")
    public ListInstanceResponseBodyInstances instances;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponseBody self = new ListInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResponseBody setInstances(ListInstanceResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public ListInstanceResponseBodyInstances getInstances() {
        return this.instances;
    }

    public ListInstanceResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListInstanceResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListInstanceResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("ActualState")
        public String actualState;

        @NameInMap("ApiType")
        public String apiType;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Code")
        public String code;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EngineJobHandler")
        public String engineJobHandler;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpectState")
        public String expectState;

        /**
         * <p>InstanceID</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("InputDelay")
        public Long inputDelay;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("LastErrorMessage")
        public String lastErrorMessage;

        @NameInMap("LastErrorTime")
        public Long lastErrorTime;

        @NameInMap("LastOperateTime")
        public Long lastOperateTime;

        @NameInMap("LastOperator")
        public String lastOperator;

        @NameInMap("Packages")
        public String packages;

        @NameInMap("PlanJson")
        public String planJson;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Starter")
        public String starter;

        public static ListInstanceResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyInstancesInstance self = new ListInstanceResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyInstancesInstance setActualState(String actualState) {
            this.actualState = actualState;
            return this;
        }
        public String getActualState() {
            return this.actualState;
        }

        public ListInstanceResponseBodyInstancesInstance setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public ListInstanceResponseBodyInstancesInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListInstanceResponseBodyInstancesInstance setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListInstanceResponseBodyInstancesInstance setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListInstanceResponseBodyInstancesInstance setEngineJobHandler(String engineJobHandler) {
            this.engineJobHandler = engineJobHandler;
            return this;
        }
        public String getEngineJobHandler() {
            return this.engineJobHandler;
        }

        public ListInstanceResponseBodyInstancesInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public ListInstanceResponseBodyInstancesInstance setExpectState(String expectState) {
            this.expectState = expectState;
            return this;
        }
        public String getExpectState() {
            return this.expectState;
        }

        public ListInstanceResponseBodyInstancesInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListInstanceResponseBodyInstancesInstance setInputDelay(Long inputDelay) {
            this.inputDelay = inputDelay;
            return this;
        }
        public Long getInputDelay() {
            return this.inputDelay;
        }

        public ListInstanceResponseBodyInstancesInstance setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListInstanceResponseBodyInstancesInstance setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListInstanceResponseBodyInstancesInstance setLastErrorMessage(String lastErrorMessage) {
            this.lastErrorMessage = lastErrorMessage;
            return this;
        }
        public String getLastErrorMessage() {
            return this.lastErrorMessage;
        }

        public ListInstanceResponseBodyInstancesInstance setLastErrorTime(Long lastErrorTime) {
            this.lastErrorTime = lastErrorTime;
            return this;
        }
        public Long getLastErrorTime() {
            return this.lastErrorTime;
        }

        public ListInstanceResponseBodyInstancesInstance setLastOperateTime(Long lastOperateTime) {
            this.lastOperateTime = lastOperateTime;
            return this;
        }
        public Long getLastOperateTime() {
            return this.lastOperateTime;
        }

        public ListInstanceResponseBodyInstancesInstance setLastOperator(String lastOperator) {
            this.lastOperator = lastOperator;
            return this;
        }
        public String getLastOperator() {
            return this.lastOperator;
        }

        public ListInstanceResponseBodyInstancesInstance setPackages(String packages) {
            this.packages = packages;
            return this;
        }
        public String getPackages() {
            return this.packages;
        }

        public ListInstanceResponseBodyInstancesInstance setPlanJson(String planJson) {
            this.planJson = planJson;
            return this;
        }
        public String getPlanJson() {
            return this.planJson;
        }

        public ListInstanceResponseBodyInstancesInstance setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListInstanceResponseBodyInstancesInstance setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListInstanceResponseBodyInstancesInstance setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListInstanceResponseBodyInstancesInstance setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListInstanceResponseBodyInstancesInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListInstanceResponseBodyInstancesInstance setStarter(String starter) {
            this.starter = starter;
            return this;
        }
        public String getStarter() {
            return this.starter;
        }

    }

    public static class ListInstanceResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<ListInstanceResponseBodyInstancesInstance> instance;

        public static ListInstanceResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyInstances self = new ListInstanceResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyInstances setInstance(java.util.List<ListInstanceResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<ListInstanceResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
