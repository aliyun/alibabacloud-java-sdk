// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealOrderListQueryRequest extends TeaModel {
    @NameInMap("user_id")
    public String userId;

    public static MealOrderListQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        MealOrderListQueryRequest self = new MealOrderListQueryRequest();
        return TeaModel.build(map, self);
    }

    public MealOrderListQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
