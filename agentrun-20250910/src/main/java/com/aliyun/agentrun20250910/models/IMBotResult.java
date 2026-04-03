// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class IMBotResult extends TeaModel {
    /**
     * <p>OK 表示成功</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public IMBotInfo data;

    /**
     * <p>与响应头 x-funagent-request-id 对应</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static IMBotResult build(java.util.Map<String, ?> map) throws Exception {
        IMBotResult self = new IMBotResult();
        return TeaModel.build(map, self);
    }

    public IMBotResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IMBotResult setData(IMBotInfo data) {
        this.data = data;
        return this;
    }
    public IMBotInfo getData() {
        return this.data;
    }

    public IMBotResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
