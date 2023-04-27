// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportPreCheckDetailRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Tid")
    public Long tid;

    public static GetDataExportPreCheckDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataExportPreCheckDetailRequest self = new GetDataExportPreCheckDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDataExportPreCheckDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataExportPreCheckDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
