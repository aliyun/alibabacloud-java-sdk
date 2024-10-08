// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetRichTextRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>INCIDENT 事件 ALERT告警 PROBLEM故障</p>
     */
    @NameInMap("instanceId")
    public Long instanceId;

    /**
     * <strong>example:</strong>
     * <p>INCIDENT</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>12221才</p>
     */
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
