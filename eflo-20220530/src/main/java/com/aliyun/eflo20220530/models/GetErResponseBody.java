// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public GetErResponseBodyContent content;

    /**
     * <p>Information returned when the call fails</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>308DE9D2-03A6-5B44-A369-67B75D1EE091</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetErResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErResponseBody self = new GetErResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>Cross-account</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Across")
        public Boolean across;

        /**
         * <p>Receive all routes automatically</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoReceiveAllRoute")
        public Boolean autoReceiveAllRoute;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1644283112720</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The connection ID of the Lingjun HUB network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>er-attachment-f32hxfsu</p>
         */
        @NameInMap("ErAttachmentId")
        public String erAttachmentId;

        /**
         * <p>Network Instance Name</p>
         * 
         * <strong>example:</strong>
         * <p>fudan-egpu</p>
         */
        @NameInMap("ErAttachmentName")
        public String erAttachmentName;

        /**
         * <p>Lingjun HUB Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1649303733000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-kkopgtne</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the ECU.</p>
         * 
         * <strong>example:</strong>
         * <p>zhijiao</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Instance type: VPD and VCC</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>VCC: Lingjun Connection.</li>
         * <li>VPD: Lingjun network segment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPD</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The synchronized region where the ECS instances are deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzzka6bnjvbi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the tenant to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx</p>
         */
        @NameInMap("ResourceTenantId")
        public String resourceTenantId;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
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

        public GetErResponseBodyContentErAttachments setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
        /**
         * <p>Destination CIDR Block</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/9</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>Lingjun HUB Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>The ID of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>er-rte-xnmsd2kl</p>
         */
        @NameInMap("ErRouteEntryId")
        public String erRouteEntryId;

        /**
         * <p>The time when the cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1623317089000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Next Hop Instance</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-xxkmggkw</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>Next Hop Instance Type</p>
         * 
         * <strong>example:</strong>
         * <p>VCC</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyoj5mg3w54y</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the tenant to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        @NameInMap("ResourceTenantId")
        public String resourceTenantId;

        /**
         * <p>Route type</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("RouteType")
        public String routeType;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
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

        public GetErResponseBodyContentErRouteEntrys setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
        /**
         * <p>Policy behavior</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>deny: rejects the.</li>
         * <li>permit: The allows.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>permit</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1645766599809</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Policy description</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Destination CIDR Block</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>Lingjun HUB ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>routing policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-rmap-xkslnmsr</p>
         */
        @NameInMap("ErRouteMapId")
        public String erRouteMapId;

        /**
         * <p>The name of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>route-map-name</p>
         */
        @NameInMap("ErRouteMapName")
        public String erRouteMapName;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1623899444000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-sdkd2gkx</p>
         */
        @NameInMap("ReceptionInstanceId")
        public String receptionInstanceId;

        /**
         * <p>The name of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Reception-name</p>
         */
        @NameInMap("ReceptionInstanceName")
        public String receptionInstanceName;

        /**
         * <p>The tenant to which the destination instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        @NameInMap("ReceptionInstanceOwner")
        public String receptionInstanceOwner;

        /**
         * <p>The type of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPD</p>
         */
        @NameInMap("ReceptionInstanceType")
        public String receptionInstanceType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzaq3ypaqkdy</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Policy sequence number (1001-2000)</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("RouteMapNum")
        public Integer routeMapNum;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>XXQGPROD-zh_CN</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-xmglsymg</p>
         */
        @NameInMap("TransmissionInstanceId")
        public String transmissionInstanceId;

        /**
         * <p>Source instance name</p>
         * 
         * <strong>example:</strong>
         * <p>test-transmission</p>
         */
        @NameInMap("TransmissionInstanceName")
        public String transmissionInstanceName;

        /**
         * <p>The tenant to which the source instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        @NameInMap("TransmissionInstanceOwner")
        public String transmissionInstanceOwner;

        /**
         * <p>The type of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPD</p>
         */
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

        public GetErResponseBodyContentErRouteMaps setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

    public static class GetErResponseBodyContentTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static GetErResponseBodyContentTags build(java.util.Map<String, ?> map) throws Exception {
            GetErResponseBodyContentTags self = new GetErResponseBodyContentTags();
            return TeaModel.build(map, self);
        }

        public GetErResponseBodyContentTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetErResponseBodyContentTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetErResponseBodyContent extends TeaModel {
        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1644283112720</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Network instance information list</p>
         */
        @NameInMap("ErAttachments")
        public java.util.List<GetErResponseBodyContentErAttachments> erAttachments;

        /**
         * <p>Lingjun HUB Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-aueyxxsy</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>Lingjun HUB Instance Name</p>
         * 
         * <strong>example:</strong>
         * <p>er-heyuan-main</p>
         */
        @NameInMap("ErName")
        public String erName;

        /**
         * <p>The list of route entry information.</p>
         */
        @NameInMap("ErRouteEntrys")
        public java.util.List<GetErResponseBodyContentErRouteEntrys> erRouteEntrys;

        /**
         * <p>routing policy information list</p>
         */
        @NameInMap("ErRouteMaps")
        public java.util.List<GetErResponseBodyContentErRouteMaps> erRouteMaps;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1627545952000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Primary Zone</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("MasterZoneId")
        public String masterZoneId;

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzlki4ehfse4y</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<GetErResponseBodyContentTags> tags;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
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

        public GetErResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetErResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetErResponseBodyContent setTags(java.util.List<GetErResponseBodyContentTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetErResponseBodyContentTags> getTags() {
            return this.tags;
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
