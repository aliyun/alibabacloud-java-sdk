// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class Checkout extends TeaModel {
    @NameInMap("ref")
    public String ref;

    @NameInMap("remote")
    public String remote;

    public static Checkout build(java.util.Map<String, ?> map) throws Exception {
        Checkout self = new Checkout();
        return TeaModel.build(map, self);
    }

    public Checkout setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public Checkout setRemote(String remote) {
        this.remote = remote;
        return this;
    }
    public String getRemote() {
        return this.remote;
    }

}
