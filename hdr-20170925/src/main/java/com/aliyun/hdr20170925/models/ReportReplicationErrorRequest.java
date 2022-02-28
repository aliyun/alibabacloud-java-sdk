// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportReplicationErrorRequest extends TeaModel {
    @NameInMap("Errmsg")
    public String errmsg;

    @NameInMap("Errno")
    public String errno;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportReplicationErrorRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportReplicationErrorRequest self = new ReportReplicationErrorRequest();
        return TeaModel.build(map, self);
    }

    public ReportReplicationErrorRequest setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }
    public String getErrmsg() {
        return this.errmsg;
    }

    public ReportReplicationErrorRequest setErrno(String errno) {
        this.errno = errno;
        return this;
    }
    public String getErrno() {
        return this.errno;
    }

    public ReportReplicationErrorRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportReplicationErrorRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public ReportReplicationErrorRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
