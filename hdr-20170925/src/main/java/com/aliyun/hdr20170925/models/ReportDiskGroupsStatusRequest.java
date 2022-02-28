// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDiskGroupsStatusRequest extends TeaModel {
    @NameInMap("DiskGroups")
    public String diskGroups;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportDiskGroupsStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportDiskGroupsStatusRequest self = new ReportDiskGroupsStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportDiskGroupsStatusRequest setDiskGroups(String diskGroups) {
        this.diskGroups = diskGroups;
        return this;
    }
    public String getDiskGroups() {
        return this.diskGroups;
    }

    public ReportDiskGroupsStatusRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportDiskGroupsStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportDiskGroupsStatusRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
