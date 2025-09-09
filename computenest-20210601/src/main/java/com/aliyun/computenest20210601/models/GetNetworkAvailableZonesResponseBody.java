// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetNetworkAvailableZonesResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetNetworkAvailableZonesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>A17F9930-E2DC-5E87-B6D6-B0BCD2B00834</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNetworkAvailableZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkAvailableZonesResponseBody self = new GetNetworkAvailableZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkAvailableZonesResponseBody setData(GetNetworkAvailableZonesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNetworkAvailableZonesResponseBodyData getData() {
        return this.data;
    }

    public GetNetworkAvailableZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNetworkAvailableZonesResponseBodyData extends TeaModel {
        @NameInMap("RegionIdList")
        public java.util.List<String> regionIdList;

        @NameInMap("ZoneIdList")
        public java.util.List<String> zoneIdList;

        public static GetNetworkAvailableZonesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkAvailableZonesResponseBodyData self = new GetNetworkAvailableZonesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNetworkAvailableZonesResponseBodyData setRegionIdList(java.util.List<String> regionIdList) {
            this.regionIdList = regionIdList;
            return this;
        }
        public java.util.List<String> getRegionIdList() {
            return this.regionIdList;
        }

        public GetNetworkAvailableZonesResponseBodyData setZoneIdList(java.util.List<String> zoneIdList) {
            this.zoneIdList = zoneIdList;
            return this;
        }
        public java.util.List<String> getZoneIdList() {
            return this.zoneIdList;
        }

    }

}
