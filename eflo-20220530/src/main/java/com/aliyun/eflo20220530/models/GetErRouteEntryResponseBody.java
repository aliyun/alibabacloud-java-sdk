// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErRouteEntryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetErRouteEntryResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetErRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErRouteEntryResponseBody self = new GetErRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErRouteEntryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetErRouteEntryResponseBody setContent(GetErRouteEntryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetErRouteEntryResponseBodyContent getContent() {
        return this.content;
    }

    public GetErRouteEntryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetErRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetErRouteEntryResponseBodyContent extends TeaModel {
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("ErId")
        public String erId;

        @NameInMap("ErRouteEntryId")
        public String erRouteEntryId;

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

        public static GetErRouteEntryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetErRouteEntryResponseBodyContent self = new GetErRouteEntryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetErRouteEntryResponseBodyContent setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public GetErRouteEntryResponseBodyContent setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetErRouteEntryResponseBodyContent setErRouteEntryId(String erRouteEntryId) {
            this.erRouteEntryId = erRouteEntryId;
            return this;
        }
        public String getErRouteEntryId() {
            return this.erRouteEntryId;
        }

        public GetErRouteEntryResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetErRouteEntryResponseBodyContent setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public GetErRouteEntryResponseBodyContent setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public GetErRouteEntryResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetErRouteEntryResponseBodyContent setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public GetErRouteEntryResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetErRouteEntryResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
