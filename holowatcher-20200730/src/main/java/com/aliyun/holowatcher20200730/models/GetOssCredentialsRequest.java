// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetOssCredentialsRequest extends TeaModel {
    @NameInMap("Jwt")
    public String jwt;

    @NameInMap("OrderId")
    public Long orderId;

    // R: Read only, RW: Read write
    @NameInMap("Type")
    public String type;

    public static GetOssCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssCredentialsRequest self = new GetOssCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public GetOssCredentialsRequest setJwt(String jwt) {
        this.jwt = jwt;
        return this;
    }
    public String getJwt() {
        return this.jwt;
    }

    public GetOssCredentialsRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetOssCredentialsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
