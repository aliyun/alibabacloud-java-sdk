// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderBatchUpdateOrderStateRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Params")
    public String params;

    public static OrderBatchUpdateOrderStateRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderBatchUpdateOrderStateRequest self = new OrderBatchUpdateOrderStateRequest();
        return TeaModel.build(map, self);
    }

    public OrderBatchUpdateOrderStateRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public OrderBatchUpdateOrderStateRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
