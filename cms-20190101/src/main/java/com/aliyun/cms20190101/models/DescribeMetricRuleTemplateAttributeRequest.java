// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateAttributeRequest extends TeaModel {
    /**
     * <p>The name of the alert template. You must specify at least one of the <code>Name</code> and <code>TemplateId</code> parameters.</p>
     * <p>For information about how to obtain the name of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Template1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the alert template. You must specify at least one of the <code>Name</code> and <code>TemplateId</code> parameters.</p>
     * <p>For information about how to obtain the ID of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>70****</p>
     */
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

    public DescribeMetricRuleTemplateAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMetricRuleTemplateAttributeRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
