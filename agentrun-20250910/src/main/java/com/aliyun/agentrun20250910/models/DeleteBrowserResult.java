// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteBrowserResult extends TeaModel {
    /**
     * <p>The operation result code. <code>SUCCESS</code> indicates a successful operation. Other values indicate an error type, such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Details about the deleted browser.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public Browser data;

    /**
     * <p>A unique request ID for troubleshooting.</p>
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
