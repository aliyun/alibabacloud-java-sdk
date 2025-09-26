// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteBrowserResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Browser data;

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
