// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCallProgressResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.Map<String, ?> model;

    @NameInMap("Success")
    public Boolean success;

    public static GetCallProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCallProgressResponseBody self = new GetCallProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCallProgressResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetCallProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCallProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCallProgressResponseBody setModel(java.util.Map<String, ?> model) {
        this.model = model;
        return this;
    }
    public java.util.Map<String, ?> getModel() {
        return this.model;
    }

    public GetCallProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
