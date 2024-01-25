// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DeleteCompanyTemplateRequest extends TeaModel {
    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteCompanyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompanyTemplateRequest self = new DeleteCompanyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCompanyTemplateRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public DeleteCompanyTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
