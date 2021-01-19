// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class BatchRegistAnonymousTbAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("BatchId")
    @Validation(required = true)
    public String batchId;

    public static BatchRegistAnonymousTbAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRegistAnonymousTbAccountResponse self = new BatchRegistAnonymousTbAccountResponse();
        return TeaModel.build(map, self);
    }

    public BatchRegistAnonymousTbAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchRegistAnonymousTbAccountResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchRegistAnonymousTbAccountResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchRegistAnonymousTbAccountResponse setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

}
