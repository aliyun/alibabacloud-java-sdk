// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateTpcdsDatabaseResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<String> data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTpcdsDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTpcdsDatabaseResponseBody self = new CreateTpcdsDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTpcdsDatabaseResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public CreateTpcdsDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTpcdsDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
