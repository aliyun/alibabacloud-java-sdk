// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordTemplateRequest extends TeaModel {
    // 代表资源一级ID的资源属性字段
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteLiveRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordTemplateRequest self = new DeleteLiveRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
