// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetErResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetErResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErResponseBody self = new GetErResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetErResponseBody setContent(GetErResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetErResponseBodyContent getContent() {
        return this.content;
    }

    public GetErResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetErResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetErResponseBodyContentErAttachments extends TeaModel {
        @NameInMap("Across")
        public Boolean across;

        @NameInMap("AutoReceiveAllRoute")
        public Boolean autoReceiveAllRoute;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErAttachmentId")
        public String erAttachmentId;

        @NameInMap("ErAttachmentName")
        public String erAttachmentName;

        @NameInMap("ErId")
        public String erId;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Message")
        public String message;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceTenantId")
        public String resourceTenantId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        public static GetErResponseBodyContentErAttachments build(java.util.Map<String, ?> map) throws Exception {
            GetErResponseBodyContentErAttachments self = new GetErResponseBodyContentErAttachments();
            return TeaModel.build(map, self);
        }

        public GetErResponseBodyContentErAttachments setAcross(Boolean across) {
            this.across = across;
            return this;
        }
        public Boolean getAcross() {
            return this.across;
        }

        public GetErResponseBodyContentErAttachments setAutoReceiveAllRoute(Boolean autoReceiveAllRoute) {
            this.autoReceiveAllRoute = autoReceiveAllRoute;
            return this;
        }
        public Boolean getAutoReceiveAllRoute() {
            return this.autoReceiveAllRoute;
        }

        public GetErResponseBodyContentErAttachments setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetErResponseBodyContentErAttachments setErAttachmentId(String erAttachmentId) {
            this.erAttachmentId = erAttachmentId;
            return this;
        }
        public String getErAttachmentId() {
            return this.erAttachmentId;
        }

        public GetErResponseBodyContentErAttachments setErAttachmentName(String erAttachmentName) {
            this.erAttachmentName = erAttachmentName;
            return this;
        }
        public String getErAttachmentName() {
            return this.erAttachmentName;
        }

        public GetErResponseBodyContentErAttachments setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetErResponseBodyContentErAttachments setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetErResponseBodyContentErAttachments setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetErResponseBodyContentErAttachments setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetErResponseBodyContentErAttachments setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetErResponseBodyContentErAttachments setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetErResponseBodyContentErAttachments setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetErResponseBodyContentErAttachments setResourceTenantId(String resourceTenantId) {
            this.resourceTenantId = resourceTenantId;
            return this;
        }
        public String getResourceTenantId() {
            return this.resourceTenantId;
        }

        public GetErResponseBodyContentErAttachments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetErResponseBodyContentErAttachments setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class GetErResponseBodyContentErRouteEntrys extends TeaModel {
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

        @NameInMap("ResourceTenantId")
        public String resourceTenantId;

        @NameInMap("RouteType")
        public String routeType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        public static GetErResponseBodyContentErRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            GetErResponseBodyContentErRouteEntrys self = new GetErResponseBodyContentErRouteEntrys();
            return TeaModel.build(map, self);
        }

        public GetErResponseBodyContentErRouteEntrys setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public GetErResponseBodyContentErRouteEntrys setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetErResponseBodyContentErRouteEntrys setErRouteEntryId(String erRouteEntryId) {
            this.erRouteEntryId = erRouteEntryId;
            return this;
        }
        public String getErRouteEntryId() {
            return this.erRouteEntryId;
        }

        public GetErResponseBodyContentErRouteEntrys setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetErResponseBodyContentErRouteEntrys setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public GetErResponseBodyContentErRouteEntrys setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public GetErResponseBodyContentErRouteEntrys setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetErResponseBodyContentErRouteEntrys setResourceTenantId(String resourceTenantId) {
            this.resourceTenantId = resourceTenantId;
            return this;
        }
        public String getResourceTenantId() {
            return this.resourceTenantId;
        }

        public GetErResponseBodyContentErRouteEntrys setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public GetErResponseBodyContentErRouteEntrys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetErResponseBodyContentErRouteEntrys setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class GetErResponseBodyContentErRouteMaps extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("CreateTime")
        public String createTime;

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

        public static GetErResponseBodyContentErRouteMaps build(java.util.Map<String, ?> map) throws Exception {
            GetErResponseBodyContentErRouteMaps self = new GetErResponseBodyContentErRouteMaps();
            return TeaModel.build(map, self);
        }

        public GetErResponseBodyContentErRouteMaps setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetErResponseBodyContentErRouteMaps setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetErResponseBodyContentErRouteMaps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetErResponseBodyContentErRouteMaps setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public GetErResponseBodyContentErRouteMaps setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetErResponseBodyContentErRouteMaps setErRouteMapId(String erRouteMapId) {
            this.erRouteMapId = erRouteMapId;
            return this;
        }
        public String getErRouteMapId() {
            return this.erRouteMapId;
        }

        public GetErResponseBodyContentErRouteMaps setErRouteMapName(String erRouteMapName) {
            this.erRouteMapName = erRouteMapName;
            return this;
        }
        public String getErRouteMapName() {
            return this.erRouteMapName;
        }

        public GetErResponseBodyContentErRouteMaps setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetErResponseBodyContentErRouteMaps setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetErResponseBodyContentErRouteMaps setReceptionInstanceId(String receptionInstanceId) {
            this.receptionInstanceId = receptionInstanceId;
            return this;
        }
        public String getReceptionInstanceId() {
            return this.receptionInstanceId;
        }

        public GetErResponseBodyContentErRouteMaps setReceptionInstanceName(String receptionInstanceName) {
            this.receptionInstanceName = receptionInstanceName;
            return this;
        }
        public String getReceptionInstanceName() {
            return this.receptionInstanceName;
        }

        public GetErResponseBodyContentErRouteMaps setReceptionInstanceOwner(String receptionInstanceOwner) {
            this.receptionInstanceOwner = receptionInstanceOwner;
            return this;
        }
        public String getReceptionInstanceOwner() {
            return this.receptionInstanceOwner;
        }

        public GetErResponseBodyContentErRouteMaps setReceptionInstanceType(String receptionInstanceType) {
            this.receptionInstanceType = receptionInstanceType;
            return this;
        }
        public String getReceptionInstanceType() {
            return this.receptionInstanceType;
        }

        public GetErResponseBodyContentErRouteMaps setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetErResponseBodyContentErRouteMaps setRouteMapNum(Integer routeMapNum) {
            this.routeMapNum = routeMapNum;
            return this;
        }
        public Integer getRouteMapNum() {
            return this.routeMapNum;
        }

        public GetErResponseBodyContentErRouteMaps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetErResponseBodyContentErRouteMaps setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetErResponseBodyContentErRouteMaps setTransmissionInstanceId(String transmissionInstanceId) {
            this.transmissionInstanceId = transmissionInstanceId;
            return this;
        }
        public String getTransmissionInstanceId() {
            return this.transmissionInstanceId;
        }

        public GetErResponseBodyContentErRouteMaps setTransmissionInstanceName(String transmissionInstanceName) {
            this.transmissionInstanceName = transmissionInstanceName;
            return this;
        }
        public String getTransmissionInstanceName() {
            return this.transmissionInstanceName;
        }

        public GetErResponseBodyContentErRouteMaps setTransmissionInstanceOwner(String transmissionInstanceOwner) {
            this.transmissionInstanceOwner = transmissionInstanceOwner;
            return this;
        }
        public String getTransmissionInstanceOwner() {
            return this.transmissionInstanceOwner;
        }

        public GetErResponseBodyContentErRouteMaps setTransmissionInstanceType(String transmissionInstanceType) {
            this.transmissionInstanceType = transmissionInstanceType;
            return this;
        }
        public String getTransmissionInstanceType() {
            return this.transmissionInstanceType;
        }

    }

    public static class GetErResponseBodyContent extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ErAttachments")
        public java.util.List<GetErResponseBodyContentErAttachments> erAttachments;

        @NameInMap("ErId")
        public String erId;

        @NameInMap("ErName")
        public String erName;

        @NameInMap("ErRouteEntrys")
        public java.util.List<GetErResponseBodyContentErRouteEntrys> erRouteEntrys;

        @NameInMap("ErRouteMaps")
        public java.util.List<GetErResponseBodyContentErRouteMaps> erRouteMaps;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MasterZoneId")
        public String masterZoneId;

        @NameInMap("Message")
        public String message;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        public static GetErResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetErResponseBodyContent self = new GetErResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetErResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetErResponseBodyContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetErResponseBodyContent setErAttachments(java.util.List<GetErResponseBodyContentErAttachments> erAttachments) {
            this.erAttachments = erAttachments;
            return this;
        }
        public java.util.List<GetErResponseBodyContentErAttachments> getErAttachments() {
            return this.erAttachments;
        }

        public GetErResponseBodyContent setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetErResponseBodyContent setErName(String erName) {
            this.erName = erName;
            return this;
        }
        public String getErName() {
            return this.erName;
        }

        public GetErResponseBodyContent setErRouteEntrys(java.util.List<GetErResponseBodyContentErRouteEntrys> erRouteEntrys) {
            this.erRouteEntrys = erRouteEntrys;
            return this;
        }
        public java.util.List<GetErResponseBodyContentErRouteEntrys> getErRouteEntrys() {
            return this.erRouteEntrys;
        }

        public GetErResponseBodyContent setErRouteMaps(java.util.List<GetErResponseBodyContentErRouteMaps> erRouteMaps) {
            this.erRouteMaps = erRouteMaps;
            return this;
        }
        public java.util.List<GetErResponseBodyContentErRouteMaps> getErRouteMaps() {
            return this.erRouteMaps;
        }

        public GetErResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetErResponseBodyContent setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public GetErResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetErResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetErResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetErResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
