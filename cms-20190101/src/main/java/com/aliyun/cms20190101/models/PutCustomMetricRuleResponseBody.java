// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The value 200 indicates that the call was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message. If the call was successful, the return value is null. If the call failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ComparisonOperator is mandatory for this action.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>65D50468-ECEF-48F1-A6E1-D952E89D9432</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
