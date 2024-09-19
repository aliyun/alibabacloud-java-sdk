// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteFunctionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>88198F19-A36B-52A9-AE44-4518A688XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionResponseBody self = new DeleteFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFunctionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
