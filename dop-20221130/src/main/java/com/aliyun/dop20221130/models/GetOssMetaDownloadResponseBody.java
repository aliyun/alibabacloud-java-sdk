// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dop20221130.models;

import com.aliyun.tea.*;

public class GetOssMetaDownloadResponseBody extends TeaModel {
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

    public static GetOssMetaDownloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssMetaDownloadResponseBody self = new GetOssMetaDownloadResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssMetaDownloadResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetOssMetaDownloadResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetOssMetaDownloadResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOssMetaDownloadResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetOssMetaDownloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssMetaDownloadResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
