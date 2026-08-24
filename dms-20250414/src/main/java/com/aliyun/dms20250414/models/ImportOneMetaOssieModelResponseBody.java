// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ImportOneMetaOssieModelResponseBody extends TeaModel {
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

    public static ImportOneMetaOssieModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportOneMetaOssieModelResponseBody self = new ImportOneMetaOssieModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportOneMetaOssieModelResponseBody setData(OssieModelView data) {
        this.data = data;
        return this;
    }
    public OssieModelView getData() {
        return this.data;
    }

    public ImportOneMetaOssieModelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ImportOneMetaOssieModelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ImportOneMetaOssieModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportOneMetaOssieModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
