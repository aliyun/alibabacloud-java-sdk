// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListTemplatesResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>模板列表的详细信息</p>
     */
    @NameInMap("data")
    public ListTemplatesOutput data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
     * 
     * <strong>example:</strong>
     * <p>C0595DB0-D1EE-55C3-8DDD-790872C7EC2F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListTemplatesResult build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResult self = new ListTemplatesResult();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTemplatesResult setData(ListTemplatesOutput data) {
        this.data = data;
        return this;
    }
    public ListTemplatesOutput getData() {
        return this.data;
    }

    public ListTemplatesResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
