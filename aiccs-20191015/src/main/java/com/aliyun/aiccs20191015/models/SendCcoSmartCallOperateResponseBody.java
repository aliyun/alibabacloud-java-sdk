// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SendCcoSmartCallOperateResponseBody extends TeaModel {
    /**
     * <p>Request status code. A return value of OK indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Result of the command execution.  </p>
     * <ul>
     * <li><strong>true</strong>: The command executed successfully.  </li>
     * <li><strong>false</strong>: The command execution failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendCcoSmartCallOperateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCcoSmartCallOperateResponseBody self = new SendCcoSmartCallOperateResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCcoSmartCallOperateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendCcoSmartCallOperateResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendCcoSmartCallOperateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendCcoSmartCallOperateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
