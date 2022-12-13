// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateRichTextRequest extends TeaModel {
    @NameInMap("instanceId")
    public Long instanceId;

    @NameInMap("instanceType")
    public String instanceType;

    @NameInMap("richText")
    public String richText;

    @NameInMap("richTextId")
    public Long richTextId;

    public static UpdateRichTextRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRichTextRequest self = new UpdateRichTextRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRichTextRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public UpdateRichTextRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateRichTextRequest setRichText(String richText) {
        this.richText = richText;
        return this;
    }
    public String getRichText() {
        return this.richText;
    }

    public UpdateRichTextRequest setRichTextId(Long richTextId) {
        this.richTextId = richTextId;
        return this;
    }
    public Long getRichTextId() {
        return this.richTextId;
    }

}
