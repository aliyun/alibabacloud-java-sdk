// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCodeInterpretersResult extends TeaModel {
    /**
     * <p>The response status code. <code>SUCCESS</code> indicates the request was successful. If the request fails, this field contains an error type, such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>A list of code interpreter objects.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ListCodeInterpretersOutput data;

    /**
     * <p>The unique request ID, used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListCodeInterpretersResult build(java.util.Map<String, ?> map) throws Exception {
        ListCodeInterpretersResult self = new ListCodeInterpretersResult();
        return TeaModel.build(map, self);
    }

    public ListCodeInterpretersResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCodeInterpretersResult setData(ListCodeInterpretersOutput data) {
        this.data = data;
        return this;
    }
    public ListCodeInterpretersOutput getData() {
        return this.data;
    }

    public ListCodeInterpretersResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
