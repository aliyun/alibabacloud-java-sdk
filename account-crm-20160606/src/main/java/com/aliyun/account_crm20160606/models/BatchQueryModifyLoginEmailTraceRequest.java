// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class BatchQueryModifyLoginEmailTraceRequest extends TeaModel {
    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("TraceNoList")
    public String traceNoList;

    public static BatchQueryModifyLoginEmailTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryModifyLoginEmailTraceRequest self = new BatchQueryModifyLoginEmailTraceRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryModifyLoginEmailTraceRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public BatchQueryModifyLoginEmailTraceRequest setTraceNoList(String traceNoList) {
        this.traceNoList = traceNoList;
        return this;
    }
    public String getTraceNoList() {
        return this.traceNoList;
    }

}
