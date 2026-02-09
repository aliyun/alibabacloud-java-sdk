// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GlobalSceneItem extends TeaModel {
    @NameInMap("detail")
    public String detail;

    /**
     * <strong>example:</strong>
     * <p>answerBox</p>
     */
    @NameInMap("type")
    public String type;

    public static GlobalSceneItem build(java.util.Map<String, ?> map) throws Exception {
        GlobalSceneItem self = new GlobalSceneItem();
        return TeaModel.build(map, self);
    }

    public GlobalSceneItem setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public GlobalSceneItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
