// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErRouteMapResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetErRouteMapResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetErRouteMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErRouteMapResponseBody self = new GetErRouteMapResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErRouteMapResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetErRouteMapResponseBody setContent(GetErRouteMapResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetErRouteMapResponseBodyContent getContent() {
        return this.content;
    }

    public GetErRouteMapResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetErRouteMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetErRouteMapResponseBodyContent extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("ErId")
        public String erId;

        @NameInMap("ErRouteMapId")
        public String erRouteMapId;

        @NameInMap("ErRouteMapName")
        public String erRouteMapName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Message")
        public String message;

        @NameInMap("ReceptionInstanceId")
        public String receptionInstanceId;

        @NameInMap("ReceptionInstanceName")
        public String receptionInstanceName;

        @NameInMap("ReceptionInstanceOwner")
        public String receptionInstanceOwner;

        @NameInMap("ReceptionInstanceType")
        public String receptionInstanceType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RouteMapNum")
        public Integer routeMapNum;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TransmissionInstanceId")
        public String transmissionInstanceId;

        @NameInMap("TransmissionInstanceName")
        public String transmissionInstanceName;

        @NameInMap("TransmissionInstanceOwner")
        public String transmissionInstanceOwner;

        @NameInMap("TransmissionInstanceType")
        public String transmissionInstanceType;

        public static GetErRouteMapResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetErRouteMapResponseBodyContent self = new GetErRouteMapResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetErRouteMapResponseBodyContent setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetErRouteMapResponseBodyContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetErRouteMapResponseBodyContent setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public GetErRouteMapResponseBodyContent setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetErRouteMapResponseBodyContent setErRouteMapId(String erRouteMapId) {
            this.erRouteMapId = erRouteMapId;
            return this;
        }
        public String getErRouteMapId() {
            return this.erRouteMapId;
        }

        public GetErRouteMapResponseBodyContent setErRouteMapName(String erRouteMapName) {
            this.erRouteMapName = erRouteMapName;
            return this;
        }
        public String getErRouteMapName() {
            return this.erRouteMapName;
        }

        public GetErRouteMapResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetErRouteMapResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetErRouteMapResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetErRouteMapResponseBodyContent setReceptionInstanceId(String receptionInstanceId) {
            this.receptionInstanceId = receptionInstanceId;
            return this;
        }
        public String getReceptionInstanceId() {
            return this.receptionInstanceId;
        }

        public GetErRouteMapResponseBodyContent setReceptionInstanceName(String receptionInstanceName) {
            this.receptionInstanceName = receptionInstanceName;
            return this;
        }
        public String getReceptionInstanceName() {
            return this.receptionInstanceName;
        }

        public GetErRouteMapResponseBodyContent setReceptionInstanceOwner(String receptionInstanceOwner) {
            this.receptionInstanceOwner = receptionInstanceOwner;
            return this;
        }
        public String getReceptionInstanceOwner() {
            return this.receptionInstanceOwner;
        }

        public GetErRouteMapResponseBodyContent setReceptionInstanceType(String receptionInstanceType) {
            this.receptionInstanceType = receptionInstanceType;
            return this;
        }
        public String getReceptionInstanceType() {
            return this.receptionInstanceType;
        }

        public GetErRouteMapResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetErRouteMapResponseBodyContent setRouteMapNum(Integer routeMapNum) {
            this.routeMapNum = routeMapNum;
            return this;
        }
        public Integer getRouteMapNum() {
            return this.routeMapNum;
        }

        public GetErRouteMapResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetErRouteMapResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetErRouteMapResponseBodyContent setTransmissionInstanceId(String transmissionInstanceId) {
            this.transmissionInstanceId = transmissionInstanceId;
            return this;
        }
        public String getTransmissionInstanceId() {
            return this.transmissionInstanceId;
        }

        public GetErRouteMapResponseBodyContent setTransmissionInstanceName(String transmissionInstanceName) {
            this.transmissionInstanceName = transmissionInstanceName;
            return this;
        }
        public String getTransmissionInstanceName() {
            return this.transmissionInstanceName;
        }

        public GetErRouteMapResponseBodyContent setTransmissionInstanceOwner(String transmissionInstanceOwner) {
            this.transmissionInstanceOwner = transmissionInstanceOwner;
            return this;
        }
        public String getTransmissionInstanceOwner() {
            return this.transmissionInstanceOwner;
        }

        public GetErRouteMapResponseBodyContent setTransmissionInstanceType(String transmissionInstanceType) {
            this.transmissionInstanceType = transmissionInstanceType;
            return this;
        }
        public String getTransmissionInstanceType() {
            return this.transmissionInstanceType;
        }

    }

}
