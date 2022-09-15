// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentProductVersionRequest extends TeaModel {
    @NameInMap("oldProductVersionSpecUID")
    public String oldProductVersionSpecUID;

    @NameInMap("oldProductVersionUID")
    public String oldProductVersionUID;

    @NameInMap("productVersionSpecUID")
    public String productVersionSpecUID;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static UpdateEnvironmentProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentProductVersionRequest self = new UpdateEnvironmentProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentProductVersionRequest setOldProductVersionSpecUID(String oldProductVersionSpecUID) {
        this.oldProductVersionSpecUID = oldProductVersionSpecUID;
        return this;
    }
    public String getOldProductVersionSpecUID() {
        return this.oldProductVersionSpecUID;
    }

    public UpdateEnvironmentProductVersionRequest setOldProductVersionUID(String oldProductVersionUID) {
        this.oldProductVersionUID = oldProductVersionUID;
        return this;
    }
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

    public UpdateEnvironmentProductVersionRequest setProductVersionSpecUID(String productVersionSpecUID) {
        this.productVersionSpecUID = productVersionSpecUID;
        return this;
    }
    public String getProductVersionSpecUID() {
        return this.productVersionSpecUID;
    }

    public UpdateEnvironmentProductVersionRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
