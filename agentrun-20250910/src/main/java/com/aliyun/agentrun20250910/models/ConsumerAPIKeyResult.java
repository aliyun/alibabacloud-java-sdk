// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ConsumerAPIKeyResult extends TeaModel {
    /**
     * <p><code>SUCCESS</code> indicates that the request was successful. If the request fails, this field returns an error type, such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Details of the consumer API key.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ConsumerAPIKey data;

    /**
     * <p>A unique request ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ConsumerAPIKeyResult build(java.util.Map<String, ?> map) throws Exception {
        ConsumerAPIKeyResult self = new ConsumerAPIKeyResult();
        return TeaModel.build(map, self);
    }

    public ConsumerAPIKeyResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConsumerAPIKeyResult setData(ConsumerAPIKey data) {
        this.data = data;
        return this;
    }
    public ConsumerAPIKey getData() {
        return this.data;
    }

    public ConsumerAPIKeyResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
