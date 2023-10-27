// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAvailableBusiRegionsResponseBody extends TeaModel {
    /**
     * <p>The information about the regions.</p>
     */
    @NameInMap("Regions")
    public java.util.List<ListAvailableBusiRegionsResponseBodyRegions> regions;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>Indicates whether the region is in the Chinese mainland. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ChinaMainland")
        public Boolean chinaMainland;

        /**
         * <p>The region name.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>Indicates whether the region is a point of presence (PoP) of Alibaba Cloud. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Pop")
        public Boolean pop;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListAvailableBusiRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableBusiRegionsResponseBodyRegions self = new ListAvailableBusiRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListAvailableBusiRegionsResponseBodyRegions setChinaMainland(Boolean chinaMainland) {
            this.chinaMainland = chinaMainland;
            return this;
        }
        public Boolean getChinaMainland() {
            return this.chinaMainland;
        }

        public ListAvailableBusiRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListAvailableBusiRegionsResponseBodyRegions setPop(Boolean pop) {
            this.pop = pop;
            return this;
        }
        public Boolean getPop() {
            return this.pop;
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
