// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B7AF834D-D38B-4A46-920B-FE974EB7E135</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of affected rows.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Result")
    public Integer result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DeleteMonitorGroupNotifyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupNotifyPolicyResponseBody self = new DeleteMonitorGroupNotifyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupNotifyPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteMonitorGroupNotifyPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMonitorGroupNotifyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMonitorGroupNotifyPolicyResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

    public DeleteMonitorGroupNotifyPolicyResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
