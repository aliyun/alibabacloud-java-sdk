// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateOneMetaSqlTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public OneMetaSqlTemplateView data;

    /**
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>ServerUnrecognizedException</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateOneMetaSqlTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOneMetaSqlTemplateResponseBody self = new CreateOneMetaSqlTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOneMetaSqlTemplateResponseBody setData(OneMetaSqlTemplateView data) {
        this.data = data;
        return this;
    }
    public OneMetaSqlTemplateView getData() {
        return this.data;
    }

    public CreateOneMetaSqlTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateOneMetaSqlTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOneMetaSqlTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOneMetaSqlTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
