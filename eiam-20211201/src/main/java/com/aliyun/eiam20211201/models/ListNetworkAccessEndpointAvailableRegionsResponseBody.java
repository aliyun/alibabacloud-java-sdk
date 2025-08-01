// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointAvailableRegionsResponseBody extends TeaModel {
    /**
     * <p>The information of region.</p>
     */
    @NameInMap("Regions")
    public java.util.List<ListNetworkAccessEndpointAvailableRegionsResponseBodyRegions> regions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
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
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
