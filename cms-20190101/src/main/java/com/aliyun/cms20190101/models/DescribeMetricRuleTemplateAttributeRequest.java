// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateAttributeRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateId")
    public String templateId;

    public static DescribeMetricRuleTemplateAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTemplateAttributeRequest self = new DescribeMetricRuleTemplateAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleTemplateAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeMetricRuleTemplateAttributeRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
