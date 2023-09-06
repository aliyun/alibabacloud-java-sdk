// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListRegionsResponseBody extends TeaModel {
    /**
     * <p>The list of regions.</p>
     */
    @NameInMap("Regions")
    public ListRegionsResponseBodyRegions regions;

    /**
     * <p>The request ID.</p>
     */
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

    public static class ListRegionsResponseBodyRegionsRegionInfo extends TeaModel {
        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListRegionsResponseBodyRegionsRegionInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRegionsResponseBodyRegionsRegionInfo self = new ListRegionsResponseBodyRegionsRegionInfo();
            return TeaModel.build(map, self);
        }

        public ListRegionsResponseBodyRegionsRegionInfo setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListRegionsResponseBodyRegionsRegionInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("RegionInfo")
        public java.util.List<ListRegionsResponseBodyRegionsRegionInfo> regionInfo;

        public static ListRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListRegionsResponseBodyRegions self = new ListRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListRegionsResponseBodyRegions setRegionInfo(java.util.List<ListRegionsResponseBodyRegionsRegionInfo> regionInfo) {
            this.regionInfo = regionInfo;
            return this;
        }
        public java.util.List<ListRegionsResponseBodyRegionsRegionInfo> getRegionInfo() {
            return this.regionInfo;
        }

    }

}
