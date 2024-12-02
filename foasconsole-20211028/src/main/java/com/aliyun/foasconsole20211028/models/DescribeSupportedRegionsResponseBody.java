// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class DescribeSupportedRegionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Regions")
    public java.util.List<DescribeSupportedRegionsResponseBodyRegions> regions;

    /**
     * <strong>example:</strong>
     * <p>B21DC47E-8928-199A-9F32-36D45E4693B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeSupportedRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedRegionsResponseBody self = new DescribeSupportedRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedRegionsResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public DescribeSupportedRegionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSupportedRegionsResponseBody setRegions(java.util.List<DescribeSupportedRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeSupportedRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public DescribeSupportedRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSupportedRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSupportedRegionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeSupportedRegionsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSupportedRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Extra")
        public String extra;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>华北2 (北京)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        public static DescribeSupportedRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportedRegionsResponseBodyRegions self = new DescribeSupportedRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeSupportedRegionsResponseBodyRegions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSupportedRegionsResponseBodyRegions setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeSupportedRegionsResponseBodyRegions setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeSupportedRegionsResponseBodyRegions setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
