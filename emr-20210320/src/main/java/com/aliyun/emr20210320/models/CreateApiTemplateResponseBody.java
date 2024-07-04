// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateApiTemplateResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>at-41b4c6a0fc63****</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>at-41b4c6a0fc63****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateApiTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiTemplateResponseBody self = new CreateApiTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApiTemplateResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public CreateApiTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
