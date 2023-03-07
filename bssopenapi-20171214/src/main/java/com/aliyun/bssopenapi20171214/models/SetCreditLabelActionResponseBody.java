// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetCreditLabelActionResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed. For more information, see the "Error codes" section of this topic.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the action is successful. Valid values: true: The action was successful. false: The action failed.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call is successful. A value of false indicates that the call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetCreditLabelActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCreditLabelActionResponseBody self = new SetCreditLabelActionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCreditLabelActionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetCreditLabelActionResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SetCreditLabelActionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetCreditLabelActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetCreditLabelActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
