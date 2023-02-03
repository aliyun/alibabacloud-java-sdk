// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateParamsRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static GetTemplateParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateParamsRequest self = new GetTemplateParamsRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateParamsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
