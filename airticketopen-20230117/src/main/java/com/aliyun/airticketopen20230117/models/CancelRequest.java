// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CancelRequest extends TeaModel {
    /**
     * <p>order number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>496***2617111</p>
     */
    @NameInMap("order_num")
    public Long orderNum;

    public static CancelRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelRequest self = new CancelRequest();
        return TeaModel.build(map, self);
    }

    public CancelRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

}
