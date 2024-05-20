// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class TextTheme extends TeaModel {
    @NameInMap("desc")
    public String desc;

    @NameInMap("name")
    public String name;

    public static TextTheme build(java.util.Map<String, ?> map) throws Exception {
        TextTheme self = new TextTheme();
        return TeaModel.build(map, self);
    }

    public TextTheme setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public TextTheme setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
