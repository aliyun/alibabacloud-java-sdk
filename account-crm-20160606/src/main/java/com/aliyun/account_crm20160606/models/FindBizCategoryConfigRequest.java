// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindBizCategoryConfigRequest extends TeaModel {
    @NameInMap("LocaleString")
    public String localeString;

    @NameInMap("UserId")
    public Long userId;

    public static FindBizCategoryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        FindBizCategoryConfigRequest self = new FindBizCategoryConfigRequest();
        return TeaModel.build(map, self);
    }

    public FindBizCategoryConfigRequest setLocaleString(String localeString) {
        this.localeString = localeString;
        return this;
    }
    public String getLocaleString() {
        return this.localeString;
    }

    public FindBizCategoryConfigRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
