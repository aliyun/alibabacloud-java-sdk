// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateCustomerCategoryRequest extends TeaModel {
    @NameInMap("ParamList")
    public String paramList;

    @NameInMap("UserId")
    public Long userId;

    public static UpdateCustomerCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomerCategoryRequest self = new UpdateCustomerCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomerCategoryRequest setParamList(String paramList) {
        this.paramList = paramList;
        return this;
    }
    public String getParamList() {
        return this.paramList;
    }

    public UpdateCustomerCategoryRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
