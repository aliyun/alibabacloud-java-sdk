// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class QueryFaceImageTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static QueryFaceImageTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceImageTemplateRequest self = new QueryFaceImageTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceImageTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
