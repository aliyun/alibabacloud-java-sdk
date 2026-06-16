// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserResult extends TeaModel {
    /**
     * <p>The operation status code. <code>SUCCESS</code> indicates success. A failed operation returns an error code, such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned browser object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public Browser data;

    /**
     * <p>The unique request identifier. Use it for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BrowserResult build(java.util.Map<String, ?> map) throws Exception {
        BrowserResult self = new BrowserResult();
        return TeaModel.build(map, self);
    }

    public BrowserResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BrowserResult setData(Browser data) {
        this.data = data;
        return this;
    }
    public Browser getData() {
        return this.data;
    }

    public BrowserResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
