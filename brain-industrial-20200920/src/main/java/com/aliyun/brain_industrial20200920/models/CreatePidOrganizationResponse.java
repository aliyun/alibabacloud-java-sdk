// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePidOrganizationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrganizationId")
    @Validation(required = true)
    public String organizationId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static CreatePidOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePidOrganizationResponse self = new CreatePidOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public CreatePidOrganizationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePidOrganizationResponse setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreatePidOrganizationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePidOrganizationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreatePidOrganizationResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
