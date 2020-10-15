// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDistResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("DistResults")
    @Validation(required = true)
    public DescribeDataDistResultResponseDistResults distResults;

    public static DescribeDataDistResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataDistResultResponse self = new DescribeDataDistResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataDistResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataDistResultResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDataDistResultResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataDistResultResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataDistResultResponse setDistResults(DescribeDataDistResultResponseDistResults distResults) {
        this.distResults = distResults;
        return this;
    }
    public DescribeDataDistResultResponseDistResults getDistResults() {
        return this.distResults;
    }

    public static class DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("StatusDescrip")
        @Validation(required = true)
        public String statusDescrip;

        public static DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstancesInstance self = new DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstancesInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstancesInstance setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstancesInstance setStatusDescrip(String statusDescrip) {
            this.statusDescrip = statusDescrip;
            return this;
        }
        public String getStatusDescrip() {
            return this.statusDescrip;
        }

    }

    public static class DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstancesInstance> instance;

        public static DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstances self = new DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstances setInstance(java.util.List<DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstancesInstance> getInstance() {
            return this.instance;
        }

    }

    public static class DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStat extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("InstanceCount")
        @Validation(required = true)
        public String instanceCount;

        @NameInMap("Instances")
        @Validation(required = true)
        public DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstances instances;

        public static DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStat build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStat self = new DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStat();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStat setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStat setInstanceCount(String instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public String getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStat setInstances(DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstances instances) {
            this.instances = instances;
            return this;
        }
        public DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStatInstances getInstances() {
            return this.instances;
        }

    }

    public static class DescribeDataDistResultResponseDistResultsDistResultStatusStats extends TeaModel {
        @NameInMap("StatusStat")
        @Validation(required = true)
        public java.util.List<DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStat> statusStat;

        public static DescribeDataDistResultResponseDistResultsDistResultStatusStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseDistResultsDistResultStatusStats self = new DescribeDataDistResultResponseDistResultsDistResultStatusStats();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseDistResultsDistResultStatusStats setStatusStat(java.util.List<DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStat> statusStat) {
            this.statusStat = statusStat;
            return this;
        }
        public java.util.List<DescribeDataDistResultResponseDistResultsDistResultStatusStatsStatusStat> getStatusStat() {
            return this.statusStat;
        }

    }

    public static class DescribeDataDistResultResponseDistResultsDistResult extends TeaModel {
        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("StatusStats")
        @Validation(required = true)
        public DescribeDataDistResultResponseDistResultsDistResultStatusStats statusStats;

        public static DescribeDataDistResultResponseDistResultsDistResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseDistResultsDistResult self = new DescribeDataDistResultResponseDistResultsDistResult();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseDistResultsDistResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeDataDistResultResponseDistResultsDistResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataDistResultResponseDistResultsDistResult setStatusStats(DescribeDataDistResultResponseDistResultsDistResultStatusStats statusStats) {
            this.statusStats = statusStats;
            return this;
        }
        public DescribeDataDistResultResponseDistResultsDistResultStatusStats getStatusStats() {
            return this.statusStats;
        }

    }

    public static class DescribeDataDistResultResponseDistResults extends TeaModel {
        @NameInMap("DistResult")
        @Validation(required = true)
        public java.util.List<DescribeDataDistResultResponseDistResultsDistResult> distResult;

        public static DescribeDataDistResultResponseDistResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseDistResults self = new DescribeDataDistResultResponseDistResults();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseDistResults setDistResult(java.util.List<DescribeDataDistResultResponseDistResultsDistResult> distResult) {
            this.distResult = distResult;
            return this;
        }
        public java.util.List<DescribeDataDistResultResponseDistResultsDistResult> getDistResult() {
            return this.distResult;
        }

    }

}
