// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiOutboundTaskBatchResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    // 新建的任务批次版本id
    @NameInMap("Data")
    public Integer data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAiOutboundTaskBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAiOutboundTaskBatchResponseBody self = new CreateAiOutboundTaskBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAiOutboundTaskBatchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAiOutboundTaskBatchResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public CreateAiOutboundTaskBatchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAiOutboundTaskBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAiOutboundTaskBatchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
