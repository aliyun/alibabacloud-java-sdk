// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTemplateShrinkRequest extends TeaModel {
    /**
     * <p>代表资源名称的资源属性字段</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>录制格式</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordFormat")
    public String recordFormatShrink;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
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
