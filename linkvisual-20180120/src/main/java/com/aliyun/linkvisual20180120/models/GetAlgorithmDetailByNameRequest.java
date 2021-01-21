// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAlgorithmDetailByNameRequest extends TeaModel {
    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static GetAlgorithmDetailByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDetailByNameRequest self = new GetAlgorithmDetailByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDetailByNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
