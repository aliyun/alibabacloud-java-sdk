// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class BatchDeleteExportSendRecordNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static BatchDeleteExportSendRecordNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteExportSendRecordNewResponseBody self = new BatchDeleteExportSendRecordNewResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteExportSendRecordNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteExportSendRecordNewResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
