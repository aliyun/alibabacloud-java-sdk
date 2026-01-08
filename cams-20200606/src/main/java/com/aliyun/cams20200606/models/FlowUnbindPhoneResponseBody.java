// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class FlowUnbindPhoneResponseBody extends TeaModel {
    /**
     * <p>Access denied details, this field is returned only when RAM verification fails.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Request status code.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request result data.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Model")
    public Boolean model;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the operation was successful. Values: true: success; false: failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static FlowUnbindPhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlowUnbindPhoneResponseBody self = new FlowUnbindPhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public FlowUnbindPhoneResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public FlowUnbindPhoneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlowUnbindPhoneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlowUnbindPhoneResponseBody setModel(Boolean model) {
        this.model = model;
        return this;
    }
    public Boolean getModel() {
        return this.model;
    }

    public FlowUnbindPhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlowUnbindPhoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
