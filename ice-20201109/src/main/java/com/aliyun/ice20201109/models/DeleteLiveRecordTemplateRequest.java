// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordTemplateRequest extends TeaModel {
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
