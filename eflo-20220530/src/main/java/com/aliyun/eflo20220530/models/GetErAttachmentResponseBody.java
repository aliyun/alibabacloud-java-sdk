// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErAttachmentResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Content")
    public GetErAttachmentResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is displayed.)</p>
     * 
     * <strong>example:</strong>
     * <p>You don\&quot;t have the permission to do this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7F0D9440-1F97-5613-87CD-D3047172A93C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetErAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErAttachmentResponseBody self = new GetErAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErAttachmentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetErAttachmentResponseBody setContent(GetErAttachmentResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetErAttachmentResponseBodyContent getContent() {
        return this.content;
    }

    public GetErAttachmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetErAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetErAttachmentResponseBodyContent extends TeaModel {
        /**
         * <p>Whether cross-account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The network instance is a cross-account resource.</li>
         * <li><strong>false</strong>: The current network instance is a resource of the current account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fasle</p>
         */
        @NameInMap("Across")
        public Boolean across;

        /**
         * <p>Indicates whether to automatically receive all routes from all instances under the Lingjun HUB. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: received automatically.</li>
         * <li><strong>false</strong>: Not received.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoReceiveAllRoute")
        public Boolean autoReceiveAllRoute;

        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1648085472000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the Lingjun HUB network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>er-attachment-i1ioibyf</p>
         */
        @NameInMap("ErAttachmentId")
        public String erAttachmentId;

        /**
         * <p>The name of the Lingjun HUB network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-lxnsj2cx</p>
         */
        @NameInMap("ErAttachmentName")
        public String erAttachmentName;

        /**
         * <p>The ID of the Lingjun HUB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>er-aueyxxsy</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>The time when the O\&amp;M task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1648085472000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the network instance. Valid values: <strong>VPD</strong> and <strong>VCC</strong>.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/444430.html">What is Lingjun?</a></p>
         * <p>You can query <strong>Lingjun CIDR blocks</strong> and <strong>Lingjun connections</strong> by <a href="https://help.aliyun.com/document_detail/2331077.html">ListVpds</a> and <a href="https://help.aliyun.com/document_detail/2399526.html?">ListVccs</a> respectively.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-lxnsj2cx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-wulanchabu-main</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The database type. Valid values:</p>
         * <ul>
         * <li><strong>VPD</strong>: indicates the Lingjun CIDR block.</li>
         * <li><strong>VCC</strong>: indicates a Lingjun connection.</li>
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
         * <p>test</p>
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
         * <p>rg-aekzb3n5lgk2ieq</p>
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
         * <p>The status of the cache reserve instance. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong>: Normal.</li>
         * <li><strong>Not Available</strong>: Not available.</li>
         * <li><strong>Executing</strong>: The task is being executed.</li>
         * <li><strong>Deleting</strong>: The account is being deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1655449505171</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static GetErAttachmentResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetErAttachmentResponseBodyContent self = new GetErAttachmentResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetErAttachmentResponseBodyContent setAcross(Boolean across) {
            this.across = across;
            return this;
        }
        public Boolean getAcross() {
            return this.across;
        }

        public GetErAttachmentResponseBodyContent setAutoReceiveAllRoute(Boolean autoReceiveAllRoute) {
            this.autoReceiveAllRoute = autoReceiveAllRoute;
            return this;
        }
        public Boolean getAutoReceiveAllRoute() {
            return this.autoReceiveAllRoute;
        }

        public GetErAttachmentResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetErAttachmentResponseBodyContent setErAttachmentId(String erAttachmentId) {
            this.erAttachmentId = erAttachmentId;
            return this;
        }
        public String getErAttachmentId() {
            return this.erAttachmentId;
        }

        public GetErAttachmentResponseBodyContent setErAttachmentName(String erAttachmentName) {
            this.erAttachmentName = erAttachmentName;
            return this;
        }
        public String getErAttachmentName() {
            return this.erAttachmentName;
        }

        public GetErAttachmentResponseBodyContent setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetErAttachmentResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetErAttachmentResponseBodyContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetErAttachmentResponseBodyContent setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetErAttachmentResponseBodyContent setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetErAttachmentResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetErAttachmentResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetErAttachmentResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetErAttachmentResponseBodyContent setResourceTenantId(String resourceTenantId) {
            this.resourceTenantId = resourceTenantId;
            return this;
        }
        public String getResourceTenantId() {
            return this.resourceTenantId;
        }

        public GetErAttachmentResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetErAttachmentResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
