// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetCustomerCategoryRequest extends TeaModel {
    @NameInMap("LocaleString")
    public String localeString;

    @NameInMap("UserId")
    public Long userId;

    public static GetCustomerCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerCategoryRequest self = new GetCustomerCategoryRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomerCategoryRequest setLocaleString(String localeString) {
        this.localeString = localeString;
        return this;
    }
    public String getLocaleString() {
        return this.localeString;
    }

    public GetCustomerCategoryRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
