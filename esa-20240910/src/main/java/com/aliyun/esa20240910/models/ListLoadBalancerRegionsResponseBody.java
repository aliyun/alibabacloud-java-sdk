// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListLoadBalancerRegionsResponseBody extends TeaModel {
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
     * <p>1024</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The regions.</p>
     */
    @NameInMap("Regions")
    public java.util.List<ListLoadBalancerRegionsResponseBodyRegions> regions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81A5E222-24BF-17EF-9E80-A68D9B8F363D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListLoadBalancerRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancerRegionsResponseBody self = new ListLoadBalancerRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancerRegionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLoadBalancerRegionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLoadBalancerRegionsResponseBody setRegions(java.util.List<ListLoadBalancerRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListLoadBalancerRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public ListLoadBalancerRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLoadBalancerRegionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListLoadBalancerRegionsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListLoadBalancerRegionsResponseBodyRegionsSubRegions extends TeaModel {
        /**
         * <p>The Chinese name of the region.</p>
         */
        @NameInMap("SubRegionCnName")
        public String subRegionCnName;

        /**
         * <p>The code of the subregion.</p>
         * 
         * <strong>example:</strong>
         * <p>ID</p>
         */
        @NameInMap("SubRegionCode")
        public String subRegionCode;

        /**
         * <p>The English name of the subregion.</p>
         * 
         * <strong>example:</strong>
         * <p>Indonesia</p>
         */
        @NameInMap("SubRegionEnName")
        public String subRegionEnName;

        public static ListLoadBalancerRegionsResponseBodyRegionsSubRegions build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancerRegionsResponseBodyRegionsSubRegions self = new ListLoadBalancerRegionsResponseBodyRegionsSubRegions();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancerRegionsResponseBodyRegionsSubRegions setSubRegionCnName(String subRegionCnName) {
            this.subRegionCnName = subRegionCnName;
            return this;
        }
        public String getSubRegionCnName() {
            return this.subRegionCnName;
        }

        public ListLoadBalancerRegionsResponseBodyRegionsSubRegions setSubRegionCode(String subRegionCode) {
            this.subRegionCode = subRegionCode;
            return this;
        }
        public String getSubRegionCode() {
            return this.subRegionCode;
        }

        public ListLoadBalancerRegionsResponseBodyRegionsSubRegions setSubRegionEnName(String subRegionEnName) {
            this.subRegionEnName = subRegionEnName;
            return this;
        }
        public String getSubRegionEnName() {
            return this.subRegionEnName;
        }

    }

    public static class ListLoadBalancerRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>The Chinese name of the region.</p>
         */
        @NameInMap("RegionCnName")
        public String regionCnName;

        /**
         * <p>The code of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>SEAS</p>
         */
        @NameInMap("RegionCode")
        public String regionCode;

        /**
         * <p>The English name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>South East Asia</p>
         */
        @NameInMap("RegionEnName")
        public String regionEnName;

        /**
         * <p>The subregions of the region.</p>
         */
        @NameInMap("SubRegions")
        public java.util.List<ListLoadBalancerRegionsResponseBodyRegionsSubRegions> subRegions;

        public static ListLoadBalancerRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancerRegionsResponseBodyRegions self = new ListLoadBalancerRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancerRegionsResponseBodyRegions setRegionCnName(String regionCnName) {
            this.regionCnName = regionCnName;
            return this;
        }
        public String getRegionCnName() {
            return this.regionCnName;
        }

        public ListLoadBalancerRegionsResponseBodyRegions setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public ListLoadBalancerRegionsResponseBodyRegions setRegionEnName(String regionEnName) {
            this.regionEnName = regionEnName;
            return this;
        }
        public String getRegionEnName() {
            return this.regionEnName;
        }

        public ListLoadBalancerRegionsResponseBodyRegions setSubRegions(java.util.List<ListLoadBalancerRegionsResponseBodyRegionsSubRegions> subRegions) {
            this.subRegions = subRegions;
            return this;
        }
        public java.util.List<ListLoadBalancerRegionsResponseBodyRegionsSubRegions> getSubRegions() {
            return this.subRegions;
        }

    }

}
