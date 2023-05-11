// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The level of the event-triggered alert rule. Valid values of N: 1 to 50. Valid values:</p>
     * <br>
     * <p>*   CRITICAL: critical</p>
     * <p>*   WARN: warning</p>
     * <p>*   INFO: information</p>
     * <p>*   \*: all levels</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PutEventRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutEventRuleResponseBody self = new PutEventRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public PutEventRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutEventRuleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PutEventRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutEventRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutEventRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
