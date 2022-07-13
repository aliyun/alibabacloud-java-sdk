// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsGetAssetRequest extends TeaModel {
    // AssetId
    @NameInMap("Id")
    public String id;

    public static AssetsGetAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        AssetsGetAssetRequest self = new AssetsGetAssetRequest();
        return TeaModel.build(map, self);
    }

    public AssetsGetAssetRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
