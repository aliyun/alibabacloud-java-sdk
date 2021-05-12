// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListAlicloudRegionResponseBody extends TeaModel {
    @NameInMap("data")
    public ListAlicloudRegionResponseBodyData data;

    @NameInMap("success")
    public Boolean success;

    public static ListAlicloudRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlicloudRegionResponseBody self = new ListAlicloudRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlicloudRegionResponseBody setData(ListAlicloudRegionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAlicloudRegionResponseBodyData getData() {
        return this.data;
    }

    public ListAlicloudRegionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlicloudRegionResponseBodyDataRegionsRegion extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        public static ListAlicloudRegionResponseBodyDataRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            ListAlicloudRegionResponseBodyDataRegionsRegion self = new ListAlicloudRegionResponseBodyDataRegionsRegion();
            return TeaModel.build(map, self);
        }

        public ListAlicloudRegionResponseBodyDataRegionsRegion setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListAlicloudRegionResponseBodyDataRegionsRegion setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public ListAlicloudRegionResponseBodyDataRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAlicloudRegionResponseBodyDataRegionsRegion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAlicloudRegionResponseBodyDataRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<ListAlicloudRegionResponseBodyDataRegionsRegion> region;

        public static ListAlicloudRegionResponseBodyDataRegions build(java.util.Map<String, ?> map) throws Exception {
            ListAlicloudRegionResponseBodyDataRegions self = new ListAlicloudRegionResponseBodyDataRegions();
            return TeaModel.build(map, self);
        }

        public ListAlicloudRegionResponseBodyDataRegions setRegion(java.util.List<ListAlicloudRegionResponseBodyDataRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<ListAlicloudRegionResponseBodyDataRegionsRegion> getRegion() {
            return this.region;
        }

    }

    public static class ListAlicloudRegionResponseBodyData extends TeaModel {
        @NameInMap("Regions")
        public ListAlicloudRegionResponseBodyDataRegions regions;

        @NameInMap("RequestId")
        public String requestId;

        public static ListAlicloudRegionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlicloudRegionResponseBodyData self = new ListAlicloudRegionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlicloudRegionResponseBodyData setRegions(ListAlicloudRegionResponseBodyDataRegions regions) {
            this.regions = regions;
            return this;
        }
        public ListAlicloudRegionResponseBodyDataRegions getRegions() {
            return this.regions;
        }

        public ListAlicloudRegionResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
