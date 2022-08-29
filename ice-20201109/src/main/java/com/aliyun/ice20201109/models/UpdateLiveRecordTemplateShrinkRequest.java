// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTemplateShrinkRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("RecordFormat")
    public String recordFormatShrink;

    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateLiveRecordTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordTemplateShrinkRequest self = new UpdateLiveRecordTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLiveRecordTemplateShrinkRequest setRecordFormatShrink(String recordFormatShrink) {
        this.recordFormatShrink = recordFormatShrink;
        return this;
    }
    public String getRecordFormatShrink() {
        return this.recordFormatShrink;
    }

    public UpdateLiveRecordTemplateShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
