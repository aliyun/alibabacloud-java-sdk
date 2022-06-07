// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetResourceSnapshotRequest extends TeaModel {
    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static GetResourceSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceSnapshotRequest self = new GetResourceSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceSnapshotRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
