// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SkipVideoFileResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static SkipVideoFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SkipVideoFileResponseBody self = new SkipVideoFileResponseBody();
        return TeaModel.build(map, self);
    }

    public SkipVideoFileResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SkipVideoFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SkipVideoFileResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SkipVideoFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SkipVideoFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
