// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SqlCompatibilityStartResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static SqlCompatibilityStartResponse build(java.util.Map<String, ?> map) throws Exception {
        SqlCompatibilityStartResponse self = new SqlCompatibilityStartResponse();
        return TeaModel.build(map, self);
    }

    public SqlCompatibilityStartResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SqlCompatibilityStartResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SqlCompatibilityStartResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
