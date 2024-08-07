// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ManageGetRecordingRuleResponseBody extends TeaModel {
    /**
     * <p>状态码。200为成功，其他状态码为异常。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>--- groups: - name: &quot;recording_demo&quot;   rules:   - expr: &quot;sum(jvm_memory_max_bytes)&quot;     record: &quot;rate_coredns_demo&quot;</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>返回信息。</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>34ED024E-9E31-434A-9E4E-D9D15C3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ManageGetRecordingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManageGetRecordingRuleResponseBody self = new ManageGetRecordingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ManageGetRecordingRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ManageGetRecordingRuleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ManageGetRecordingRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ManageGetRecordingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
