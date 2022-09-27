// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class CreateSubscriptionItemRequest extends TeaModel {
    @NameInMap("ItemName")
    public String itemName;

    @NameInMap("Locale")
    public String locale;

    public static CreateSubscriptionItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionItemRequest self = new CreateSubscriptionItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionItemRequest setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public CreateSubscriptionItemRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

}
