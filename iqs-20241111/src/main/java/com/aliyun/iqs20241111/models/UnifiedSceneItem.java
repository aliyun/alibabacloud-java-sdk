// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedSceneItem extends TeaModel {
    @NameInMap("detail")
    public String detail;

    /**
     * <strong>example:</strong>
     * <p>time</p>
     */
    @NameInMap("type")
    public String type;

    public static UnifiedSceneItem build(java.util.Map<String, ?> map) throws Exception {
        UnifiedSceneItem self = new UnifiedSceneItem();
        return TeaModel.build(map, self);
    }

    public UnifiedSceneItem setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public UnifiedSceneItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
