// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UuidFilter extends TeaModel {
    @NameInMap("eq")
    public String eq;

    @NameInMap("in")
    public java.util.List<String> in;

    public static UuidFilter build(java.util.Map<String, ?> map) throws Exception {
        UuidFilter self = new UuidFilter();
        return TeaModel.build(map, self);
    }

    public UuidFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

    public UuidFilter setIn(java.util.List<String> in) {
        this.in = in;
        return this;
    }
    public java.util.List<String> getIn() {
        return this.in;
    }

}
