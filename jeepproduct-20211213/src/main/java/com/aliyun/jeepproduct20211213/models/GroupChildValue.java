// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class GroupChildValue extends TeaModel {
    @NameInMap("SubString")
    public String subString;

    @NameInMap("SubNuber")
    public String subNuber;

    public static GroupChildValue build(java.util.Map<String, ?> map) throws Exception {
        GroupChildValue self = new GroupChildValue();
        return TeaModel.build(map, self);
    }

    public GroupChildValue setSubString(String subString) {
        this.subString = subString;
        return this;
    }
    public String getSubString() {
        return this.subString;
    }

    public GroupChildValue setSubNuber(String subNuber) {
        this.subNuber = subNuber;
        return this;
    }
    public String getSubNuber() {
        return this.subNuber;
    }

}
