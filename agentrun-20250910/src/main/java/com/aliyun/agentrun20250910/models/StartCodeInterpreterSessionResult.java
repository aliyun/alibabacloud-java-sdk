// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class StartCodeInterpreterSessionResult extends TeaModel {
    /**
     * <p>SUCCESS indicates success. In case of failure, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Data</p>
     */
    @NameInMap("data")
    public CodeInterpreterSessionOut data;

    /**
     * <p>Request ID</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StartCodeInterpreterSessionResult build(java.util.Map<String, ?> map) throws Exception {
        StartCodeInterpreterSessionResult self = new StartCodeInterpreterSessionResult();
        return TeaModel.build(map, self);
    }

    public StartCodeInterpreterSessionResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartCodeInterpreterSessionResult setData(CodeInterpreterSessionOut data) {
        this.data = data;
        return this;
    }
    public CodeInterpreterSessionOut getData() {
        return this.data;
    }

    public StartCodeInterpreterSessionResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
