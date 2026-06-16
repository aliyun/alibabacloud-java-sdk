// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListBrowsersResult extends TeaModel {
    /**
     * <p>The request status. A value of SUCCESS indicates success. On failure, this field contains an error type, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The detailed browser list.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ListBrowsersOutput data;

    /**
     * <p>A unique request identifier for issue tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
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
