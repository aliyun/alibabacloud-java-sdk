// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListSandboxesResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>沙箱列表的详细信息</p>
     */
    @NameInMap("data")
    public ListSandboxesOutput data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
     * 
     * <strong>example:</strong>
     * <p>55D4BE40-2811-5CFB-8482-E0E98D575B1E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListSandboxesResult build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxesResult self = new ListSandboxesResult();
        return TeaModel.build(map, self);
    }

    public ListSandboxesResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSandboxesResult setData(ListSandboxesOutput data) {
        this.data = data;
        return this;
    }
    public ListSandboxesOutput getData() {
        return this.data;
    }

    public ListSandboxesResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
