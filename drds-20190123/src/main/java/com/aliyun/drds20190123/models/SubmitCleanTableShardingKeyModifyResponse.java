// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitCleanTableShardingKeyModifyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    public static SubmitCleanTableShardingKeyModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCleanTableShardingKeyModifyResponse self = new SubmitCleanTableShardingKeyModifyResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCleanTableShardingKeyModifyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitCleanTableShardingKeyModifyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitCleanTableShardingKeyModifyResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
