// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateRichTextRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12221</p>
     */
    @NameInMap("instanceId")
    public Long instanceId;

    /**
     * <strong>example:</strong>
     * <p>INCIDENT 事件 ALERT告警 PROBLEM故障</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>这是一个富文本</p>
     */
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
