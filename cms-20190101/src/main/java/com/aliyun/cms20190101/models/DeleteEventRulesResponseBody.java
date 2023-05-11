// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteEventRulesResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Deletes one or more event-triggered alert rules.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteEventRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRulesResponseBody self = new DeleteEventRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEventRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteEventRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteEventRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteEventRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
