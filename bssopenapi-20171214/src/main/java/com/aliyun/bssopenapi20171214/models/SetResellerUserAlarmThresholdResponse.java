// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserAlarmThresholdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    public static SetResellerUserAlarmThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserAlarmThresholdResponse self = new SetResellerUserAlarmThresholdResponse();
        return TeaModel.build(map, self);
    }

    public SetResellerUserAlarmThresholdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetResellerUserAlarmThresholdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetResellerUserAlarmThresholdResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetResellerUserAlarmThresholdResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetResellerUserAlarmThresholdResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
