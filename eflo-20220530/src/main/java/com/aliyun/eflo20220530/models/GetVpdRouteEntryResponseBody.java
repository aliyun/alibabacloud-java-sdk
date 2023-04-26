// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdRouteEntryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetVpdRouteEntryResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVpdRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpdRouteEntryResponseBody self = new GetVpdRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpdRouteEntryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVpdRouteEntryResponseBody setContent(GetVpdRouteEntryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetVpdRouteEntryResponseBodyContent getContent() {
        return this.content;
    }

    public GetVpdRouteEntryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVpdRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVpdRouteEntryResponseBodyContent extends TeaModel {
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

        @NameInMap("VpdId")
        public String vpdId;

        @NameInMap("VpdRouteEntryId")
        public String vpdRouteEntryId;

        public static GetVpdRouteEntryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetVpdRouteEntryResponseBodyContent self = new GetVpdRouteEntryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetVpdRouteEntryResponseBodyContent setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public GetVpdRouteEntryResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVpdRouteEntryResponseBodyContent setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public GetVpdRouteEntryResponseBodyContent setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public GetVpdRouteEntryResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVpdRouteEntryResponseBodyContent setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public GetVpdRouteEntryResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVpdRouteEntryResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetVpdRouteEntryResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetVpdRouteEntryResponseBodyContent setVpdRouteEntryId(String vpdRouteEntryId) {
            this.vpdRouteEntryId = vpdRouteEntryId;
            return this;
        }
        public String getVpdRouteEntryId() {
            return this.vpdRouteEntryId;
        }

    }

}
