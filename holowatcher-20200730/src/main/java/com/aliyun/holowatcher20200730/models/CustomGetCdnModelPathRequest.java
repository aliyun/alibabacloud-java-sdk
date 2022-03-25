// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CustomGetCdnModelPathRequest extends TeaModel {
    @NameInMap("OrderIdCipher")
    public String orderIdCipher;

    public static CustomGetCdnModelPathRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomGetCdnModelPathRequest self = new CustomGetCdnModelPathRequest();
        return TeaModel.build(map, self);
    }

    public CustomGetCdnModelPathRequest setOrderIdCipher(String orderIdCipher) {
        this.orderIdCipher = orderIdCipher;
        return this;
    }
    public String getOrderIdCipher() {
        return this.orderIdCipher;
    }

}
