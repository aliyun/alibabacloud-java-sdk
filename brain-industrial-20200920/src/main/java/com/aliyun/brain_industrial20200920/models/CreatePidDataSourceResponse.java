// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePidDataSourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PidDataSourceId")
    @Validation(required = true)
    public String pidDataSourceId;

    public static CreatePidDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePidDataSourceResponse self = new CreatePidDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreatePidDataSourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePidDataSourceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreatePidDataSourceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePidDataSourceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePidDataSourceResponse setPidDataSourceId(String pidDataSourceId) {
        this.pidDataSourceId = pidDataSourceId;
        return this;
    }
    public String getPidDataSourceId() {
        return this.pidDataSourceId;
    }

}
