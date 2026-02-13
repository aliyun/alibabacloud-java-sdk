// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchStreamItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>“network problem can be”</p>
     */
    @NameInMap("content")
    public String content;

    @NameInMap("params")
    public Object params;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("type")
    public String type;

    public static AISearchStreamItem build(java.util.Map<String, ?> map) throws Exception {
        AISearchStreamItem self = new AISearchStreamItem();
        return TeaModel.build(map, self);
    }

    public AISearchStreamItem setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AISearchStreamItem setParams(Object params) {
        this.params = params;
        return this;
    }
    public Object getParams() {
        return this.params;
    }

    public AISearchStreamItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
