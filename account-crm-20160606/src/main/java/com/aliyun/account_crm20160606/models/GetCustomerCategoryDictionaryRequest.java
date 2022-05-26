// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetCustomerCategoryDictionaryRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static GetCustomerCategoryDictionaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerCategoryDictionaryRequest self = new GetCustomerCategoryDictionaryRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomerCategoryDictionaryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
