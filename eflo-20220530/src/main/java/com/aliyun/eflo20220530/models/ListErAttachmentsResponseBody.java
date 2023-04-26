// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErAttachmentsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListErAttachmentsResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListErAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListErAttachmentsResponseBody self = new ListErAttachmentsResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("Data")
        public java.util.List<ListErAttachmentsResponseBodyContentData> data;

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
