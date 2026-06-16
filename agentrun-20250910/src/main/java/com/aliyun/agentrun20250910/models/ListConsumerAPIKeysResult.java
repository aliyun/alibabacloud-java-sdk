// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListConsumerAPIKeysResult extends TeaModel {
    /**
     * <p>The request status. <code>SUCCESS</code> indicates that the request was successful. Otherwise, this field returns the error type.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of consumer API keys.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ListConsumerAPIKeysOutput data;

    /**
     * <p>The unique request ID. Use this ID for issue tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListConsumerAPIKeysResult build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerAPIKeysResult self = new ListConsumerAPIKeysResult();
        return TeaModel.build(map, self);
    }

    public ListConsumerAPIKeysResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsumerAPIKeysResult setData(ListConsumerAPIKeysOutput data) {
        this.data = data;
        return this;
    }
    public ListConsumerAPIKeysOutput getData() {
        return this.data;
    }

    public ListConsumerAPIKeysResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
