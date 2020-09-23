// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateConnectionResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public String httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionResponse self = new UpdateConnectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateConnectionResponse setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateConnectionResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
