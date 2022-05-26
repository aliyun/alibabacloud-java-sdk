// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindAllContacterRequest extends TeaModel {
    @NameInMap("LocaleString")
    public String localeString;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserId")
    public Long userId;

    public static FindAllContacterRequest build(java.util.Map<String, ?> map) throws Exception {
        FindAllContacterRequest self = new FindAllContacterRequest();
        return TeaModel.build(map, self);
    }

    public FindAllContacterRequest setLocaleString(String localeString) {
        this.localeString = localeString;
        return this;
    }
    public String getLocaleString() {
        return this.localeString;
    }

    public FindAllContacterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FindAllContacterRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
