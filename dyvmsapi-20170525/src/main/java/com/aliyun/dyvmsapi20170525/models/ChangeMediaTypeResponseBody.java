// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ChangeMediaTypeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public Boolean model;

    @NameInMap("Success")
    public Boolean success;

    public static ChangeMediaTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeMediaTypeResponseBody self = new ChangeMediaTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeMediaTypeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ChangeMediaTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChangeMediaTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeMediaTypeResponseBody setModel(Boolean model) {
        this.model = model;
        return this;
    }
    public Boolean getModel() {
        return this.model;
    }

    public ChangeMediaTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
