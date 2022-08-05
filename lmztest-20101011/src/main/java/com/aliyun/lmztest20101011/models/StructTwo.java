// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class StructTwo extends TeaModel {
    @NameInMap("code")
    public String code;

    public static StructTwo build(java.util.Map<String, ?> map) throws Exception {
        StructTwo self = new StructTwo();
        return TeaModel.build(map, self);
    }

    public StructTwo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
