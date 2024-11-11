// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceIdByIdentitiesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0EC7*726E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.Map<String, ResultValue> result;

    public static ListDeviceIdByIdentitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceIdByIdentitiesResponseBody self = new ListDeviceIdByIdentitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceIdByIdentitiesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDeviceIdByIdentitiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceIdByIdentitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceIdByIdentitiesResponseBody setResult(java.util.Map<String, ResultValue> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ResultValue> getResult() {
        return this.result;
    }

}
