// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreateAlarmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43<em><strong>28C-A810-5</strong></em>-8747-EC226A086881</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("Result")
    public Long result;

    public static CreateAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmResponseBody self = new CreateAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlarmResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateAlarmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAlarmResponseBody setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
