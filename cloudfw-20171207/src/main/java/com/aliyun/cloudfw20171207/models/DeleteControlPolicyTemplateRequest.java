// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteControlPolicyTemplateRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteControlPolicyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteControlPolicyTemplateRequest self = new DeleteControlPolicyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteControlPolicyTemplateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteControlPolicyTemplateRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteControlPolicyTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
