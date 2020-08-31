// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtEagleEyeRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static FtEagleEyeRequest build(java.util.Map<String, ?> map) throws Exception {
        FtEagleEyeRequest self = new FtEagleEyeRequest();
        return TeaModel.build(map, self);
    }

    public FtEagleEyeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
