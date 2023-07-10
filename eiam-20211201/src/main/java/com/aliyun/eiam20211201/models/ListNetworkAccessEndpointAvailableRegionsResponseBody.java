// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointAvailableRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<ListNetworkAccessEndpointAvailableRegionsResponseBodyRegions> regions;

    @NameInMap("RequestId")
    public String requestId;

    public static ListNetworkAccessEndpointAvailableRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessEndpointAvailableRegionsResponseBody self = new ListNetworkAccessEndpointAvailableRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessEndpointAvailableRegionsResponseBody setRegions(java.util.List<ListNetworkAccessEndpointAvailableRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListNetworkAccessEndpointAvailableRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public ListNetworkAccessEndpointAvailableRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNetworkAccessEndpointAvailableRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>地域名称。</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>地域ID。</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListNetworkAccessEndpointAvailableRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkAccessEndpointAvailableRegionsResponseBodyRegions self = new ListNetworkAccessEndpointAvailableRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListNetworkAccessEndpointAvailableRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListNetworkAccessEndpointAvailableRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
