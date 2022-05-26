// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindContacterRequest extends TeaModel {
    @NameInMap("ContacterId")
    public Long contacterId;

    @NameInMap("LocaleString")
    public String localeString;

    @NameInMap("Type")
    public String type;

    public static FindContacterRequest build(java.util.Map<String, ?> map) throws Exception {
        FindContacterRequest self = new FindContacterRequest();
        return TeaModel.build(map, self);
    }

    public FindContacterRequest setContacterId(Long contacterId) {
        this.contacterId = contacterId;
        return this;
    }
    public Long getContacterId() {
        return this.contacterId;
    }

    public FindContacterRequest setLocaleString(String localeString) {
        this.localeString = localeString;
        return this;
    }
    public String getLocaleString() {
        return this.localeString;
    }

    public FindContacterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
