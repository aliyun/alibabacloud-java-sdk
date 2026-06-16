// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListBrowserSessionResult extends TeaModel {
    /**
     * <p>The response code. A value of SUCCESS indicates the request succeeded. On failure, an error code is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The operation\&quot;s payload.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public BrowserSessionListOut data;

    /**
     * <p>The unique identifier for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListBrowserSessionResult build(java.util.Map<String, ?> map) throws Exception {
        ListBrowserSessionResult self = new ListBrowserSessionResult();
        return TeaModel.build(map, self);
    }

    public ListBrowserSessionResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBrowserSessionResult setData(BrowserSessionListOut data) {
        this.data = data;
        return this;
    }
    public BrowserSessionListOut getData() {
        return this.data;
    }

    public ListBrowserSessionResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
