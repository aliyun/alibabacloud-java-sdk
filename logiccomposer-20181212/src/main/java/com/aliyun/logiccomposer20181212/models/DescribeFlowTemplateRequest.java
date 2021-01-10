// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeFlowTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static DescribeFlowTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowTemplateRequest self = new DescribeFlowTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
