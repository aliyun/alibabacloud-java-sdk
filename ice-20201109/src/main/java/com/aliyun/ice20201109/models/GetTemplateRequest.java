// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the media assets associated with the template. Valid values:</p>
     * <ul>
     * <li>1: Returns the associated media assets.</li>
     * <li>0: Does not return the associated media assets.
     * Default value: 0. This parameter is valid only for standard templates.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RelatedMediaidFlag")
    public String relatedMediaidFlag;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
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
