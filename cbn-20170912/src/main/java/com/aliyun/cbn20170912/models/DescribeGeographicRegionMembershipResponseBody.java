// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGeographicRegionMembershipResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionIds")
    public java.util.List<DescribeGeographicRegionMembershipResponseBodyRegionIds> regionIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeGeographicRegionMembershipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeographicRegionMembershipResponseBody self = new DescribeGeographicRegionMembershipResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGeographicRegionMembershipResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGeographicRegionMembershipResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGeographicRegionMembershipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGeographicRegionMembershipResponseBody setRegionIds(java.util.List<DescribeGeographicRegionMembershipResponseBodyRegionIds> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<DescribeGeographicRegionMembershipResponseBodyRegionIds> getRegionIds() {
        return this.regionIds;
    }

    public DescribeGeographicRegionMembershipResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeGeographicRegionMembershipResponseBodyRegionIds extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeGeographicRegionMembershipResponseBodyRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeGeographicRegionMembershipResponseBodyRegionIds self = new DescribeGeographicRegionMembershipResponseBodyRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeGeographicRegionMembershipResponseBodyRegionIds setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
