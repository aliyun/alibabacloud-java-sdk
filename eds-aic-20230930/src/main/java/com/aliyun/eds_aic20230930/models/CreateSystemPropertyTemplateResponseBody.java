// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateSystemPropertyTemplateResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ap-g6gyv4a4xlf****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateSystemPropertyTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSystemPropertyTemplateResponseBody self = new CreateSystemPropertyTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSystemPropertyTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSystemPropertyTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
