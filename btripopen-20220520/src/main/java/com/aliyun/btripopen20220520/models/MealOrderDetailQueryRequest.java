// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealOrderDetailQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static MealOrderDetailQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        MealOrderDetailQueryRequest self = new MealOrderDetailQueryRequest();
        return TeaModel.build(map, self);
    }

    public MealOrderDetailQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
