// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateContainerClusterResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Token")
    public String token;

    @NameInMap("TokenUpdated")
    public Boolean tokenUpdated;

    public static UpdateContainerClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerClusterResponseBody self = new UpdateContainerClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContainerClusterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateContainerClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateContainerClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateContainerClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateContainerClusterResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public UpdateContainerClusterResponseBody setTokenUpdated(Boolean tokenUpdated) {
        this.tokenUpdated = tokenUpdated;
        return this;
    }
    public Boolean getTokenUpdated() {
        return this.tokenUpdated;
    }

}
