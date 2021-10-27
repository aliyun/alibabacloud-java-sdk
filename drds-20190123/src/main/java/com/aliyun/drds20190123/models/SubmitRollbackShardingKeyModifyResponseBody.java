// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitRollbackShardingKeyModifyResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitRollbackShardingKeyModifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitRollbackShardingKeyModifyResponseBody self = new SubmitRollbackShardingKeyModifyResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitRollbackShardingKeyModifyResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SubmitRollbackShardingKeyModifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitRollbackShardingKeyModifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
