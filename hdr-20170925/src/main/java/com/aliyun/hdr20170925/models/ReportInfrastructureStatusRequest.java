// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportInfrastructureStatusRequest extends TeaModel {
    @NameInMap("Errno")
    public String errno;

    @NameInMap("InfrastructureId")
    public String infrastructureId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportInfrastructureStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportInfrastructureStatusRequest self = new ReportInfrastructureStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportInfrastructureStatusRequest setErrno(String errno) {
        this.errno = errno;
        return this;
    }
    public String getErrno() {
        return this.errno;
    }

    public ReportInfrastructureStatusRequest setInfrastructureId(String infrastructureId) {
        this.infrastructureId = infrastructureId;
        return this;
    }
    public String getInfrastructureId() {
        return this.infrastructureId;
    }

    public ReportInfrastructureStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportInfrastructureStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ReportInfrastructureStatusRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
