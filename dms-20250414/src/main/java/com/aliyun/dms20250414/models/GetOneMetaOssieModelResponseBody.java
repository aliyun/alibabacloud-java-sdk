// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetOneMetaOssieModelResponseBody extends TeaModel {
    @NameInMap("Data")
    public OssieModelView data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOneMetaOssieModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOneMetaOssieModelResponseBody self = new GetOneMetaOssieModelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOneMetaOssieModelResponseBody setData(OssieModelView data) {
        this.data = data;
        return this;
    }
    public OssieModelView getData() {
        return this.data;
    }

    public GetOneMetaOssieModelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOneMetaOssieModelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOneMetaOssieModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOneMetaOssieModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
