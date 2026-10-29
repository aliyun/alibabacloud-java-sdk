// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteApiDestinationResponseBody extends TeaModel {
    /**
     * <p>The API operation status or POP error code. Valid values: Success: The operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The additional information. If the request is normal, success is returned. If the request is abnormal, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>382E6272-8E9C-5681-AC96-A8AF0BFAC1A5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApiDestinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiDestinationResponseBody self = new DeleteApiDestinationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiDestinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteApiDestinationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteApiDestinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
