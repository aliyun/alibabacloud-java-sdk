// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAvailableBusiRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<ListAvailableBusiRegionsResponseBodyRegions> regions;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAvailableBusiRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableBusiRegionsResponseBody self = new ListAvailableBusiRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableBusiRegionsResponseBody setRegions(java.util.List<ListAvailableBusiRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListAvailableBusiRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public ListAvailableBusiRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAvailableBusiRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("RegionId")
        public String regionId;

        public static ListAvailableBusiRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableBusiRegionsResponseBodyRegions self = new ListAvailableBusiRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListAvailableBusiRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListAvailableBusiRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
