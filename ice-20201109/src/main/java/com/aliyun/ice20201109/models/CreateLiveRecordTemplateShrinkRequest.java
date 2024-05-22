// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveRecordTemplateShrinkRequest extends TeaModel {
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

    public static CreateLiveRecordTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRecordTemplateShrinkRequest self = new CreateLiveRecordTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRecordTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLiveRecordTemplateShrinkRequest setRecordFormatShrink(String recordFormatShrink) {
        this.recordFormatShrink = recordFormatShrink;
        return this;
    }
    public String getRecordFormatShrink() {
        return this.recordFormatShrink;
    }

}
