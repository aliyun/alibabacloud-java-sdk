// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddSmarttagTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7B117AF5-2A16-412C-B127-FA6175EDAS3Q</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>05de22f255284c7a8d2aab535dde****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static AddSmarttagTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSmarttagTemplateResponseBody self = new AddSmarttagTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSmarttagTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSmarttagTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
