// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListConsumerAPIKeysResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>消费者API密钥列表的详细信息</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ListConsumerAPIKeysOutput data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
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
