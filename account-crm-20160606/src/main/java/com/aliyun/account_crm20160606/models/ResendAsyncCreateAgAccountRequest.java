// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ResendAsyncCreateAgAccountRequest extends TeaModel {
    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("TraceNo")
    public String traceNo;

    public static ResendAsyncCreateAgAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ResendAsyncCreateAgAccountRequest self = new ResendAsyncCreateAgAccountRequest();
        return TeaModel.build(map, self);
    }

    public ResendAsyncCreateAgAccountRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public ResendAsyncCreateAgAccountRequest setTraceNo(String traceNo) {
        this.traceNo = traceNo;
        return this;
    }
    public String getTraceNo() {
        return this.traceNo;
    }

}
