// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatRefDocPostion extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static ChatRefDocPostion build(java.util.Map<String, ?> map) throws Exception {
        ChatRefDocPostion self = new ChatRefDocPostion();
        return TeaModel.build(map, self);
    }

    public ChatRefDocPostion setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public ChatRefDocPostion setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}
