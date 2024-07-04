// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataPushResultResponseBody extends TeaModel {
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
     * <p>The push results of data files.</p>
     */
    @NameInMap("PushResults")
    public DescribeDataPushResultResponseBodyPushResults pushResults;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataPushResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataPushResultResponseBody self = new DescribeDataPushResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataPushResultResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataPushResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataPushResultResponseBody setPushResults(DescribeDataPushResultResponseBodyPushResults pushResults) {
        this.pushResults = pushResults;
        return this;
    }
    public DescribeDataPushResultResponseBodyPushResults getPushResults() {
        return this.pushResults;
    }

    public DescribeDataPushResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataPushResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIdsRegionId extends TeaModel {
        /**
         * <p>The ID of the ENS node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wuxi-5</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The start time of the push operation. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-28T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The description of the status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("StatusDescrip")
        public String statusDescrip;

        /**
         * <p>The time when the status was last updated. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-07T02:37:10Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIdsRegionId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIdsRegionId self = new DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIdsRegionId();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIdsRegionId setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIdsRegionId setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIdsRegionId setStatusDescrip(String statusDescrip) {
            this.statusDescrip = statusDescrip;
            return this;
        }
        public String getStatusDescrip() {
            return this.statusDescrip;
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIdsRegionId setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIds extends TeaModel {
        @NameInMap("RegionId")
        public java.util.List<DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIdsRegionId> regionId;

        public static DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIds self = new DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIds setRegionId(java.util.List<DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIdsRegionId> regionId) {
            this.regionId = regionId;
            return this;
        }
        public java.util.List<DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIdsRegionId> getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStat extends TeaModel {
        /**
         * <p>The total number of ENS nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RegionIdCount")
        public Integer regionIdCount;

        /**
         * <p>The push status of data files on the ENS node.</p>
         */
        @NameInMap("RegionIds")
        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIds regionIds;

        /**
         * <p>The push status. The value is of the enumeration type. Valid values: SUCCESS FAILED PUSHING</p>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStat build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStat self = new DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStat();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStat setRegionIdCount(Integer regionIdCount) {
            this.regionIdCount = regionIdCount;
            return this;
        }
        public Integer getRegionIdCount() {
            return this.regionIdCount;
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStat setRegionIds(DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIds regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIds getRegionIds() {
            return this.regionIds;
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStat setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatS extends TeaModel {
        @NameInMap("StatusStat")
        public java.util.List<DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStat> statusStat;

        public static DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatS build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatS self = new DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatS();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatS setStatusStat(java.util.List<DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStat> statusStat) {
            this.statusStat = statusStat;
            return this;
        }
        public java.util.List<DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStat> getStatusStat() {
            return this.statusStat;
        }

    }

    public static class DescribeDataPushResultResponseBodyPushResultsPushResult extends TeaModel {
        /**
         * <p>The name of the data file.</p>
         * 
         * <strong>example:</strong>
         * <p>gcs-pre-websocket-eip-telecom</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The push status of data files.</p>
         */
        @NameInMap("StatusStatS")
        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatS statusStatS;

        /**
         * <p>The version number of the data file.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeDataPushResultResponseBodyPushResultsPushResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponseBodyPushResultsPushResult self = new DescribeDataPushResultResponseBodyPushResultsPushResult();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResult setStatusStatS(DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatS statusStatS) {
            this.statusStatS = statusStatS;
            return this;
        }
        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatS getStatusStatS() {
            return this.statusStatS;
        }

        public DescribeDataPushResultResponseBodyPushResultsPushResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeDataPushResultResponseBodyPushResults extends TeaModel {
        @NameInMap("PushResult")
        public java.util.List<DescribeDataPushResultResponseBodyPushResultsPushResult> pushResult;

        public static DescribeDataPushResultResponseBodyPushResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponseBodyPushResults self = new DescribeDataPushResultResponseBodyPushResults();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponseBodyPushResults setPushResult(java.util.List<DescribeDataPushResultResponseBodyPushResultsPushResult> pushResult) {
            this.pushResult = pushResult;
            return this;
        }
        public java.util.List<DescribeDataPushResultResponseBodyPushResultsPushResult> getPushResult() {
            return this.pushResult;
        }

    }

}
