// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetRegionResponseBody extends TeaModel {
    @NameInMap("AvailableZones")
    public java.util.List<GetRegionResponseBodyAvailableZones> availableZones;

    @NameInMap("RequestId")
    public String requestId;

    public static GetRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegionResponseBody self = new GetRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegionResponseBody setAvailableZones(java.util.List<GetRegionResponseBodyAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public java.util.List<GetRegionResponseBodyAvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    public GetRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRegionResponseBodyAvailableZonesOptions extends TeaModel {
        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("StorageType")
        public String storageType;

        public static GetRegionResponseBodyAvailableZonesOptions build(java.util.Map<String, ?> map) throws Exception {
            GetRegionResponseBodyAvailableZonesOptions self = new GetRegionResponseBodyAvailableZonesOptions();
            return TeaModel.build(map, self);
        }

        public GetRegionResponseBodyAvailableZonesOptions setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public GetRegionResponseBodyAvailableZonesOptions setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class GetRegionResponseBodyAvailableZones extends TeaModel {
        @NameInMap("Options")
        public java.util.List<GetRegionResponseBodyAvailableZonesOptions> options;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetRegionResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            GetRegionResponseBodyAvailableZones self = new GetRegionResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public GetRegionResponseBodyAvailableZones setOptions(java.util.List<GetRegionResponseBodyAvailableZonesOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<GetRegionResponseBodyAvailableZonesOptions> getOptions() {
            return this.options;
        }

        public GetRegionResponseBodyAvailableZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
