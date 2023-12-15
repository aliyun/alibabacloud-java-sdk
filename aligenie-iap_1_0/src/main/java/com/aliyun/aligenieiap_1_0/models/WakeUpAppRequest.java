// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class WakeUpAppRequest extends TeaModel {
    @NameInMap("IsDebug")
    public Boolean isDebug;

    @NameInMap("Path")
    public String path;

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
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("TargetIdentity")
        public String targetIdentity;

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
