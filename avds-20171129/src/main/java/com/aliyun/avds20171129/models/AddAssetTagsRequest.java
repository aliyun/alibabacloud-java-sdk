// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddAssetTagsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Assets")
    public java.util.List<String> assets;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static AddAssetTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAssetTagsRequest self = new AddAssetTagsRequest();
        return TeaModel.build(map, self);
    }

    public AddAssetTagsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddAssetTagsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddAssetTagsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddAssetTagsRequest setAssets(java.util.List<String> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<String> getAssets() {
        return this.assets;
    }

    public AddAssetTagsRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
