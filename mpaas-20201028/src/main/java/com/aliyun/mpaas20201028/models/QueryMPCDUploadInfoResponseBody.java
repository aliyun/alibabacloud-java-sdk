// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMPCDUploadInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMPCDUploadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMPCDUploadInfoResponseBody self = new QueryMPCDUploadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMPCDUploadInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMPCDUploadInfoResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public QueryMPCDUploadInfoResponseBody setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public QueryMPCDUploadInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMPCDUploadInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
