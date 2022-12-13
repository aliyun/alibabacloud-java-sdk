// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateRichTextRequest extends TeaModel {
    @NameInMap("instanceId")
    public Long instanceId;

    @NameInMap("instanceType")
    public String instanceType;

    @NameInMap("richText")
    public String richText;

    public static CreateRichTextRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRichTextRequest self = new CreateRichTextRequest();
        return TeaModel.build(map, self);
    }

    public CreateRichTextRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public CreateRichTextRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateRichTextRequest setRichText(String richText) {
        this.richText = richText;
        return this;
    }
    public String getRichText() {
        return this.richText;
    }

}
