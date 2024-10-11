// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1352345930******</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DbfsLinkedRole")
    public Boolean dbfsLinkedRole;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public GetServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
