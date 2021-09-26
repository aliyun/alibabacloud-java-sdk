// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiOutboundTaskResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    // 任务id
    @NameInMap("Data")
    public Long data;

    public static CreateAiOutboundTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAiOutboundTaskResponseBody self = new CreateAiOutboundTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAiOutboundTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAiOutboundTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAiOutboundTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAiOutboundTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateAiOutboundTaskResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
