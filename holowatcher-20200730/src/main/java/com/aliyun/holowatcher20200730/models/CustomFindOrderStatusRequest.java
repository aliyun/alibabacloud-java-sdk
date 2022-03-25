// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CustomFindOrderStatusRequest extends TeaModel {
    @NameInMap("OrderIdCipher")
    public String orderIdCipher;

    public static CustomFindOrderStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomFindOrderStatusRequest self = new CustomFindOrderStatusRequest();
        return TeaModel.build(map, self);
    }

    public CustomFindOrderStatusRequest setOrderIdCipher(String orderIdCipher) {
        this.orderIdCipher = orderIdCipher;
        return this;
    }
    public String getOrderIdCipher() {
        return this.orderIdCipher;
    }

}
