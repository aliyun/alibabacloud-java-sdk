// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FTApiAliasApiRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static FTApiAliasApiRequest build(java.util.Map<String, ?> map) throws Exception {
        FTApiAliasApiRequest self = new FTApiAliasApiRequest();
        return TeaModel.build(map, self);
    }

    public FTApiAliasApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
