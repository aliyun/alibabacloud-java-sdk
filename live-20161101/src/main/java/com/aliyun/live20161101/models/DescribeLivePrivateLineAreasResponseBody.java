// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePrivateLineAreasResponseBody extends TeaModel {
    @NameInMap("LiveAreasList")
    public DescribeLivePrivateLineAreasResponseBodyLiveAreasList liveAreasList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C4865B85-664B-19D3-BB16-C62FB83C8226</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLivePrivateLineAreasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePrivateLineAreasResponseBody self = new DescribeLivePrivateLineAreasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLivePrivateLineAreasResponseBody setLiveAreasList(DescribeLivePrivateLineAreasResponseBodyLiveAreasList liveAreasList) {
        this.liveAreasList = liveAreasList;
        return this;
    }
    public DescribeLivePrivateLineAreasResponseBodyLiveAreasList getLiveAreasList() {
        return this.liveAreasList;
    }

    public DescribeLivePrivateLineAreasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegionsRegion extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegionsRegion self = new DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegionsRegion setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegionsRegion> region;

        public static DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegions self = new DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegions();
            return TeaModel.build(map, self);
        }

        public DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegions setRegion(java.util.List<DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegionsRegion> getRegion() {
            return this.region;
        }

    }

    public static class DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveArea extends TeaModel {
        @NameInMap("RegionType")
        public String regionType;

        @NameInMap("Regions")
        public DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegions regions;

        public static DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveArea build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveArea self = new DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveArea();
            return TeaModel.build(map, self);
        }

        public DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveArea setRegionType(String regionType) {
            this.regionType = regionType;
            return this;
        }
        public String getRegionType() {
            return this.regionType;
        }

        public DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveArea setRegions(DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegions regions) {
            this.regions = regions;
            return this;
        }
        public DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveAreaRegions getRegions() {
            return this.regions;
        }

    }

    public static class DescribeLivePrivateLineAreasResponseBodyLiveAreasList extends TeaModel {
        @NameInMap("LiveArea")
        public java.util.List<DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveArea> liveArea;

        public static DescribeLivePrivateLineAreasResponseBodyLiveAreasList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePrivateLineAreasResponseBodyLiveAreasList self = new DescribeLivePrivateLineAreasResponseBodyLiveAreasList();
            return TeaModel.build(map, self);
        }

        public DescribeLivePrivateLineAreasResponseBodyLiveAreasList setLiveArea(java.util.List<DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveArea> liveArea) {
            this.liveArea = liveArea;
            return this;
        }
        public java.util.List<DescribeLivePrivateLineAreasResponseBodyLiveAreasListLiveArea> getLiveArea() {
            return this.liveArea;
        }

    }

}
