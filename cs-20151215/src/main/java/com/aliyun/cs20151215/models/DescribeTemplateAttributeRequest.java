// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplateAttributeRequest extends TeaModel {
    /**
     * <p>The type of template. The value can be a custom value.</p>
     * <ul>
     * <li>If the parameter is set to <code>kubernetes</code>, the template is displayed on the Templates page in the console.</li>
     * <li>If the parameter is set to <code>compose</code>, the template is displayed on the Container Service - Swarm page in the console. Container Service for Swarm is deprecated.</li>
     * <li>If the value of the parameter is not <code>kubernetes</code>, the template is not displayed on the Templates page in the console. We recommend that you set the parameter to <code>kubernetes</code>.</li>
     * </ul>
     * <p>Default value: <code>kubernetes</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes</p>
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
