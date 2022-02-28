// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateDiskGroupRequest extends TeaModel {
    @NameInMap("DiskGroupId")
    public String diskGroupId;

    @NameInMap("Disks")
    public java.util.List<UpdateDiskGroupRequestDisks> disks;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SourceHostIpAddress")
    public String sourceHostIpAddress;

    @NameInMap("TargetHostIpAddress")
    public String targetHostIpAddress;

    @NameInMap("UserUid")
    public Long userUid;

    public static UpdateDiskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDiskGroupRequest self = new UpdateDiskGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDiskGroupRequest setDiskGroupId(String diskGroupId) {
        this.diskGroupId = diskGroupId;
        return this;
    }
    public String getDiskGroupId() {
        return this.diskGroupId;
    }

    public UpdateDiskGroupRequest setDisks(java.util.List<UpdateDiskGroupRequestDisks> disks) {
        this.disks = disks;
        return this;
    }
    public java.util.List<UpdateDiskGroupRequestDisks> getDisks() {
        return this.disks;
    }

    public UpdateDiskGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateDiskGroupRequest setSourceHostIpAddress(String sourceHostIpAddress) {
        this.sourceHostIpAddress = sourceHostIpAddress;
        return this;
    }
    public String getSourceHostIpAddress() {
        return this.sourceHostIpAddress;
    }

    public UpdateDiskGroupRequest setTargetHostIpAddress(String targetHostIpAddress) {
        this.targetHostIpAddress = targetHostIpAddress;
        return this;
    }
    public String getTargetHostIpAddress() {
        return this.targetHostIpAddress;
    }

    public UpdateDiskGroupRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

    public static class UpdateDiskGroupRequestDisks extends TeaModel {
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("SourceDiskSize")
        public Long sourceDiskSize;

        @NameInMap("TargetDiskId")
        public String targetDiskId;

        @NameInMap("TargetDiskSize")
        public Long targetDiskSize;

        public static UpdateDiskGroupRequestDisks build(java.util.Map<String, ?> map) throws Exception {
            UpdateDiskGroupRequestDisks self = new UpdateDiskGroupRequestDisks();
            return TeaModel.build(map, self);
        }

        public UpdateDiskGroupRequestDisks setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public UpdateDiskGroupRequestDisks setSourceDiskSize(Long sourceDiskSize) {
            this.sourceDiskSize = sourceDiskSize;
            return this;
        }
        public Long getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        public UpdateDiskGroupRequestDisks setTargetDiskId(String targetDiskId) {
            this.targetDiskId = targetDiskId;
            return this;
        }
        public String getTargetDiskId() {
            return this.targetDiskId;
        }

        public UpdateDiskGroupRequestDisks setTargetDiskSize(Long targetDiskSize) {
            this.targetDiskSize = targetDiskSize;
            return this;
        }
        public Long getTargetDiskSize() {
            return this.targetDiskSize;
        }

    }

}
