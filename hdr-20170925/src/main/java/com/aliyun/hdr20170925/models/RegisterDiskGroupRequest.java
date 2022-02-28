// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RegisterDiskGroupRequest extends TeaModel {
    @NameInMap("Disks")
    public java.util.List<RegisterDiskGroupRequestDisks> disks;

    @NameInMap("HostInstanceId")
    public String hostInstanceId;

    @NameInMap("HostIpAddress")
    public String hostIpAddress;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SitePairId")
    public String sitePairId;

    @NameInMap("UserUid")
    public Long userUid;

    public static RegisterDiskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDiskGroupRequest self = new RegisterDiskGroupRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDiskGroupRequest setDisks(java.util.List<RegisterDiskGroupRequestDisks> disks) {
        this.disks = disks;
        return this;
    }
    public java.util.List<RegisterDiskGroupRequestDisks> getDisks() {
        return this.disks;
    }

    public RegisterDiskGroupRequest setHostInstanceId(String hostInstanceId) {
        this.hostInstanceId = hostInstanceId;
        return this;
    }
    public String getHostInstanceId() {
        return this.hostInstanceId;
    }

    public RegisterDiskGroupRequest setHostIpAddress(String hostIpAddress) {
        this.hostIpAddress = hostIpAddress;
        return this;
    }
    public String getHostIpAddress() {
        return this.hostIpAddress;
    }

    public RegisterDiskGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RegisterDiskGroupRequest setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

    public RegisterDiskGroupRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

    public static class RegisterDiskGroupRequestDisks extends TeaModel {
        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskSize")
        public Long diskSize;

        public static RegisterDiskGroupRequestDisks build(java.util.Map<String, ?> map) throws Exception {
            RegisterDiskGroupRequestDisks self = new RegisterDiskGroupRequestDisks();
            return TeaModel.build(map, self);
        }

        public RegisterDiskGroupRequestDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public RegisterDiskGroupRequestDisks setDiskSize(Long diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Long getDiskSize() {
            return this.diskSize;
        }

    }

}
