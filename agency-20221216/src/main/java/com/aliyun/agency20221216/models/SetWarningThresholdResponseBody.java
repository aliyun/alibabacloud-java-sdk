// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetWarningThresholdResponseBody extends TeaModel {
    /**
     * <p>The result code. Valid values:</p>
     * <ul>
     * <li>200: OK.</li>
     * <li>1109: System error.</li>
     * <li>3040: The sub-account is frozen and the operation cannot be completed.</li>
     * <li>3044: The alert percentage value is not a number.</li>
     * <li>3045: The alert percentage value must be from 1 to 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that corresponds to the Code parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. A unique identifier that Alibaba Cloud generates for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the current API call was successful. Valid values: True and False. This does not indicate whether the subsequent business operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetWarningThresholdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetWarningThresholdResponseBody self = new SetWarningThresholdResponseBody();
        return TeaModel.build(map, self);
    }

    public SetWarningThresholdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetWarningThresholdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetWarningThresholdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetWarningThresholdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
