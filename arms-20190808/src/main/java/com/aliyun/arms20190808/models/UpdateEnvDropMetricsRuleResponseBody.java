// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateEnvDropMetricsRuleResponseBody extends TeaModel {
    /**
     * <p>The status code. 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A9AEA84-7186-4D8D-B498-4585C6A2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEnvDropMetricsRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvDropMetricsRuleResponseBody self = new UpdateEnvDropMetricsRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEnvDropMetricsRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateEnvDropMetricsRuleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateEnvDropMetricsRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateEnvDropMetricsRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
