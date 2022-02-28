// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class EnableDiskGroupReplicationRequest extends TeaModel {
    @NameInMap("DiskGroupId")
    public String diskGroupId;

    @NameInMap("Disks")
    public java.util.List<EnableDiskGroupReplicationRequestDisks> disks;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("TargetHostInstanceId")
    public String targetHostInstanceId;

    @NameInMap("TargetHostIpAddress")
    public String targetHostIpAddress;

    @NameInMap("UserUid")
    public Long userUid;

    public static EnableDiskGroupReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDiskGroupReplicationRequest self = new EnableDiskGroupReplicationRequest();
        return TeaModel.build(map, self);
    }

    public EnableDiskGroupReplicationRequest setDiskGroupId(String diskGroupId) {
        this.diskGroupId = diskGroupId;
        return this;
    }
    public String getDiskGroupId() {
        return this.diskGroupId;
    }

    public EnableDiskGroupReplicationRequest setDisks(java.util.List<EnableDiskGroupReplicationRequestDisks> disks) {
        this.disks = disks;
        return this;
    }
    public java.util.List<EnableDiskGroupReplicationRequestDisks> getDisks() {
        return this.disks;
    }

    public EnableDiskGroupReplicationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public EnableDiskGroupReplicationRequest setTargetHostInstanceId(String targetHostInstanceId) {
        this.targetHostInstanceId = targetHostInstanceId;
        return this;
    }
    public String getTargetHostInstanceId() {
        return this.targetHostInstanceId;
    }

    public EnableDiskGroupReplicationRequest setTargetHostIpAddress(String targetHostIpAddress) {
        this.targetHostIpAddress = targetHostIpAddress;
        return this;
    }
    public String getTargetHostIpAddress() {
        return this.targetHostIpAddress;
    }

    public EnableDiskGroupReplicationRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

    public static class EnableDiskGroupReplicationRequestDisks extends TeaModel {
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("TargetDiskId")
        public String targetDiskId;

        public static EnableDiskGroupReplicationRequestDisks build(java.util.Map<String, ?> map) throws Exception {
            EnableDiskGroupReplicationRequestDisks self = new EnableDiskGroupReplicationRequestDisks();
            return TeaModel.build(map, self);
        }

        public EnableDiskGroupReplicationRequestDisks setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public EnableDiskGroupReplicationRequestDisks setTargetDiskId(String targetDiskId) {
            this.targetDiskId = targetDiskId;
            return this;
        }
        public String getTargetDiskId() {
            return this.targetDiskId;
        }

    }

}
