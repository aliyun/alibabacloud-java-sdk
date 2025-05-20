// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatRefDocPageNum extends TeaModel {
    @NameInMap("num")
    public Integer num;

    @NameInMap("pos")
    public java.util.List<java.util.List<ChatRefDocPostion>> pos;

    public static ChatRefDocPageNum build(java.util.Map<String, ?> map) throws Exception {
        ChatRefDocPageNum self = new ChatRefDocPageNum();
        return TeaModel.build(map, self);
    }

    public ChatRefDocPageNum setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ChatRefDocPageNum setPos(java.util.List<java.util.List<ChatRefDocPostion>> pos) {
        this.pos = pos;
        return this;
    }
    public java.util.List<java.util.List<ChatRefDocPostion>> getPos() {
        return this.pos;
    }

}
