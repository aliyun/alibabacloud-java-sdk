// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateDataSourceResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceResponseBody self = new CreateDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
