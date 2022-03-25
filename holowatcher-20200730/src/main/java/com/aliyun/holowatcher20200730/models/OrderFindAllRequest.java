// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderFindAllRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Params")
    public String params;

    public static OrderFindAllRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderFindAllRequest self = new OrderFindAllRequest();
        return TeaModel.build(map, self);
    }

    public OrderFindAllRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public OrderFindAllRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
