// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class UpdateTreeNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateTreeNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTreeNodeResponseBody self = new UpdateTreeNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTreeNodeResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UpdateTreeNodeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UpdateTreeNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateTreeNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTreeNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
