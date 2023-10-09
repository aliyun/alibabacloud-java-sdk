// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateConsumerOffsetResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned. The status code **200** indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateConsumerOffsetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerOffsetResponseBody self = new UpdateConsumerOffsetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerOffsetResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateConsumerOffsetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateConsumerOffsetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateConsumerOffsetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
