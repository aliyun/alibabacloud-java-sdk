// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetIdpConfigRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetIdpConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdpConfigRequest self = new GetIdpConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetIdpConfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
