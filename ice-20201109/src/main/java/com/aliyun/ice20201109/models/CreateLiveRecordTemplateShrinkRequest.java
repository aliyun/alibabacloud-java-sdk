// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveRecordTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The name of the template.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of recording formats.</p>
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
