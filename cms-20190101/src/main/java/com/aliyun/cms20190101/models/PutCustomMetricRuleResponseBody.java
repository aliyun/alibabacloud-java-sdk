// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricRuleResponseBody extends TeaModel {
    /**
     * <p>状态码。</p>
     * <blockquote>
     * <p>200表示成功。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回信息。接口调用成功时，返回为空；接口调用失败时，返回失败原因。</p>
     * 
     * <strong>example:</strong>
     * <p>ComparisonOperator is mandatory for this action.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>65D50468-ECEF-48F1-A6E1-D952E89D9432</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>操作是否成功。取值：</p>
     * <ul>
     * <li><p>true：成功。</p>
     * </li>
     * <li><p>false：失败。</p>
     * </li>
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
