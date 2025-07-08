// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ApplyExportSmsSendRecordNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static ApplyExportSmsSendRecordNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyExportSmsSendRecordNewResponseBody self = new ApplyExportSmsSendRecordNewResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyExportSmsSendRecordNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyExportSmsSendRecordNewResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
