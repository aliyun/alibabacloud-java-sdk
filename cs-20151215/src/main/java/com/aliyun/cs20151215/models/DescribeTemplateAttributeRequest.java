// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplateAttributeRequest extends TeaModel {
    /**
     * <p>The templatetype.</p>
     * <ul>
     * <li><p>If this parameter is set to <code>kubernetes</code>, the template is displayed on the Orchestration Templates page in the console.</p>
     * </li>
     * <li><p>If this parameter is not specified or is set to another value, the template is not displayed on the Orchestration Templates page in the console.</p>
     * </li>
     * </ul>
     * <p>Recommended Settings: <code>kubernetes</code>.</p>
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
