// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class AutomaticWriteOffResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6fc1309b17543600398356606d0096</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AutomaticWriteOffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AutomaticWriteOffResponseBody self = new AutomaticWriteOffResponseBody();
        return TeaModel.build(map, self);
    }

    public AutomaticWriteOffResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AutomaticWriteOffResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public AutomaticWriteOffResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AutomaticWriteOffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
