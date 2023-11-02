// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class OpenDeliveryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("DyCode")
    public String dyCode;

    @NameInMap("DyMessage")
    public String dyMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static OpenDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenDeliveryResponseBody self = new OpenDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenDeliveryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public OpenDeliveryResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public OpenDeliveryResponseBody setDyCode(String dyCode) {
        this.dyCode = dyCode;
        return this;
    }
    public String getDyCode() {
        return this.dyCode;
    }

    public OpenDeliveryResponseBody setDyMessage(String dyMessage) {
        this.dyMessage = dyMessage;
        return this;
    }
    public String getDyMessage() {
        return this.dyMessage;
    }

    public OpenDeliveryResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public OpenDeliveryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenDeliveryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
