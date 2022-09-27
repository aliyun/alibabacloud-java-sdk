// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class ListSubscriptionItemGroupDetailsRequest extends TeaModel {
    @NameInMap("Locale")
    public String locale;

    public static ListSubscriptionItemGroupDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionItemGroupDetailsRequest self = new ListSubscriptionItemGroupDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionItemGroupDetailsRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

}
