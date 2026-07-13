// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class AuthorizeEndpointAclResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static AuthorizeEndpointAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeEndpointAclResponseBody self = new AuthorizeEndpointAclResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeEndpointAclResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AuthorizeEndpointAclResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthorizeEndpointAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthorizeEndpointAclResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AuthorizeEndpointAclResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
