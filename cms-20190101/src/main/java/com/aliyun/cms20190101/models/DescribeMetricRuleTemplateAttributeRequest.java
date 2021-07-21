// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateId")
    public String templateId;

    public static DescribeMetricRuleTemplateAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTemplateAttributeRequest self = new DescribeMetricRuleTemplateAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleTemplateAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
