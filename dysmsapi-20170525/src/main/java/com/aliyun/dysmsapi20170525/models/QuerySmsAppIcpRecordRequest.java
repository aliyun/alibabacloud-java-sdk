// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsAppIcpRecordRequest extends TeaModel {
    /**
     * <p>app-icp备案实体id列表</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppIcpRecordIdList")
    public java.util.List<Long> appIcpRecordIdList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QuerySmsAppIcpRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsAppIcpRecordRequest self = new QuerySmsAppIcpRecordRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsAppIcpRecordRequest setAppIcpRecordIdList(java.util.List<Long> appIcpRecordIdList) {
        this.appIcpRecordIdList = appIcpRecordIdList;
        return this;
    }
    public java.util.List<Long> getAppIcpRecordIdList() {
        return this.appIcpRecordIdList;
    }

    public QuerySmsAppIcpRecordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsAppIcpRecordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsAppIcpRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
