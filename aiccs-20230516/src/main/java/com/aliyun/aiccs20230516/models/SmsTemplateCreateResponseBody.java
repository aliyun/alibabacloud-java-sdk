// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class SmsTemplateCreateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>8EFC6D10-307B-1ECA-A8C6-7CBDF776AAD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1683440860035</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static SmsTemplateCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SmsTemplateCreateResponseBody self = new SmsTemplateCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public SmsTemplateCreateResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SmsTemplateCreateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SmsTemplateCreateResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SmsTemplateCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SmsTemplateCreateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SmsTemplateCreateResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
