// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ResendAsyncModifyLoginEmailRequest extends TeaModel {
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

    public static ResendAsyncModifyLoginEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        ResendAsyncModifyLoginEmailRequest self = new ResendAsyncModifyLoginEmailRequest();
        return TeaModel.build(map, self);
    }

    public ResendAsyncModifyLoginEmailRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public ResendAsyncModifyLoginEmailRequest setTraceNo(String traceNo) {
        this.traceNo = traceNo;
        return this;
    }
    public String getTraceNo() {
        return this.traceNo;
    }

}
