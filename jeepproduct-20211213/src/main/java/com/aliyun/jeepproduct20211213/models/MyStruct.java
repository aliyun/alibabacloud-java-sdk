// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class MyStruct extends TeaModel {
    @NameInMap("OneParam")
    public Boolean oneParam;

    public static MyStruct build(java.util.Map<String, ?> map) throws Exception {
        MyStruct self = new MyStruct();
        return TeaModel.build(map, self);
    }

    public MyStruct setOneParam(Boolean oneParam) {
        this.oneParam = oneParam;
        return this;
    }
    public Boolean getOneParam() {
        return this.oneParam;
    }

}
