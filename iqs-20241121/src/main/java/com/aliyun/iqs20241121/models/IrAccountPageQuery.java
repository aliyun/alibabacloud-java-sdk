// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class IrAccountPageQuery extends TeaModel {
    @NameInMap("name")
    public String name;

    public static IrAccountPageQuery build(java.util.Map<String, ?> map) throws Exception {
        IrAccountPageQuery self = new IrAccountPageQuery();
        return TeaModel.build(map, self);
    }

    public IrAccountPageQuery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
