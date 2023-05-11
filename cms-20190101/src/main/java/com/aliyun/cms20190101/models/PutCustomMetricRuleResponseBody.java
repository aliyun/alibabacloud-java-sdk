// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricRuleResponseBody extends TeaModel {
    /**
     * <p>The returned message. If the call was successful, the return value is null. If the call failed, an error message is returned.</p>
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
     * <p>Before you call this operation, call the PutCustomMetric operation to report custom monitoring data. For more information, see [PutCustomMetric](~~115004~~).</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PutCustomMetricRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutCustomMetricRuleResponseBody self = new PutCustomMetricRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public PutCustomMetricRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutCustomMetricRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutCustomMetricRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutCustomMetricRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
