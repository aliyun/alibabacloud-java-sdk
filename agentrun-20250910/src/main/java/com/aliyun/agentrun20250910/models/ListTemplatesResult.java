// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListTemplatesResult extends TeaModel {
    /**
     * <p>A value of <code>SUCCESS</code> indicates the request was successful. On failure, this parameter returns an error type, such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Details about the template list.</p>
     */
    @NameInMap("data")
    public ListTemplatesOutput data;

    /**
     * <p>A unique request ID for troubleshooting and tracking.</p>
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
