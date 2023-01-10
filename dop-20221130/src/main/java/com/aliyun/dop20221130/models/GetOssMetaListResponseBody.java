// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dop20221130.models;

import com.aliyun.tea.*;

public class GetOssMetaListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public String data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOssMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssMetaListResponseBody self = new GetOssMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssMetaListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetOssMetaListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetOssMetaListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOssMetaListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetOssMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssMetaListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
