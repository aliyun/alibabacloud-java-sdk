// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetGlobalConfigRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static GetGlobalConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalConfigRequest self = new GetGlobalConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetGlobalConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
