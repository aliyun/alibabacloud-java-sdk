// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class DistributeProductResult extends TeaModel {
    /**
     * <p>The return code.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>操作成功</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>48A34399-A72C-1E23-8388-7E63A1B2E927</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DistributeProductResult build(java.util.Map<String, ?> map) throws Exception {
        DistributeProductResult self = new DistributeProductResult();
        return TeaModel.build(map, self);
    }

    public DistributeProductResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DistributeProductResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DistributeProductResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
