// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class BatchQueryCreateAccountTraceRequest extends TeaModel {
    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("TraceNoList")
    public String traceNoList;

    public static BatchQueryCreateAccountTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryCreateAccountTraceRequest self = new BatchQueryCreateAccountTraceRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryCreateAccountTraceRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public BatchQueryCreateAccountTraceRequest setTraceNoList(String traceNoList) {
        this.traceNoList = traceNoList;
        return this;
    }
    public String getTraceNoList() {
        return this.traceNoList;
    }

}
