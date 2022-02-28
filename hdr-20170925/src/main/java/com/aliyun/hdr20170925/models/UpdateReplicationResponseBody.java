// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateReplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateReplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateReplicationResponseBody self = new UpdateReplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateReplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateReplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateReplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateReplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
