// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class QueryFaceImageTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    // A short description of struct
    @NameInMap("UserId")
    public String userId;

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

    public QueryFaceImageTemplateRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
