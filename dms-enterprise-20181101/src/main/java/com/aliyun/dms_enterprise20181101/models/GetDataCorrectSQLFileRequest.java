// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectSQLFileRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("OrderActionName")
    public String orderActionName;

    public static GetDataCorrectSQLFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectSQLFileRequest self = new GetDataCorrectSQLFileRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectSQLFileRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataCorrectSQLFileRequest setOrderActionName(String orderActionName) {
        this.orderActionName = orderActionName;
        return this;
    }
    public String getOrderActionName() {
        return this.orderActionName;
    }

}
