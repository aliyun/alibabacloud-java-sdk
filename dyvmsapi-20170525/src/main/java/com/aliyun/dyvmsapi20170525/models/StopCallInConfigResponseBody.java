// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class StopCallInConfigResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the inbound call was stopped. Valid values:</p>
     * <ul>
     * <li>true: The inbound call was stopped.</li>
     * <li>false: The inbound call failed to be stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a78278ff-26bb-48ec-805c-26a0f4c102***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopCallInConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopCallInConfigResponseBody self = new StopCallInConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public StopCallInConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopCallInConfigResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public StopCallInConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopCallInConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
