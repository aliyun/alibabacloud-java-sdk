// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtFlowSpecialRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static FtFlowSpecialRequest build(java.util.Map<String, ?> map) throws Exception {
        FtFlowSpecialRequest self = new FtFlowSpecialRequest();
        return TeaModel.build(map, self);
    }

    public FtFlowSpecialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
