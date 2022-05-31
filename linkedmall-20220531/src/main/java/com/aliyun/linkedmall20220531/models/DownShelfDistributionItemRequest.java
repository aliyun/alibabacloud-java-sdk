// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class DownShelfDistributionItemRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

    // 分销商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // lm商品id
    @NameInMap("LmItemIds")
    public java.util.List<String> lmItemIds;

    public static DownShelfDistributionItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DownShelfDistributionItemRequest self = new DownShelfDistributionItemRequest();
        return TeaModel.build(map, self);
    }

    public DownShelfDistributionItemRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DownShelfDistributionItemRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public DownShelfDistributionItemRequest setLmItemIds(java.util.List<String> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.List<String> getLmItemIds() {
        return this.lmItemIds;
    }

}
