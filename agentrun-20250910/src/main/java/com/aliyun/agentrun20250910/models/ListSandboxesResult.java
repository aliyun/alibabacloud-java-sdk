// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListSandboxesResult extends TeaModel {
    /**
     * <p>The status of the request. A value of \&quot;SUCCESS\&quot; indicates that the request was successful. If the request fails, an error code is returned, such as \&quot;ERR_BAD_REQUEST\&quot;, \&quot;ERR_VALIDATION_FAILED\&quot;, or \&quot;ERR_INTERNAL_SERVER_ERROR\&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Contains the list of sandboxes.</p>
     */
    @NameInMap("data")
    public ListSandboxesOutput data;

    /**
     * <p>The unique request ID used for issue tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>55D4BE40-2811-5CFB-8482-E0E98D575B1E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListSandboxesResult build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxesResult self = new ListSandboxesResult();
        return TeaModel.build(map, self);
    }

    public ListSandboxesResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSandboxesResult setData(ListSandboxesOutput data) {
        this.data = data;
        return this;
    }
    public ListSandboxesOutput getData() {
        return this.data;
    }

    public ListSandboxesResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
