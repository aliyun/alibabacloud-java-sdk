// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGeographicRegionMembershipResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of regions.</p>
     */
    @NameInMap("RegionIds")
    public DescribeGeographicRegionMembershipResponseBodyRegionIds regionIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DC9EB0C9-60AF-4A09-A36C-608F70130274</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGeographicRegionMembershipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeographicRegionMembershipResponseBody self = new DescribeGeographicRegionMembershipResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGeographicRegionMembershipResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGeographicRegionMembershipResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGeographicRegionMembershipResponseBody setRegionIds(DescribeGeographicRegionMembershipResponseBodyRegionIds regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public DescribeGeographicRegionMembershipResponseBodyRegionIds getRegionIds() {
        return this.regionIds;
    }

    public DescribeGeographicRegionMembershipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGeographicRegionMembershipResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId extends TeaModel {
        /**
         * <p>The ID of the region.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>us-west-1</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId build(java.util.Map<String, ?> map) throws Exception {
            DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId self = new DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId();
            return TeaModel.build(map, self);
        }

        public DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeGeographicRegionMembershipResponseBodyRegionIds extends TeaModel {
        @NameInMap("RegionId")
        public java.util.List<DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId> regionId;

        public static DescribeGeographicRegionMembershipResponseBodyRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeGeographicRegionMembershipResponseBodyRegionIds self = new DescribeGeographicRegionMembershipResponseBodyRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeGeographicRegionMembershipResponseBodyRegionIds setRegionId(java.util.List<DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId> regionId) {
            this.regionId = regionId;
            return this;
        }
        public java.util.List<DescribeGeographicRegionMembershipResponseBodyRegionIdsRegionId> getRegionId() {
            return this.regionId;
        }

    }

}
