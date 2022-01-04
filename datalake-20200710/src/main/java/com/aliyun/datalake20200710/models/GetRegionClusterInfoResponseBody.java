// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetRegionClusterInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetRegionClusterInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetRegionClusterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegionClusterInfoResponseBody self = new GetRegionClusterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegionClusterInfoResponseBody setData(GetRegionClusterInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRegionClusterInfoResponseBodyData getData() {
        return this.data;
    }

    public GetRegionClusterInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegionClusterInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRegionClusterInfoResponseBodyData extends TeaModel {
        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetRegionClusterInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRegionClusterInfoResponseBodyData self = new GetRegionClusterInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRegionClusterInfoResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public GetRegionClusterInfoResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetRegionClusterInfoResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
