// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDatabaseExportOrderDetailRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Tid")
    public Long tid;

    public static GetDatabaseExportOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseExportOrderDetailRequest self = new GetDatabaseExportOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseExportOrderDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDatabaseExportOrderDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
