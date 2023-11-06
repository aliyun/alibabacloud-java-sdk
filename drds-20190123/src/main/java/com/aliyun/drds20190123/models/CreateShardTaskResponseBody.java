// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateShardTaskResponseBody extends TeaModel {
    /**
     * <p>Task creation result</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the operation.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateShardTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateShardTaskResponseBody self = new CreateShardTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateShardTaskResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateShardTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateShardTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
