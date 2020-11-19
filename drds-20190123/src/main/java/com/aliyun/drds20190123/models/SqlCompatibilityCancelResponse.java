// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SqlCompatibilityCancelResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static SqlCompatibilityCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        SqlCompatibilityCancelResponse self = new SqlCompatibilityCancelResponse();
        return TeaModel.build(map, self);
    }

    public SqlCompatibilityCancelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SqlCompatibilityCancelResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SqlCompatibilityCancelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
