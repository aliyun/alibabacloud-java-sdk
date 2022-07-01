// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class StructFour extends TeaModel {
    // desc
    @NameInMap("Desc")
    public String desc;

    public static StructFour build(java.util.Map<String, ?> map) throws Exception {
        StructFour self = new StructFour();
        return TeaModel.build(map, self);
    }

    public StructFour setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
