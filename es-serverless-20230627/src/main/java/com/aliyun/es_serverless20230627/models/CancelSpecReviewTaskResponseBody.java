// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class CancelSpecReviewTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1B64F3E0-25D5-5043-B5C8-4FF22BB12CCD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static CancelSpecReviewTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelSpecReviewTaskResponseBody self = new CancelSpecReviewTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelSpecReviewTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelSpecReviewTaskResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
