// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class BatchUpdateTableOwnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchUpdateTableOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateTableOwnerResponseBody self = new BatchUpdateTableOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateTableOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchUpdateTableOwnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
