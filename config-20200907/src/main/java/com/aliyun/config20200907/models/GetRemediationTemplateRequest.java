// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetRemediationTemplateRequest extends TeaModel {
    /**
     * <p>The identifier of the automatic remediation template.</p>
     * <br>
     * <p>For more information about how to obtain the identifier of a remediation template, see [Compliance library](~~2337741~~).</p>
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
