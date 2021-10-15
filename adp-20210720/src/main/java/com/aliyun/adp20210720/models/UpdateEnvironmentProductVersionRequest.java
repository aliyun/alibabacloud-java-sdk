// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentProductVersionRequest extends TeaModel {
    @NameInMap("productVersionUID")
    public String productVersionUID;

    @NameInMap("oldProductVersionUID")
    public String oldProductVersionUID;

    public static UpdateEnvironmentProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentProductVersionRequest self = new UpdateEnvironmentProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentProductVersionRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public UpdateEnvironmentProductVersionRequest setOldProductVersionUID(String oldProductVersionUID) {
        this.oldProductVersionUID = oldProductVersionUID;
        return this;
    }
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

}
