// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryTimeTemplateDetailRequest extends TeaModel {
    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static QueryTimeTemplateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTimeTemplateDetailRequest self = new QueryTimeTemplateDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTimeTemplateDetailRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
