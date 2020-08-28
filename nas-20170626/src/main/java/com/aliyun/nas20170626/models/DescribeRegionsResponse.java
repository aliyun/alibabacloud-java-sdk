// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Regions")
    @Validation(required = true)
    public DescribeRegionsResponseRegions regions;

    public static DescribeRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponse self = new DescribeRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRegionsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRegionsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRegionsResponse setRegions(DescribeRegionsResponseRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionsResponseRegions getRegions() {
        return this.regions;
    }

    public static class DescribeRegionsResponseRegionsRegion extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("LocalName")
        @Validation(required = true)
        public String localName;

        @NameInMap("RegionEndpoint")
        @Validation(required = true)
        public String regionEndpoint;

        public static DescribeRegionsResponseRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegionsRegion self = new DescribeRegionsResponseRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseRegionsRegion setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseRegionsRegion setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

    }

    public static class DescribeRegionsResponseRegions extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public java.util.List<DescribeRegionsResponseRegionsRegion> region;

        public static DescribeRegionsResponseRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseRegions self = new DescribeRegionsResponseRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseRegions setRegion(java.util.List<DescribeRegionsResponseRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeRegionsResponseRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
