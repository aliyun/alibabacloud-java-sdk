// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetFormatFilePathRequest extends TeaModel {
    @NameInMap("Format")
    public String format;

    @NameInMap("Jwt")
    public String jwt;

    @NameInMap("OrderId")
    public Long orderId;

    public static GetFormatFilePathRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFormatFilePathRequest self = new GetFormatFilePathRequest();
        return TeaModel.build(map, self);
    }

    public GetFormatFilePathRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public GetFormatFilePathRequest setJwt(String jwt) {
        this.jwt = jwt;
        return this;
    }
    public String getJwt() {
        return this.jwt;
    }

    public GetFormatFilePathRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
