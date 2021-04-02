// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiAuthorityResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateDataServiceApiAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceApiAuthorityResponse self = new CreateDataServiceApiAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceApiAuthorityResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDataServiceApiAuthorityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
