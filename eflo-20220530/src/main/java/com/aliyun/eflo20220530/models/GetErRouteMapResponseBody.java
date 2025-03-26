// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErRouteMapResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
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
     * <p>The returned data.</p>
     */
    @NameInMap("Content")
    public GetErRouteMapResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetErRouteMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErRouteMapResponseBody self = new GetErRouteMapResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErRouteMapResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>Policy behavior; optional values:</p>
         * <ul>
         * <li><strong>permit</strong>: Allow</li>
         * <li><strong>deny</strong>: Rejected</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>permit</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>Policy description</p>
         * 
         * <strong>example:</strong>
         * <p>ssss</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Destination CIDR block</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
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
         * <p>Lingjun HUB routing policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-rmap-uwglhzom</p>
         */
        @NameInMap("ErRouteMapId")
        public String erRouteMapId;

        /**
         * <p>Lingjun HUB routing policy Name</p>
         * 
         * <strong>example:</strong>
         * <p>er-rmap-wulanchabu</p>
         */
        @NameInMap("ErRouteMapName")
        public String erRouteMapName;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1648085472000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1648085472000</p>
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
         * <p>Receive Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-x25vxrb2</p>
         */
        @NameInMap("ReceptionInstanceId")
        public String receptionInstanceId;

        /**
         * <p>Receive Instance Name</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-receprion</p>
         */
        @NameInMap("ReceptionInstanceName")
        public String receptionInstanceName;

        /**
         * <p>The tenant to which the receiving instance belongs</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        @NameInMap("ReceptionInstanceOwner")
        public String receptionInstanceOwner;

        /**
         * <p>The type of the received instance. Optional values:</p>
         * <ul>
         * <li><strong>VPD</strong>: Lingjun network segment.</li>
         * <li><strong>VCC</strong>: Lingjun Connection.</li>
         * </ul>
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
         * <p>rg-aekzlki4ehfse4y</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the policy.</p>
         * <p>A smaller sequence number indicates a lower priority. When a route is matched, a policy with a higher priority is preferentially matched.</p>
         * <p><strong>Valid values: 1001 to 2000</strong></p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("RouteMapNum")
        public Integer routeMapNum;

        /**
         * <p>The status of the cache reserve instance. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong></li>
         * <li><strong>Not Available</strong>: Unavailable</li>
         * <li><strong>Executing</strong>: Executing</li>
         * <li><strong>Deleting</strong>: The node is being deleted.</li>
         * </ul>
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
         * <p>1655449505171</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Release Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-xgkb2kl</p>
         */
        @NameInMap("TransmissionInstanceId")
        public String transmissionInstanceId;

        /**
         * <p>Release Instance Name</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-transimit</p>
         */
        @NameInMap("TransmissionInstanceName")
        public String transmissionInstanceName;

        /**
         * <p>The tenant to which the published instance belongs</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        @NameInMap("TransmissionInstanceOwner")
        public String transmissionInstanceOwner;

        /**
         * <p>Publish instance type; optional values:</p>
         * <ul>
         * <li><strong>VPD</strong>: Lingjun network segment.</li>
         * <li><strong>VCC</strong>: Lingjun Connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPD</p>
         */
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

        public GetErRouteMapResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
