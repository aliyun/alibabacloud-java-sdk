// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifySystemPropertyTemplateResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5C5CEF0A-D6E1-58D3-8750-67DB4F82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ap-angyvganxlf****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static ModifySystemPropertyTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySystemPropertyTemplateResponseBody self = new ModifySystemPropertyTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySystemPropertyTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySystemPropertyTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
