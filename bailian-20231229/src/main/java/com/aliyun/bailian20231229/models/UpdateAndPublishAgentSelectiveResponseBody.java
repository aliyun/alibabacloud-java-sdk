// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateAndPublishAgentSelectiveResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static UpdateAndPublishAgentSelectiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAndPublishAgentSelectiveResponseBody self = new UpdateAndPublishAgentSelectiveResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAndPublishAgentSelectiveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAndPublishAgentSelectiveResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateAndPublishAgentSelectiveResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateAndPublishAgentSelectiveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAndPublishAgentSelectiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAndPublishAgentSelectiveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
