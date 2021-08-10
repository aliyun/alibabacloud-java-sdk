// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class OperateFeeOrderRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Status")
    public String status;

    public static OperateFeeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateFeeOrderRequest self = new OperateFeeOrderRequest();
        return TeaModel.build(map, self);
    }

    public OperateFeeOrderRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OperateFeeOrderRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
