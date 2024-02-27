// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class EditZeroCreditShutdownResponseBody extends TeaModel {
    /**
     * <p>Success or not</br></p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Request ID</br></p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Message</br></p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>NO_STOP</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>success</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EditZeroCreditShutdownResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditZeroCreditShutdownResponseBody self = new EditZeroCreditShutdownResponseBody();
        return TeaModel.build(map, self);
    }

    public EditZeroCreditShutdownResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EditZeroCreditShutdownResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EditZeroCreditShutdownResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EditZeroCreditShutdownResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public EditZeroCreditShutdownResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
