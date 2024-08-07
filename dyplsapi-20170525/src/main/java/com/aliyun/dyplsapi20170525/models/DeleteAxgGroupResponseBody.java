// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxgGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9297B722-A016-43FB-B51A-E54050D9369D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAxgGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxgGroupResponseBody self = new DeleteAxgGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAxgGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAxgGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAxgGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
