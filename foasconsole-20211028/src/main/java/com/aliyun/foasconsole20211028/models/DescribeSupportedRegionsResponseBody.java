// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class DescribeSupportedRegionsResponseBody extends TeaModel {
    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Regions")
    public java.util.List<DescribeSupportedRegionsResponseBodyRegions> regions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

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
        @NameInMap("Region")
        public String region;

        @NameInMap("RegionName")
        public String regionName;

        public static DescribeSupportedRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportedRegionsResponseBodyRegions self = new DescribeSupportedRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
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
