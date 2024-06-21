// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRecordingRuleResponseBody extends TeaModel {
    /**
     * <p>Status code. 200 is success, other status codes are exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The recording rule.</p>
     * 
     * <strong>example:</strong>
     * <p>--- groups: - name: &quot;recording_demo&quot;   rules:   - expr: &quot;sum(jvm_memory_max_bytes)&quot;     record: &quot;rate_coredns_demo&quot;</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Returns a hint message for the result.</p>
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
     * <p>9FEA6D00-317F-45E3-9004-7FB8B0B7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRecordingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordingRuleResponseBody self = new GetRecordingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordingRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetRecordingRuleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetRecordingRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRecordingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
