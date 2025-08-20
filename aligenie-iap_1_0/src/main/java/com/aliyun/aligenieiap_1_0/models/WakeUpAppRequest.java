// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class WakeUpAppRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDebug")
    public Boolean isDebug;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>应用拉起路径</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetInfo")
    public WakeUpAppRequestTargetInfo targetInfo;

    public static WakeUpAppRequest build(java.util.Map<String, ?> map) throws Exception {
        WakeUpAppRequest self = new WakeUpAppRequest();
        return TeaModel.build(map, self);
    }

    public WakeUpAppRequest setIsDebug(Boolean isDebug) {
        this.isDebug = isDebug;
        return this;
    }
    public Boolean getIsDebug() {
        return this.isDebug;
    }

    public WakeUpAppRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public WakeUpAppRequest setTargetInfo(WakeUpAppRequestTargetInfo targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public WakeUpAppRequestTargetInfo getTargetInfo() {
        return this.targetInfo;
    }

    public static class WakeUpAppRequestTargetInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apk包名</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2VpiDQ6aMjxz******Eo7r6e08oIVZ3fKrm5TyEfY=</p>
         */
        @NameInMap("TargetIdentity")
        public String targetIdentity;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEVICE_OPEN_ID</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static WakeUpAppRequestTargetInfo build(java.util.Map<String, ?> map) throws Exception {
            WakeUpAppRequestTargetInfo self = new WakeUpAppRequestTargetInfo();
            return TeaModel.build(map, self);
        }

        public WakeUpAppRequestTargetInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public WakeUpAppRequestTargetInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public WakeUpAppRequestTargetInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public WakeUpAppRequestTargetInfo setTargetIdentity(String targetIdentity) {
            this.targetIdentity = targetIdentity;
            return this;
        }
        public String getTargetIdentity() {
            return this.targetIdentity;
        }

        public WakeUpAppRequestTargetInfo setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
