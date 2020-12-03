// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class LockProjectResourceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("meta")
    public java.util.Map<String, ?> meta;

    @NameInMap("data")
    public String data;

    public static LockProjectResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LockProjectResourceResponseBody self = new LockProjectResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public LockProjectResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LockProjectResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LockProjectResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LockProjectResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public LockProjectResourceResponseBody setMeta(java.util.Map<String, ?> meta) {
        this.meta = meta;
        return this;
    }
    public java.util.Map<String, ?> getMeta() {
        return this.meta;
    }

    public LockProjectResourceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
