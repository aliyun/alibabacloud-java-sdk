// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetRichTextRequest extends TeaModel {
    // 资源类型
    @NameInMap("instanceId")
    public Long instanceId;

    @NameInMap("instanceType")
    public String instanceType;

    // 资源id
    @NameInMap("richTextId")
    public Long richTextId;

    public static GetRichTextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRichTextRequest self = new GetRichTextRequest();
        return TeaModel.build(map, self);
    }

    public GetRichTextRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetRichTextRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public GetRichTextRequest setRichTextId(Long richTextId) {
        this.richTextId = richTextId;
        return this;
    }
    public Long getRichTextId() {
        return this.richTextId;
    }

}
