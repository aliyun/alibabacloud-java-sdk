// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeLabTokenRequest extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RamUid")
    public String ramUid;

    public static DescribeLabTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabTokenRequest self = new DescribeLabTokenRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLabTokenRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DescribeLabTokenRequest setRamUid(String ramUid) {
        this.ramUid = ramUid;
        return this;
    }
    public String getRamUid() {
        return this.ramUid;
    }

}
