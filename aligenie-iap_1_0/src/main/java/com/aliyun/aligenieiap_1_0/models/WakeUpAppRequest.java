// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class WakeUpAppRequest extends TeaModel {
    /**
     * <p>The debug identity. When the skill application is in the debugging phase, this setting determines whether the retrieved skill application information is from the editing state or the online state.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDebug")
    public Boolean isDebug;

    /**
     * <p>The path to launch the application, similar to the Link you enter in the skill application console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>应用拉起路径</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Device Information of the target to be launched.</p>
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
         * <p>The value corresponding to the encoding type.  </p>
         * <ul>
         * <li>When the encoding type is SKILLID, the value is the skill ID obtained from the webhook service.  </li>
         * <li>When the encoding type is PACKAGENAME, the value is the packageName of the corresponding client application.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apk包名</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the MeowGenie device ID, and each method corresponds to a different encoding type:  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name  </li>
         * <li>SKILL_ID: Skill ID</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Organization ID. This is required only when the push type is <code>XX_UNION_XX</code>. If you have multiple methods to obtain MeowGenie device IDs and need interoperability among them, you must request an organization from the platform. After approval, the platform will assign an organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>The identity value corresponding to the Push Target Type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2VpiDQ6aMjxz******Eo7r6e08oIVZ3fKrm5TyEfY=</p>
         */
        @NameInMap("TargetIdentity")
        public String targetIdentity;

        /**
         * <p>Push Target Type, which indicates the type of the obtained device identity:  </p>
         * <ul>
         * <li><code>DEVICE_UNION_ID</code>: Device unionId  </li>
         * <li><code>DEVICE_OPEN_ID</code>: Device openId</li>
         * </ul>
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
