// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupResponseBody extends TeaModel {
    @NameInMap("ConsumerGroupID")
    public String consumerGroupID;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static CreateConsumerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupResponseBody self = new CreateConsumerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupResponseBody setConsumerGroupID(String consumerGroupID) {
        this.consumerGroupID = consumerGroupID;
        return this;
    }
    public String getConsumerGroupID() {
        return this.consumerGroupID;
    }

    public CreateConsumerGroupResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateConsumerGroupResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateConsumerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateConsumerGroupResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
