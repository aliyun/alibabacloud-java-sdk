// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataPushResultResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PushResults")
    public DescribeDataPushResultResponseBodyPushResults pushResults;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StatusDescrip")
        public String statusDescrip;

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
        @NameInMap("RegionIdCount")
        public Integer regionIdCount;

        @NameInMap("RegionIds")
        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatSStatusStatRegionIds regionIds;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("StatusStatS")
        public DescribeDataPushResultResponseBodyPushResultsPushResultStatusStatS statusStatS;

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
