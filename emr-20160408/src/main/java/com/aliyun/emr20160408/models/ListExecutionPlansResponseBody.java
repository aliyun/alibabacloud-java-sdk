// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListExecutionPlansResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ExecutionPlans")
    public ListExecutionPlansResponseBodyExecutionPlans executionPlans;

    public static ListExecutionPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionPlansResponseBody self = new ListExecutionPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutionPlansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListExecutionPlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExecutionPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExecutionPlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExecutionPlansResponseBody setExecutionPlans(ListExecutionPlansResponseBodyExecutionPlans executionPlans) {
        this.executionPlans = executionPlans;
        return this;
    }
    public ListExecutionPlansResponseBodyExecutionPlans getExecutionPlans() {
        return this.executionPlans;
    }

    public static class ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TimeInterval")
        public Integer timeInterval;

        @NameInMap("Stragety")
        public String stragety;

        @NameInMap("CreateClusterOnDemand")
        public Boolean createClusterOnDemand;

        @NameInMap("Name")
        public String name;

        @NameInMap("TimeUnit")
        public String timeUnit;

        @NameInMap("Id")
        public String id;

        public static ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo self = new ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo();
            return TeaModel.build(map, self);
        }

        public ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo setStragety(String stragety) {
            this.stragety = stragety;
            return this;
        }
        public String getStragety() {
            return this.stragety;
        }

        public ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo setCreateClusterOnDemand(Boolean createClusterOnDemand) {
            this.createClusterOnDemand = createClusterOnDemand;
            return this;
        }
        public Boolean getCreateClusterOnDemand() {
            return this.createClusterOnDemand;
        }

        public ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListExecutionPlansResponseBodyExecutionPlans extends TeaModel {
        @NameInMap("ExecutionPlanInfo")
        public java.util.List<ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo> executionPlanInfo;

        public static ListExecutionPlansResponseBodyExecutionPlans build(java.util.Map<String, ?> map) throws Exception {
            ListExecutionPlansResponseBodyExecutionPlans self = new ListExecutionPlansResponseBodyExecutionPlans();
            return TeaModel.build(map, self);
        }

        public ListExecutionPlansResponseBodyExecutionPlans setExecutionPlanInfo(java.util.List<ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo> executionPlanInfo) {
            this.executionPlanInfo = executionPlanInfo;
            return this;
        }
        public java.util.List<ListExecutionPlansResponseBodyExecutionPlansExecutionPlanInfo> getExecutionPlanInfo() {
            return this.executionPlanInfo;
        }

    }

}
