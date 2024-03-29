// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class EditEndUserStatusResponseBody extends TeaModel {
    /**
     * <p>Status Code</br></p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Success or not</br></p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Message</br></p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Message</br></p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>Request ID</br></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EditEndUserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditEndUserStatusResponseBody self = new EditEndUserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public EditEndUserStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EditEndUserStatusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EditEndUserStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EditEndUserStatusResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public EditEndUserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
