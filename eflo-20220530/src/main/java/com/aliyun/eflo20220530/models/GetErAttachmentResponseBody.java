// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErAttachmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetErAttachmentResponseBodyContent content;

    @NameInMap("Message")
    public String message;

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
