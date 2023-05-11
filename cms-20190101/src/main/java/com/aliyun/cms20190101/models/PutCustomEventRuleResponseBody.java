// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomEventRuleResponseBody extends TeaModel {
    /**
     * <p>The error message.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Before you call this operation, call the PutCustomEvent operation to report the monitoring data of the custom event. For more information, see [PutCustomEvent](~~115012~~).</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PutCustomEventRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutCustomEventRuleResponseBody self = new PutCustomEventRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public PutCustomEventRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutCustomEventRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutCustomEventRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutCustomEventRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
