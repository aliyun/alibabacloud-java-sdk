// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CancelAsyncModifyLoginEmailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mpk")
    public String mpk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TraceNo")
    public String traceNo;

    public static CancelAsyncModifyLoginEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAsyncModifyLoginEmailRequest self = new CancelAsyncModifyLoginEmailRequest();
        return TeaModel.build(map, self);
    }

    public CancelAsyncModifyLoginEmailRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public CancelAsyncModifyLoginEmailRequest setTraceNo(String traceNo) {
        this.traceNo = traceNo;
        return this;
    }
    public String getTraceNo() {
        return this.traceNo;
    }

}
