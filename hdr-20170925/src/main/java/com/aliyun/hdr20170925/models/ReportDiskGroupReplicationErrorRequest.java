// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDiskGroupReplicationErrorRequest extends TeaModel {
    @NameInMap("DiskGroupId")
    public String diskGroupId;

    @NameInMap("Errmsg")
    public String errmsg;

    @NameInMap("Errno")
    public String errno;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportDiskGroupReplicationErrorRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportDiskGroupReplicationErrorRequest self = new ReportDiskGroupReplicationErrorRequest();
        return TeaModel.build(map, self);
    }

    public ReportDiskGroupReplicationErrorRequest setDiskGroupId(String diskGroupId) {
        this.diskGroupId = diskGroupId;
        return this;
    }
    public String getDiskGroupId() {
        return this.diskGroupId;
    }

    public ReportDiskGroupReplicationErrorRequest setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }
    public String getErrmsg() {
        return this.errmsg;
    }

    public ReportDiskGroupReplicationErrorRequest setErrno(String errno) {
        this.errno = errno;
        return this;
    }
    public String getErrno() {
        return this.errno;
    }

    public ReportDiskGroupReplicationErrorRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportDiskGroupReplicationErrorRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
