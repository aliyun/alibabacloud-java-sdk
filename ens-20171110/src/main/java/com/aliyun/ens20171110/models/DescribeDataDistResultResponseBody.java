// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDistResultResponseBody extends TeaModel {
    /**
     * <p>The distribution status of data files on edge instances.</p>
     */
    @NameInMap("DistResults")
    public DescribeDataDistResultResponseBodyDistResults distResults;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50373E71-7710-4620-8AAB-133CCE49451C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataDistResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataDistResultResponseBody self = new DescribeDataDistResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataDistResultResponseBody setDistResults(DescribeDataDistResultResponseBodyDistResults distResults) {
        this.distResults = distResults;
        return this;
    }
    public DescribeDataDistResultResponseBodyDistResults getDistResults() {
        return this.distResults;
    }

    public DescribeDataDistResultResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataDistResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataDistResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataDistResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstancesInstance extends TeaModel {
        /**
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>i-5qzje8f5un1wmi341m2yetaxv</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The start time of the distribution. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-19T07:24:52Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The description of the distribution status.</p>
         */
        @NameInMap("StatusDescrip")
        public String statusDescrip;

        /**
         * <p>The time when the distribution status was last updated. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-11T02:38:19Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstancesInstance self = new DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstancesInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstancesInstance setStatusDescrip(String statusDescrip) {
            this.statusDescrip = statusDescrip;
            return this;
        }
        public String getStatusDescrip() {
            return this.statusDescrip;
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstancesInstance setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstancesInstance> instance;

        public static DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstances self = new DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstances setInstance(java.util.List<DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstancesInstance> getInstance() {
            return this.instance;
        }

    }

    public static class DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStat extends TeaModel {
        /**
         * <p>The number of associated edge instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InstanceCount")
        public String instanceCount;

        /**
         * <p>The distribution status of the edge instance.</p>
         */
        @NameInMap("Instances")
        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstances instances;

        /**
         * <p>The distribution status. The value is of the enumeration type. Valid values:</p>
         * <ul>
         * <li>SUCCESS: The distribution is successful.</li>
         * <li>FAILED: The distribution failed.</li>
         * <li>DISTING: The data is being distributed.</li>
         * <li>POD_RESTARTING: The idle pod is being restarted.</li>
         * <li>DELETED: The data is cleared or removed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStat build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStat self = new DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStat();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStat setInstanceCount(String instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public String getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStat setInstances(DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstances instances) {
            this.instances = instances;
            return this;
        }
        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStatInstances getInstances() {
            return this.instances;
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStat setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDataDistResultResponseBodyDistResultsDistResultStatusStats extends TeaModel {
        @NameInMap("StatusStat")
        public java.util.List<DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStat> statusStat;

        public static DescribeDataDistResultResponseBodyDistResultsDistResultStatusStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseBodyDistResultsDistResultStatusStats self = new DescribeDataDistResultResponseBodyDistResultsDistResultStatusStats();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStats setStatusStat(java.util.List<DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStat> statusStat) {
            this.statusStat = statusStat;
            return this;
        }
        public java.util.List<DescribeDataDistResultResponseBodyDistResultsDistResultStatusStatsStatusStat> getStatusStat() {
            return this.statusStat;
        }

    }

    public static class DescribeDataDistResultResponseBodyDistResultsDistResult extends TeaModel {
        /**
         * <p>The name of the data file.</p>
         * 
         * <strong>example:</strong>
         * <p>gcs-prod-websocket-eip-unicom</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The distribution status statistics.</p>
         */
        @NameInMap("StatusStats")
        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStats statusStats;

        /**
         * <p>The version number of the data file.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeDataDistResultResponseBodyDistResultsDistResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseBodyDistResultsDistResult self = new DescribeDataDistResultResponseBodyDistResultsDistResult();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResult setStatusStats(DescribeDataDistResultResponseBodyDistResultsDistResultStatusStats statusStats) {
            this.statusStats = statusStats;
            return this;
        }
        public DescribeDataDistResultResponseBodyDistResultsDistResultStatusStats getStatusStats() {
            return this.statusStats;
        }

        public DescribeDataDistResultResponseBodyDistResultsDistResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeDataDistResultResponseBodyDistResults extends TeaModel {
        @NameInMap("DistResult")
        public java.util.List<DescribeDataDistResultResponseBodyDistResultsDistResult> distResult;

        public static DescribeDataDistResultResponseBodyDistResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataDistResultResponseBodyDistResults self = new DescribeDataDistResultResponseBodyDistResults();
            return TeaModel.build(map, self);
        }

        public DescribeDataDistResultResponseBodyDistResults setDistResult(java.util.List<DescribeDataDistResultResponseBodyDistResultsDistResult> distResult) {
            this.distResult = distResult;
            return this;
        }
        public java.util.List<DescribeDataDistResultResponseBodyDistResultsDistResult> getDistResult() {
            return this.distResult;
        }

    }

}
