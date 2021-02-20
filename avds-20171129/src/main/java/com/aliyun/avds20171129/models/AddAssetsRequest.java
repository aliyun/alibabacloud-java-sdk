// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddAssetsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StartAfterVerified")
    public Boolean startAfterVerified;

    @NameInMap("AssetGroupId")
    public String assetGroupId;

    @NameInMap("Assets")
    public java.util.List<String> assets;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static AddAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAssetsRequest self = new AddAssetsRequest();
        return TeaModel.build(map, self);
    }

    public AddAssetsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddAssetsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddAssetsRequest setStartAfterVerified(Boolean startAfterVerified) {
        this.startAfterVerified = startAfterVerified;
        return this;
    }
    public Boolean getStartAfterVerified() {
        return this.startAfterVerified;
    }

    public AddAssetsRequest setAssetGroupId(String assetGroupId) {
        this.assetGroupId = assetGroupId;
        return this;
    }
    public String getAssetGroupId() {
        return this.assetGroupId;
    }

    public AddAssetsRequest setAssets(java.util.List<String> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<String> getAssets() {
        return this.assets;
    }

    public AddAssetsRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
