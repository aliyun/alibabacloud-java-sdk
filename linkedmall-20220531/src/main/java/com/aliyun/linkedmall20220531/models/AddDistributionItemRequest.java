// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class AddDistributionItemRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

    // 分销商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // 商品id
    @NameInMap("LmItemIds")
    public java.util.List<String> lmItemIds;

    public static AddDistributionItemRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDistributionItemRequest self = new AddDistributionItemRequest();
        return TeaModel.build(map, self);
    }

    public AddDistributionItemRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AddDistributionItemRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public AddDistributionItemRequest setLmItemIds(java.util.List<String> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.List<String> getLmItemIds() {
        return this.lmItemIds;
    }

}
