// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotInfoListRequest extends TeaModel {
    /**
     * <p>The review state. Valid values:</p>
     * <br>
     * <p>*   **CONFIGURABLE**</p>
     * <p>*   **AUDITING**</p>
     * <p>*   **AUDITPASS**</p>
     * <p>*   **AUDITFAIL**</p>
     */
    @NameInMap("AuditStatus")
    public String auditStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryRobotInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotInfoListRequest self = new QueryRobotInfoListRequest();
        return TeaModel.build(map, self);
    }

    public QueryRobotInfoListRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public QueryRobotInfoListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryRobotInfoListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryRobotInfoListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
