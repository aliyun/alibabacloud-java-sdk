// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class BatchRegistAnonymousTbAccountResponseBody extends TeaModel {
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static BatchRegistAnonymousTbAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchRegistAnonymousTbAccountResponseBody self = new BatchRegistAnonymousTbAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchRegistAnonymousTbAccountResponseBody setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public BatchRegistAnonymousTbAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchRegistAnonymousTbAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchRegistAnonymousTbAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
