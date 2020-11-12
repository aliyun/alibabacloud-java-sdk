// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetItemPromotionRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ItemId")
    @Validation(required = true)
    public Long itemId;

    @NameInMap("LmItemId")
    public String lmItemId;

    public static GetItemPromotionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetItemPromotionRequest self = new GetItemPromotionRequest();
        return TeaModel.build(map, self);
    }

    public GetItemPromotionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetItemPromotionRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public GetItemPromotionRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

}
