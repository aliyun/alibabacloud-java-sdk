// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardFlowInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Iccid")
    public String iccid;

    public static QueryCardFlowInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCardFlowInfoRequest self = new QueryCardFlowInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCardFlowInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCardFlowInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryCardFlowInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryCardFlowInfoRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

}
