// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErAttachmentsResponseBody extends TeaModel {
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
     * <p>The data returned.</p>
     */
    @NameInMap("Content")
    public ListErAttachmentsResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is displayed.)</p>
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
     * <p>3D9D6E7B-365B-5200-BFA6-9B79E269058C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListErAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListErAttachmentsResponseBody self = new ListErAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListErAttachmentsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListErAttachmentsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListErAttachmentsResponseBody setContent(ListErAttachmentsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListErAttachmentsResponseBodyContent getContent() {
        return this.content;
    }

    public ListErAttachmentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListErAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListErAttachmentsResponseBodyContentData extends TeaModel {
        /**
         * <p>Whether to cross accounts. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The network instance is a cross-account resource.</li>
         * <li><strong>false</strong>: The current network instance is a resource of the current account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Across")
        public Boolean across;

        /**
         * <p>Whether to automatically receive all routes from all instances under this Lingjun HUB. Valid values:</p>
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
         * <p>1669734207000</p>
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
         * <p>vcc-cn-209300qha01</p>
         */
        @NameInMap("ErAttachmentName")
        public String erAttachmentName;

        /**
         * <p>The ID of the Lingjun HUB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>The time when the O\&amp;M task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1640187007000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the network instance. Valid values: <strong>VPD</strong> and <strong>VCC</strong>.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/444430.html">What is Lingjun?</a></p>
         * <p>You can query <strong>Lingjun CIDR blocks</strong> and <strong>Lingjun connections</strong> by <a href="https://help.aliyun.com/document_detail/2331077.html">ListVpds</a> and <a href="https://help.aliyun.com/document_detail/2399526.html">ListVccs</a> respectively.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-209300qha02</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-wulanchabu-main</p>
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
         * <p>VCC</p>
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
         * <p>Lingjun HUB region information.</p>
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
         * <p>The ID of the tenant to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1111156667137893</p>
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

        public static ListErAttachmentsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListErAttachmentsResponseBodyContentData self = new ListErAttachmentsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListErAttachmentsResponseBodyContentData setAcross(Boolean across) {
            this.across = across;
            return this;
        }
        public Boolean getAcross() {
            return this.across;
        }

        public ListErAttachmentsResponseBodyContentData setAutoReceiveAllRoute(Boolean autoReceiveAllRoute) {
            this.autoReceiveAllRoute = autoReceiveAllRoute;
            return this;
        }
        public Boolean getAutoReceiveAllRoute() {
            return this.autoReceiveAllRoute;
        }

        public ListErAttachmentsResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListErAttachmentsResponseBodyContentData setErAttachmentId(String erAttachmentId) {
            this.erAttachmentId = erAttachmentId;
            return this;
        }
        public String getErAttachmentId() {
            return this.erAttachmentId;
        }

        public ListErAttachmentsResponseBodyContentData setErAttachmentName(String erAttachmentName) {
            this.erAttachmentName = erAttachmentName;
            return this;
        }
        public String getErAttachmentName() {
            return this.erAttachmentName;
        }

        public ListErAttachmentsResponseBodyContentData setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public ListErAttachmentsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListErAttachmentsResponseBodyContentData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListErAttachmentsResponseBodyContentData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListErAttachmentsResponseBodyContentData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListErAttachmentsResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListErAttachmentsResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListErAttachmentsResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListErAttachmentsResponseBodyContentData setResourceTenantId(String resourceTenantId) {
            this.resourceTenantId = resourceTenantId;
            return this;
        }
        public String getResourceTenantId() {
            return this.resourceTenantId;
        }

        public ListErAttachmentsResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListErAttachmentsResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListErAttachmentsResponseBodyContent extends TeaModel {
        /**
         * <p>The list of Lingjun HUB network instances.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListErAttachmentsResponseBodyContentData> data;

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListErAttachmentsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListErAttachmentsResponseBodyContent self = new ListErAttachmentsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListErAttachmentsResponseBodyContent setData(java.util.List<ListErAttachmentsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListErAttachmentsResponseBodyContentData> getData() {
            return this.data;
        }

        public ListErAttachmentsResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
