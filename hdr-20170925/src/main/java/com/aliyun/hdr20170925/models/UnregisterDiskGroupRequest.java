// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UnregisterDiskGroupRequest extends TeaModel {
    @NameInMap("DiskGroupId")
    public String diskGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserUid")
    public Long userUid;

    public static UnregisterDiskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UnregisterDiskGroupRequest self = new UnregisterDiskGroupRequest();
        return TeaModel.build(map, self);
    }

    public UnregisterDiskGroupRequest setDiskGroupId(String diskGroupId) {
        this.diskGroupId = diskGroupId;
        return this;
    }
    public String getDiskGroupId() {
        return this.diskGroupId;
    }

    public UnregisterDiskGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UnregisterDiskGroupRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
