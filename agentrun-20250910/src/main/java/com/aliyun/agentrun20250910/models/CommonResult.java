// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CommonResult extends TeaModel {
    /**
     * <p>Indicates the request status. A value of <code>SUCCESS</code> indicates success. On failure, an error code is returned, such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned business data.</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>A unique request identifier for issue tracking.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CommonResult build(java.util.Map<String, ?> map) throws Exception {
        CommonResult self = new CommonResult();
        return TeaModel.build(map, self);
    }

    public CommonResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CommonResult setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public CommonResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
