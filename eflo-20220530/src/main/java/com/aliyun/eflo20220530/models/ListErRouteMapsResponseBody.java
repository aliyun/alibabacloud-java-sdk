// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErRouteMapsResponseBody extends TeaModel {
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
    public ListErRouteMapsResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0901F411-28FA-5B9C-BAEE-7776463FF0DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListErRouteMapsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListErRouteMapsResponseBody self = new ListErRouteMapsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListErRouteMapsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListErRouteMapsResponseBody setContent(ListErRouteMapsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListErRouteMapsResponseBodyContent getContent() {
        return this.content;
    }

    public ListErRouteMapsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListErRouteMapsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListErRouteMapsResponseBodyContentData extends TeaModel {
        /**
         * <p>Policy behavior; optional values:</p>
         * <ul>
         * <li><strong>permit</strong>: Allow</li>
         * <li><strong>deny</strong>: Prohibited</li>
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
         * <p>1601176751000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Policy description</p>
         * 
         * <strong>example:</strong>
         * <p>No description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Destination CIDR Block</p>
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
         * <p>routing policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-rmap-uwglhzom</p>
         */
        @NameInMap("ErRouteMapId")
        public String erRouteMapId;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1601176751000</p>
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
         * <p>vpd-9rgxqazc</p>
         */
        @NameInMap("ReceptionInstanceId")
        public String receptionInstanceId;

        /**
         * <p>Receive Instance Name</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-reception</p>
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
         * <p>The type of the received instance. Possible values:</p>
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
         * <p>rg-aek2l4sq6l7unhi</p>
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
         * <p>Status The status of the instance. Valid values:</p>
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
         * <p>vpd-8rgvqazb</p>
         */
        @NameInMap("TransmissionInstanceId")
        public String transmissionInstanceId;

        /**
         * <p>Release Instance Name</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-transmit</p>
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
         * <p>The type of the published instance. Possible values:</p>
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

        public static ListErRouteMapsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListErRouteMapsResponseBodyContentData self = new ListErRouteMapsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListErRouteMapsResponseBodyContentData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListErRouteMapsResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListErRouteMapsResponseBodyContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListErRouteMapsResponseBodyContentData setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListErRouteMapsResponseBodyContentData setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public ListErRouteMapsResponseBodyContentData setErRouteMapId(String erRouteMapId) {
            this.erRouteMapId = erRouteMapId;
            return this;
        }
        public String getErRouteMapId() {
            return this.erRouteMapId;
        }

        public ListErRouteMapsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListErRouteMapsResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListErRouteMapsResponseBodyContentData setReceptionInstanceId(String receptionInstanceId) {
            this.receptionInstanceId = receptionInstanceId;
            return this;
        }
        public String getReceptionInstanceId() {
            return this.receptionInstanceId;
        }

        public ListErRouteMapsResponseBodyContentData setReceptionInstanceName(String receptionInstanceName) {
            this.receptionInstanceName = receptionInstanceName;
            return this;
        }
        public String getReceptionInstanceName() {
            return this.receptionInstanceName;
        }

        public ListErRouteMapsResponseBodyContentData setReceptionInstanceOwner(String receptionInstanceOwner) {
            this.receptionInstanceOwner = receptionInstanceOwner;
            return this;
        }
        public String getReceptionInstanceOwner() {
            return this.receptionInstanceOwner;
        }

        public ListErRouteMapsResponseBodyContentData setReceptionInstanceType(String receptionInstanceType) {
            this.receptionInstanceType = receptionInstanceType;
            return this;
        }
        public String getReceptionInstanceType() {
            return this.receptionInstanceType;
        }

        public ListErRouteMapsResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListErRouteMapsResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListErRouteMapsResponseBodyContentData setRouteMapNum(Integer routeMapNum) {
            this.routeMapNum = routeMapNum;
            return this;
        }
        public Integer getRouteMapNum() {
            return this.routeMapNum;
        }

        public ListErRouteMapsResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListErRouteMapsResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListErRouteMapsResponseBodyContentData setTransmissionInstanceId(String transmissionInstanceId) {
            this.transmissionInstanceId = transmissionInstanceId;
            return this;
        }
        public String getTransmissionInstanceId() {
            return this.transmissionInstanceId;
        }

        public ListErRouteMapsResponseBodyContentData setTransmissionInstanceName(String transmissionInstanceName) {
            this.transmissionInstanceName = transmissionInstanceName;
            return this;
        }
        public String getTransmissionInstanceName() {
            return this.transmissionInstanceName;
        }

        public ListErRouteMapsResponseBodyContentData setTransmissionInstanceOwner(String transmissionInstanceOwner) {
            this.transmissionInstanceOwner = transmissionInstanceOwner;
            return this;
        }
        public String getTransmissionInstanceOwner() {
            return this.transmissionInstanceOwner;
        }

        public ListErRouteMapsResponseBodyContentData setTransmissionInstanceType(String transmissionInstanceType) {
            this.transmissionInstanceType = transmissionInstanceType;
            return this;
        }
        public String getTransmissionInstanceType() {
            return this.transmissionInstanceType;
        }

    }

    public static class ListErRouteMapsResponseBodyContent extends TeaModel {
        /**
         * <p>routing policy information list</p>
         */
        @NameInMap("Data")
        public java.util.List<ListErRouteMapsResponseBodyContentData> data;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListErRouteMapsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListErRouteMapsResponseBodyContent self = new ListErRouteMapsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListErRouteMapsResponseBodyContent setData(java.util.List<ListErRouteMapsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListErRouteMapsResponseBodyContentData> getData() {
            return this.data;
        }

        public ListErRouteMapsResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
