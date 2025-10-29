// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetBrowserSessionResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public BrowserSessionOut data;

    /**
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetBrowserSessionResult build(java.util.Map<String, ?> map) throws Exception {
        GetBrowserSessionResult self = new GetBrowserSessionResult();
        return TeaModel.build(map, self);
    }

    public GetBrowserSessionResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBrowserSessionResult setData(BrowserSessionOut data) {
        this.data = data;
        return this;
    }
    public BrowserSessionOut getData() {
        return this.data;
    }

    public GetBrowserSessionResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
