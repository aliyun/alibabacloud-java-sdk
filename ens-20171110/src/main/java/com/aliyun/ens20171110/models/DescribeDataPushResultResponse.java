// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataPushResultResponse extends TeaModel {
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

    @NameInMap("PushResults")
    @Validation(required = true)
    public DescribeDataPushResultResponsePushResults pushResults;

    public static DescribeDataPushResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataPushResultResponse self = new DescribeDataPushResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataPushResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataPushResultResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDataPushResultResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataPushResultResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataPushResultResponse setPushResults(DescribeDataPushResultResponsePushResults pushResults) {
        this.pushResults = pushResults;
        return this;
    }
    public DescribeDataPushResultResponsePushResults getPushResults() {
        return this.pushResults;
    }

    public static class DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIdsRegionId extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("StatusDescrip")
        @Validation(required = true)
        public String statusDescrip;

        public static DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIdsRegionId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIdsRegionId self = new DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIdsRegionId();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIdsRegionId setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIdsRegionId setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIdsRegionId setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIdsRegionId setStatusDescrip(String statusDescrip) {
            this.statusDescrip = statusDescrip;
            return this;
        }
        public String getStatusDescrip() {
            return this.statusDescrip;
        }

    }

    public static class DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIds extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public java.util.List<DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIdsRegionId> regionId;

        public static DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIds self = new DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIds setRegionId(java.util.List<DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIdsRegionId> regionId) {
            this.regionId = regionId;
            return this;
        }
        public java.util.List<DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIdsRegionId> getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStat extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RegionIdCount")
        @Validation(required = true)
        public Integer regionIdCount;

        @NameInMap("RegionIds")
        @Validation(required = true)
        public DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIds regionIds;

        public static DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStat build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStat self = new DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStat();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStat setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStat setRegionIdCount(Integer regionIdCount) {
            this.regionIdCount = regionIdCount;
            return this;
        }
        public Integer getRegionIdCount() {
            return this.regionIdCount;
        }

        public DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStat setRegionIds(DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIds regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStatRegionIds getRegionIds() {
            return this.regionIds;
        }

    }

    public static class DescribeDataPushResultResponsePushResultsPushResultStatusStatS extends TeaModel {
        @NameInMap("StatusStat")
        @Validation(required = true)
        public java.util.List<DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStat> statusStat;

        public static DescribeDataPushResultResponsePushResultsPushResultStatusStatS build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponsePushResultsPushResultStatusStatS self = new DescribeDataPushResultResponsePushResultsPushResultStatusStatS();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponsePushResultsPushResultStatusStatS setStatusStat(java.util.List<DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStat> statusStat) {
            this.statusStat = statusStat;
            return this;
        }
        public java.util.List<DescribeDataPushResultResponsePushResultsPushResultStatusStatSStatusStat> getStatusStat() {
            return this.statusStat;
        }

    }

    public static class DescribeDataPushResultResponsePushResultsPushResult extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("StatusStatS")
        @Validation(required = true)
        public DescribeDataPushResultResponsePushResultsPushResultStatusStatS statusStatS;

        public static DescribeDataPushResultResponsePushResultsPushResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponsePushResultsPushResult self = new DescribeDataPushResultResponsePushResultsPushResult();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponsePushResultsPushResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataPushResultResponsePushResultsPushResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeDataPushResultResponsePushResultsPushResult setStatusStatS(DescribeDataPushResultResponsePushResultsPushResultStatusStatS statusStatS) {
            this.statusStatS = statusStatS;
            return this;
        }
        public DescribeDataPushResultResponsePushResultsPushResultStatusStatS getStatusStatS() {
            return this.statusStatS;
        }

    }

    public static class DescribeDataPushResultResponsePushResults extends TeaModel {
        @NameInMap("PushResult")
        @Validation(required = true)
        public java.util.List<DescribeDataPushResultResponsePushResultsPushResult> pushResult;

        public static DescribeDataPushResultResponsePushResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataPushResultResponsePushResults self = new DescribeDataPushResultResponsePushResults();
            return TeaModel.build(map, self);
        }

        public DescribeDataPushResultResponsePushResults setPushResult(java.util.List<DescribeDataPushResultResponsePushResultsPushResult> pushResult) {
            this.pushResult = pushResult;
            return this;
        }
        public java.util.List<DescribeDataPushResultResponsePushResultsPushResult> getPushResult() {
            return this.pushResult;
        }

    }

}
