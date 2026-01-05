// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTrademarkRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>商标实体id列表</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TrademarkIdList")
    public java.util.List<Long> trademarkIdList;

    public static QuerySmsTrademarkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTrademarkRequest self = new QuerySmsTrademarkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsTrademarkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsTrademarkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsTrademarkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsTrademarkRequest setTrademarkIdList(java.util.List<Long> trademarkIdList) {
        this.trademarkIdList = trademarkIdList;
        return this;
    }
    public java.util.List<Long> getTrademarkIdList() {
        return this.trademarkIdList;
    }

}
