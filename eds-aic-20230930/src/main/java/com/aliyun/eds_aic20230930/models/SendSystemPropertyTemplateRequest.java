// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SendSystemPropertyTemplateRequest extends TeaModel {
    /**
     * <p>The list of instance IDs.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <p>The property template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-angyvganxlf****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The list of property template IDs. If multiple templates are provided, the specified instances are randomly matched with all the provided property templates.</p>
     */
    @NameInMap("TemplateIds")
    public java.util.List<String> templateIds;

    public static SendSystemPropertyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSystemPropertyTemplateRequest self = new SendSystemPropertyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SendSystemPropertyTemplateRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public SendSystemPropertyTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SendSystemPropertyTemplateRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

}
