// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateBroadcastVideoFromTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;: &quot;20250311-41523E3C-1D27-5844-8EEF-194E4714096B&quot;, &quot;mainAccountId&quot;: 1234567, &quot;createdAt&quot;: 1755680457}</p>
     */
    @NameInMap("data")
    public BroadcastVideo data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0EC3BA89-13F5-5766-A0BA-85096092A032</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateBroadcastVideoFromTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBroadcastVideoFromTemplateResponseBody self = new CreateBroadcastVideoFromTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBroadcastVideoFromTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBroadcastVideoFromTemplateResponseBody setData(BroadcastVideo data) {
        this.data = data;
        return this;
    }
    public BroadcastVideo getData() {
        return this.data;
    }

    public CreateBroadcastVideoFromTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateBroadcastVideoFromTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBroadcastVideoFromTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBroadcastVideoFromTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
