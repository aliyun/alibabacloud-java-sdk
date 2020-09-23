// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateConnectionResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public String httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public Long data;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionResponse self = new CreateConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateConnectionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateConnectionResponse setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateConnectionResponse setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
