// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetTemporaryFileUrlResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTemporaryFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemporaryFileUrlResponseBody self = new GetTemporaryFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemporaryFileUrlResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetTemporaryFileUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTemporaryFileUrlResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetTemporaryFileUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTemporaryFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemporaryFileUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
