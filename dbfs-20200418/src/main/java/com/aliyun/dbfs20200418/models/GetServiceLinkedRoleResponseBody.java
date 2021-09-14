// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DbfsLinkedRole")
    public Boolean dbfsLinkedRole;

    @NameInMap("RegionId")
    public String regionId;

    public static GetServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleResponseBody self = new GetServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceLinkedRoleResponseBody setDbfsLinkedRole(Boolean dbfsLinkedRole) {
        this.dbfsLinkedRole = dbfsLinkedRole;
        return this;
    }
    public Boolean getDbfsLinkedRole() {
        return this.dbfsLinkedRole;
    }

    public GetServiceLinkedRoleResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
