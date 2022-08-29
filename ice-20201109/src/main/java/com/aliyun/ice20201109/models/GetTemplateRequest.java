// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateRequest extends TeaModel {
    @NameInMap("RelatedMediaidFlag")
    public String relatedMediaidFlag;

    @NameInMap("TemplateId")
    public String templateId;

    public static GetTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateRequest self = new GetTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateRequest setRelatedMediaidFlag(String relatedMediaidFlag) {
        this.relatedMediaidFlag = relatedMediaidFlag;
        return this;
    }
    public String getRelatedMediaidFlag() {
        return this.relatedMediaidFlag;
    }

    public GetTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
