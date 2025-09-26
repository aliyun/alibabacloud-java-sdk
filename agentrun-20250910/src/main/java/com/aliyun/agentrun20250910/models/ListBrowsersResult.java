// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListBrowsersResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>浏览器列表的详细信息</p>
     */
    @NameInMap("data")
    public ListBrowsersOutput data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListBrowsersResult build(java.util.Map<String, ?> map) throws Exception {
        ListBrowsersResult self = new ListBrowsersResult();
        return TeaModel.build(map, self);
    }

    public ListBrowsersResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBrowsersResult setData(ListBrowsersOutput data) {
        this.data = data;
        return this;
    }
    public ListBrowsersOutput getData() {
        return this.data;
    }

    public ListBrowsersResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
