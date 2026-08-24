// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateOneMetaSqlTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public OneMetaSqlTemplateView data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateOneMetaSqlTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOneMetaSqlTemplateResponseBody self = new UpdateOneMetaSqlTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOneMetaSqlTemplateResponseBody setData(OneMetaSqlTemplateView data) {
        this.data = data;
        return this;
    }
    public OneMetaSqlTemplateView getData() {
        return this.data;
    }

    public UpdateOneMetaSqlTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateOneMetaSqlTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateOneMetaSqlTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateOneMetaSqlTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
