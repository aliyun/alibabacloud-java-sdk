// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsAppIcpRecordShrinkRequest extends TeaModel {
    /**
     * <p>app-icp备案实体id列表</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppIcpRecordIdList")
    public String appIcpRecordIdListShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QuerySmsAppIcpRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsAppIcpRecordShrinkRequest self = new QuerySmsAppIcpRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsAppIcpRecordShrinkRequest setAppIcpRecordIdListShrink(String appIcpRecordIdListShrink) {
        this.appIcpRecordIdListShrink = appIcpRecordIdListShrink;
        return this;
    }
    public String getAppIcpRecordIdListShrink() {
        return this.appIcpRecordIdListShrink;
    }

    public QuerySmsAppIcpRecordShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsAppIcpRecordShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsAppIcpRecordShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
