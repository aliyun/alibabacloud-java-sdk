// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetSubscriptionItemDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ItemId")
    public Integer itemId;

    /**
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("Locale")
    public String locale;

    public static GetSubscriptionItemDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionItemDetailRequest self = new GetSubscriptionItemDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionItemDetailRequest setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }
    public Integer getItemId() {
        return this.itemId;
    }

    public GetSubscriptionItemDetailRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

}
