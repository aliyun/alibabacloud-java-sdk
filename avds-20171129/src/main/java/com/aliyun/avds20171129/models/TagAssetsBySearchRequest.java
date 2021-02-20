// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class TagAssetsBySearchRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Source")
    public String source;

    @NameInMap("Search")
    public String search;

    @NameInMap("AssetType")
    public String assetType;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static TagAssetsBySearchRequest build(java.util.Map<String, ?> map) throws Exception {
        TagAssetsBySearchRequest self = new TagAssetsBySearchRequest();
        return TeaModel.build(map, self);
    }

    public TagAssetsBySearchRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public TagAssetsBySearchRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public TagAssetsBySearchRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public TagAssetsBySearchRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public TagAssetsBySearchRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
