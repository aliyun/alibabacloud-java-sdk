// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetRemediationTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the automatic remediation template.</p>
     * <p>For more information about how to obtain the ID of a remediation template, see <a href="https://help.aliyun.com/document_detail/2337741.html">Compliance library</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS-ALB-BulkyEnableDeletionProtection</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TemplateIdentifier")
    public String templateIdentifier;

    public static GetRemediationTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRemediationTemplateRequest self = new GetRemediationTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetRemediationTemplateRequest setTemplateIdentifier(String templateIdentifier) {
        this.templateIdentifier = templateIdentifier;
        return this;
    }
    public String getTemplateIdentifier() {
        return this.templateIdentifier;
    }

}
