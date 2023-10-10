// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplateAttributeRequest extends TeaModel {
    /**
     * <p>The type of template. The value can be a custom value.</p>
     * <br>
     * <p>*   If the parameter is set to `kubernetes`, the template is displayed on the Templates page in the console.</p>
     * <p>*   If the parameter is set to `compose`, the template is displayed on the Container Service - Swarm page in the console. Container Service for Swarm is deprecated.</p>
     * <p>*   If the value of the parameter is not `kubernetes`, the template is not displayed on the Templates page in the console. We recommend that you set the parameter to `kubernetes`.</p>
     * <br>
     * <p>Default value: `kubernetes`.</p>
     */
    @NameInMap("template_type")
    public String templateType;

    public static DescribeTemplateAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateAttributeRequest self = new DescribeTemplateAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateAttributeRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
