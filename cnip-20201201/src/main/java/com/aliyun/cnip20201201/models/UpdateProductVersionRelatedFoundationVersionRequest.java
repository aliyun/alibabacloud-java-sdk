// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductVersionRelatedFoundationVersionRequest extends TeaModel {
    @NameInMap("foundationVersionUID")
    public String foundationVersionUID;

    public static UpdateProductVersionRelatedFoundationVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionRelatedFoundationVersionRequest self = new UpdateProductVersionRelatedFoundationVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionRelatedFoundationVersionRequest setFoundationVersionUID(String foundationVersionUID) {
        this.foundationVersionUID = foundationVersionUID;
        return this;
    }
    public String getFoundationVersionUID() {
        return this.foundationVersionUID;
    }

}
