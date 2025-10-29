// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteBrowserResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>被删除的浏览器详细信息</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public Browser data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteBrowserResult build(java.util.Map<String, ?> map) throws Exception {
        DeleteBrowserResult self = new DeleteBrowserResult();
        return TeaModel.build(map, self);
    }

    public DeleteBrowserResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteBrowserResult setData(Browser data) {
        this.data = data;
        return this;
    }
    public Browser getData() {
        return this.data;
    }

    public DeleteBrowserResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
