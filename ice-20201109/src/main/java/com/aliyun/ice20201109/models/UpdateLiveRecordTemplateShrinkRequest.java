// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTemplateShrinkRequest extends TeaModel {
    /**
     * <p>代表资源名称的资源属性字段</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>录制格式</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordFormat")
    public String recordFormatShrink;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
