// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class GetSubscriptionItemRequest extends TeaModel {
    @NameInMap("ItemId")
    public Integer itemId;

    @NameInMap("Locale")
    public String locale;

    public static GetSubscriptionItemRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionItemRequest self = new GetSubscriptionItemRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionItemRequest setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }
    public Integer getItemId() {
        return this.itemId;
    }

    public GetSubscriptionItemRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

}
