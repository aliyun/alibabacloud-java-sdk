// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateConsumerAPIKeyResult extends TeaModel {
    /**
     * <p><code>SUCCESS</code> for a successful operation; otherwise, the corresponding error type.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Details of the new consumer API key, including the complete key.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public CreateConsumerAPIKeyOutput data;

    /**
     * <p>A unique request id for issue tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateConsumerAPIKeyResult build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerAPIKeyResult self = new CreateConsumerAPIKeyResult();
        return TeaModel.build(map, self);
    }

    public CreateConsumerAPIKeyResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateConsumerAPIKeyResult setData(CreateConsumerAPIKeyOutput data) {
        this.data = data;
        return this;
    }
    public CreateConsumerAPIKeyOutput getData() {
        return this.data;
    }

    public CreateConsumerAPIKeyResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
