// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteProductInstanceConfigRequest extends TeaModel {
    @NameInMap("environmentUID")
    public String environmentUID;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static DeleteProductInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductInstanceConfigRequest self = new DeleteProductInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductInstanceConfigRequest setEnvironmentUID(String environmentUID) {
        this.environmentUID = environmentUID;
        return this;
    }
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    public DeleteProductInstanceConfigRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
