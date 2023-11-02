// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostEventDisposeAndWhiteruleListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PostEventDisposeAndWhiteruleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PostEventDisposeAndWhiteruleListResponseBody self = new PostEventDisposeAndWhiteruleListResponseBody();
        return TeaModel.build(map, self);
    }

    public PostEventDisposeAndWhiteruleListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PostEventDisposeAndWhiteruleListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PostEventDisposeAndWhiteruleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PostEventDisposeAndWhiteruleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PostEventDisposeAndWhiteruleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
