// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccRouteEntryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetVccRouteEntryResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVccRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVccRouteEntryResponseBody self = new GetVccRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVccRouteEntryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVccRouteEntryResponseBody setContent(GetVccRouteEntryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetVccRouteEntryResponseBodyContent getContent() {
        return this.content;
    }

    public GetVccRouteEntryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVccRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVccRouteEntryResponseBodyContent extends TeaModel {
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("NextHopId")
        public String nextHopId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RouteType")
        public String routeType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("VccId")
        public String vccId;

        @NameInMap("VccRouteEntryId")
        public String vccRouteEntryId;

        public static GetVccRouteEntryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetVccRouteEntryResponseBodyContent self = new GetVccRouteEntryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetVccRouteEntryResponseBodyContent setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public GetVccRouteEntryResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVccRouteEntryResponseBodyContent setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public GetVccRouteEntryResponseBodyContent setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public GetVccRouteEntryResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVccRouteEntryResponseBodyContent setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public GetVccRouteEntryResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVccRouteEntryResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetVccRouteEntryResponseBodyContent setVccId(String vccId) {
            this.vccId = vccId;
            return this;
        }
        public String getVccId() {
            return this.vccId;
        }

        public GetVccRouteEntryResponseBodyContent setVccRouteEntryId(String vccRouteEntryId) {
            this.vccRouteEntryId = vccRouteEntryId;
            return this;
        }
        public String getVccRouteEntryId() {
            return this.vccRouteEntryId;
        }

    }

}
