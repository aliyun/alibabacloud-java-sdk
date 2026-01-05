// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTrademarkShrinkRequest extends TeaModel {
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
    public String trademarkIdListShrink;

    public static QuerySmsTrademarkShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTrademarkShrinkRequest self = new QuerySmsTrademarkShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsTrademarkShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsTrademarkShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsTrademarkShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsTrademarkShrinkRequest setTrademarkIdListShrink(String trademarkIdListShrink) {
        this.trademarkIdListShrink = trademarkIdListShrink;
        return this;
    }
    public String getTrademarkIdListShrink() {
        return this.trademarkIdListShrink;
    }

}
