// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportDownloadURLRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("OrderId")
    public Long orderId;

    public static GetDataExportDownloadURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataExportDownloadURLRequest self = new GetDataExportDownloadURLRequest();
        return TeaModel.build(map, self);
    }

    public GetDataExportDownloadURLRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GetDataExportDownloadURLRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
