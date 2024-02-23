// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCallTaskResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task ID.</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCallTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCallTaskResponseBody self = new CreateCallTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCallTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCallTaskResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateCallTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
