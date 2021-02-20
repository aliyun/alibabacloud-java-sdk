// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteAssetsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("AssetIds")
    public java.util.List<String> assetIds;

    public static DeleteAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAssetsRequest self = new DeleteAssetsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAssetsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteAssetsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteAssetsRequest setAssetIds(java.util.List<String> assetIds) {
        this.assetIds = assetIds;
        return this;
    }
    public java.util.List<String> getAssetIds() {
        return this.assetIds;
    }

}
