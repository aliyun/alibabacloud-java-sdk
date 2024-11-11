// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UpdateAlarmResponseBody extends TeaModel {
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
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdateAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmResponseBody self = new UpdateAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateAlarmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAlarmResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
