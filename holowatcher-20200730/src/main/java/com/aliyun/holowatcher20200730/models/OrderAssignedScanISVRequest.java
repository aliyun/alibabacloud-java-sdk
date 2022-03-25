// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderAssignedScanISVRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Params")
    public String params;

    public static OrderAssignedScanISVRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderAssignedScanISVRequest self = new OrderAssignedScanISVRequest();
        return TeaModel.build(map, self);
    }

    public OrderAssignedScanISVRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public OrderAssignedScanISVRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
