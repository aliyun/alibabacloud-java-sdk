// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OpenClawInstanceVO extends TeaModel {
    @NameInMap("AliyunAccountUid")
    public String aliyunAccountUid;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("BasicAuthPassword")
    public String basicAuthPassword;

    @NameInMap("BasicAuthUsername")
    public String basicAuthUsername;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Cpu")
    public Double cpu;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("ImageInfo")
    public OpenClawInstanceVOImageInfo imageInfo;

    @NameInMap("InstanceDesc")
    public String instanceDesc;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceRegion")
    public String instanceRegion;

    @NameInMap("LastActiveTime")
    public String lastActiveTime;

    @NameInMap("LockTime")
    public String lockTime;

    @NameInMap("MemorySize")
    public Integer memorySize;

    @NameInMap("OpenclawToken")
    public String openclawToken;

    @NameInMap("OwnerUid")
    public String ownerUid;

    @NameInMap("PublicDomain")
    public String publicDomain;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("StatusDesc")
    public String statusDesc;

    @NameInMap("StatusMessage")
    public String statusMessage;

    @NameInMap("TrialExpireTime")
    public String trialExpireTime;

    @NameInMap("Variables")
    public String variables;

    public static OpenClawInstanceVO build(java.util.Map<String, ?> map) throws Exception {
        OpenClawInstanceVO self = new OpenClawInstanceVO();
        return TeaModel.build(map, self);
    }

    public OpenClawInstanceVO setAliyunAccountUid(String aliyunAccountUid) {
        this.aliyunAccountUid = aliyunAccountUid;
        return this;
    }
    public String getAliyunAccountUid() {
        return this.aliyunAccountUid;
    }

    public OpenClawInstanceVO setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public OpenClawInstanceVO setBasicAuthPassword(String basicAuthPassword) {
        this.basicAuthPassword = basicAuthPassword;
        return this;
    }
    public String getBasicAuthPassword() {
        return this.basicAuthPassword;
    }

    public OpenClawInstanceVO setBasicAuthUsername(String basicAuthUsername) {
        this.basicAuthUsername = basicAuthUsername;
        return this;
    }
    public String getBasicAuthUsername() {
        return this.basicAuthUsername;
    }

    public OpenClawInstanceVO setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public OpenClawInstanceVO setCpu(Double cpu) {
        this.cpu = cpu;
        return this;
    }
    public Double getCpu() {
        return this.cpu;
    }

    public OpenClawInstanceVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public OpenClawInstanceVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public OpenClawInstanceVO setImageInfo(OpenClawInstanceVOImageInfo imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }
    public OpenClawInstanceVOImageInfo getImageInfo() {
        return this.imageInfo;
    }

    public OpenClawInstanceVO setInstanceDesc(String instanceDesc) {
        this.instanceDesc = instanceDesc;
        return this;
    }
    public String getInstanceDesc() {
        return this.instanceDesc;
    }

    public OpenClawInstanceVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OpenClawInstanceVO setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public OpenClawInstanceVO setInstanceRegion(String instanceRegion) {
        this.instanceRegion = instanceRegion;
        return this;
    }
    public String getInstanceRegion() {
        return this.instanceRegion;
    }

    public OpenClawInstanceVO setLastActiveTime(String lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
        return this;
    }
    public String getLastActiveTime() {
        return this.lastActiveTime;
    }

    public OpenClawInstanceVO setLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }
    public String getLockTime() {
        return this.lockTime;
    }

    public OpenClawInstanceVO setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public OpenClawInstanceVO setOpenclawToken(String openclawToken) {
        this.openclawToken = openclawToken;
        return this;
    }
    public String getOpenclawToken() {
        return this.openclawToken;
    }

    public OpenClawInstanceVO setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public OpenClawInstanceVO setPublicDomain(String publicDomain) {
        this.publicDomain = publicDomain;
        return this;
    }
    public String getPublicDomain() {
        return this.publicDomain;
    }

    public OpenClawInstanceVO setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public OpenClawInstanceVO setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }
    public String getStatusDesc() {
        return this.statusDesc;
    }

    public OpenClawInstanceVO setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }
    public String getStatusMessage() {
        return this.statusMessage;
    }

    public OpenClawInstanceVO setTrialExpireTime(String trialExpireTime) {
        this.trialExpireTime = trialExpireTime;
        return this;
    }
    public String getTrialExpireTime() {
        return this.trialExpireTime;
    }

    public OpenClawInstanceVO setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

    public static class OpenClawInstanceVOImageInfo extends TeaModel {
        @NameInMap("ImageId")
        public Long imageId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("VersionDesc")
        public String versionDesc;

        public static OpenClawInstanceVOImageInfo build(java.util.Map<String, ?> map) throws Exception {
            OpenClawInstanceVOImageInfo self = new OpenClawInstanceVOImageInfo();
            return TeaModel.build(map, self);
        }

        public OpenClawInstanceVOImageInfo setImageId(Long imageId) {
            this.imageId = imageId;
            return this;
        }
        public Long getImageId() {
            return this.imageId;
        }

        public OpenClawInstanceVOImageInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OpenClawInstanceVOImageInfo setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public OpenClawInstanceVOImageInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public OpenClawInstanceVOImageInfo setVersionDesc(String versionDesc) {
            this.versionDesc = versionDesc;
            return this;
        }
        public String getVersionDesc() {
            return this.versionDesc;
        }

    }

}
