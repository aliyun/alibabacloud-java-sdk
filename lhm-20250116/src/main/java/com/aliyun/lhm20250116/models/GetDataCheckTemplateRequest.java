// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTemplateRequest extends TeaModel {
    /**
     * <p>The check template ID (logical foreign key) that uniquely identifies a check template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static GetDataCheckTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTemplateRequest self = new GetDataCheckTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
