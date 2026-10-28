// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetAccountInfoResponseBody extends TeaModel {
    /**
     * <p>The result code. Valid values:</p>
     * <ul>
     * <li>200: OK.</li>
     * <li>1109: A system error occurred.</li>
     * <li>3030: The account nickname exceeds the maximum length of 150 bytes.</li>
     * <li>3031: The remark exceeds the maximum length of 3000 bytes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Alibaba Cloud uses this ID for error tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Valid values: True and False. Indicates whether the current API call itself is successful. This does not indicate the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccountInfoResponseBody self = new SetAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccountInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetAccountInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
