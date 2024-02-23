// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class RecoverCallInConfigResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the inbound call was resumed. Valid values:</p>
     * <br>
     * <p>*   true: The inbound call was resumed.</p>
     * <p>*   false: The inbound call failed to be resumed.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecoverCallInConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverCallInConfigResponseBody self = new RecoverCallInConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverCallInConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecoverCallInConfigResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public RecoverCallInConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecoverCallInConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
