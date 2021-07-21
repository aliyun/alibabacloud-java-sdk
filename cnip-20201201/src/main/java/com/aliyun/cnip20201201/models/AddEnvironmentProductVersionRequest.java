// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvironmentProductVersionRequest extends TeaModel {
    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static AddEnvironmentProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentProductVersionRequest self = new AddEnvironmentProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentProductVersionRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
