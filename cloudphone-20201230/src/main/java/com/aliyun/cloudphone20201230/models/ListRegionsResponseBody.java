// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public ListRegionsResponseBodyRegions regions;

    @NameInMap("RequestId")
    public String requestId;

    public static ListRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsResponseBody self = new ListRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegionsResponseBody setRegions(ListRegionsResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public ListRegionsResponseBodyRegions getRegions() {
        return this.regions;
    }

    public ListRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRegionsResponseBodyRegionsRegion extends TeaModel {
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        @NameInMap("RegionId")
        public String regionId;

        public static ListRegionsResponseBodyRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            ListRegionsResponseBodyRegionsRegion self = new ListRegionsResponseBodyRegionsRegion();
            return TeaModel.build(map, self);
        }

        public ListRegionsResponseBodyRegionsRegion setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public ListRegionsResponseBodyRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<ListRegionsResponseBodyRegionsRegion> region;

        public static ListRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListRegionsResponseBodyRegions self = new ListRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListRegionsResponseBodyRegions setRegion(java.util.List<ListRegionsResponseBodyRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<ListRegionsResponseBodyRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
