// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderQueryByUserRequest extends TeaModel {
    @NameInMap("Jwt")
    public String jwt;

    public static OrderQueryByUserRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderQueryByUserRequest self = new OrderQueryByUserRequest();
        return TeaModel.build(map, self);
    }

    public OrderQueryByUserRequest setJwt(String jwt) {
        this.jwt = jwt;
        return this;
    }
    public String getJwt() {
        return this.jwt;
    }

}
