// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCodeInterpretersResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>代码解释器列表的详细信息</p>
     */
    @NameInMap("data")
    public ListCodeInterpretersOutput data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListCodeInterpretersResult build(java.util.Map<String, ?> map) throws Exception {
        ListCodeInterpretersResult self = new ListCodeInterpretersResult();
        return TeaModel.build(map, self);
    }

    public ListCodeInterpretersResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCodeInterpretersResult setData(ListCodeInterpretersOutput data) {
        this.data = data;
        return this;
    }
    public ListCodeInterpretersOutput getData() {
        return this.data;
    }

    public ListCodeInterpretersResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
