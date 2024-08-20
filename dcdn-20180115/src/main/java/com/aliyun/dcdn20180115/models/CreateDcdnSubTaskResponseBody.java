// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnSubTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDcdnSubTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnSubTaskResponseBody self = new CreateDcdnSubTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDcdnSubTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
