// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class SceneItem extends TeaModel {
    @NameInMap("detail")
    public String detail;

    @NameInMap("type")
    public String type;

    public static SceneItem build(java.util.Map<String, ?> map) throws Exception {
        SceneItem self = new SceneItem();
        return TeaModel.build(map, self);
    }

    public SceneItem setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public SceneItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
