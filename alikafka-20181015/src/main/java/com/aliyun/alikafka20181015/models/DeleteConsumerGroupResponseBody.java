// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteConsumerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerGroupResponseBody self = new DeleteConsumerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteConsumerGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteConsumerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteConsumerGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
