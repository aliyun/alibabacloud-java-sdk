// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static DeleteMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleTemplateRequest self = new DeleteMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

}
