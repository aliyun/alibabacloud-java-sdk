// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class BatchRegistAnonymousTbAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[\&quot;id1\&quot;, \&quot;id2\&quot;]</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>37899973-5963-5028-BA54-180A5B107****</p>
     */
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
