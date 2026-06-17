// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteControlPolicyTemplateRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>61.178.12.52</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the access control policy template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>719ce620-ae23-4e42-9f93-9191b4400b55</p>
     */
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
