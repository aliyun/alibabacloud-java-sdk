// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class PushDeviceNotificationRequest extends TeaModel {
    @NameInMap("TenantInfo")
    public PushDeviceNotificationRequestTenantInfo tenantInfo;

    @NameInMap("body")
    public PushDeviceNotificationRequestBody body;

    public static PushDeviceNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDeviceNotificationRequest self = new PushDeviceNotificationRequest();
        return TeaModel.build(map, self);
    }

    public PushDeviceNotificationRequest setTenantInfo(PushDeviceNotificationRequestTenantInfo tenantInfo) {
        this.tenantInfo = tenantInfo;
        return this;
    }
    public PushDeviceNotificationRequestTenantInfo getTenantInfo() {
        return this.tenantInfo;
    }

    public PushDeviceNotificationRequest setBody(PushDeviceNotificationRequestBody body) {
        this.body = body;
        return this;
    }
    public PushDeviceNotificationRequestBody getBody() {
        return this.body;
    }

    public static class PushDeviceNotificationRequestTenantInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12797******304102</p>
         */
        @NameInMap("SubjectId")
        public String subjectId;

        public static PushDeviceNotificationRequestTenantInfo build(java.util.Map<String, ?> map) throws Exception {
            PushDeviceNotificationRequestTenantInfo self = new PushDeviceNotificationRequestTenantInfo();
            return TeaModel.build(map, self);
        }

        public PushDeviceNotificationRequestTenantInfo setSubjectId(String subjectId) {
            this.subjectId = subjectId;
            return this;
        }
        public String getSubjectId() {
            return this.subjectId;
        }

    }

    public static class PushDeviceNotificationRequestBodySendTarget extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2VpiDQ6aMjxz******Eo7r6e08oIVZ3fKrm5TyEfY=</p>
         */
        @NameInMap("TargetIdentity")
        public String targetIdentity;

        /**
         * <strong>example:</strong>
         * <p>DEVICE_OPEN_ID</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static PushDeviceNotificationRequestBodySendTarget build(java.util.Map<String, ?> map) throws Exception {
            PushDeviceNotificationRequestBodySendTarget self = new PushDeviceNotificationRequestBodySendTarget();
            return TeaModel.build(map, self);
        }

        public PushDeviceNotificationRequestBodySendTarget setTargetIdentity(String targetIdentity) {
            this.targetIdentity = targetIdentity;
            return this;
        }
        public String getTargetIdentity() {
            return this.targetIdentity;
        }

        public PushDeviceNotificationRequestBodySendTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class PushDeviceNotificationRequestBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1923792******8R7392</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDebug")
        public Boolean isDebug;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2iU81*****G9elJ</p>
         */
        @NameInMap("MessageTemplateId")
        public String messageTemplateId;

        /**
         * <strong>example:</strong>
         * <p>29837******2938</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("PlaceHolder")
        public java.util.Map<String, String> placeHolder;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SendTarget")
        public PushDeviceNotificationRequestBodySendTarget sendTarget;

        public static PushDeviceNotificationRequestBody build(java.util.Map<String, ?> map) throws Exception {
            PushDeviceNotificationRequestBody self = new PushDeviceNotificationRequestBody();
            return TeaModel.build(map, self);
        }

        public PushDeviceNotificationRequestBody setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PushDeviceNotificationRequestBody setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PushDeviceNotificationRequestBody setIsDebug(Boolean isDebug) {
            this.isDebug = isDebug;
            return this;
        }
        public Boolean getIsDebug() {
            return this.isDebug;
        }

        public PushDeviceNotificationRequestBody setMessageTemplateId(String messageTemplateId) {
            this.messageTemplateId = messageTemplateId;
            return this;
        }
        public String getMessageTemplateId() {
            return this.messageTemplateId;
        }

        public PushDeviceNotificationRequestBody setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public PushDeviceNotificationRequestBody setPlaceHolder(java.util.Map<String, String> placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }
        public java.util.Map<String, String> getPlaceHolder() {
            return this.placeHolder;
        }

        public PushDeviceNotificationRequestBody setSendTarget(PushDeviceNotificationRequestBodySendTarget sendTarget) {
            this.sendTarget = sendTarget;
            return this;
        }
        public PushDeviceNotificationRequestBodySendTarget getSendTarget() {
            return this.sendTarget;
        }

    }

}
