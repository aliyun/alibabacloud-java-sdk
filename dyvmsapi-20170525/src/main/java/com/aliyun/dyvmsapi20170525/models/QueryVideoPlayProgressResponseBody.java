// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVideoPlayProgressResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static QueryVideoPlayProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoPlayProgressResponseBody self = new QueryVideoPlayProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVideoPlayProgressResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryVideoPlayProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVideoPlayProgressResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public QueryVideoPlayProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryVideoPlayProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
