// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class TagAssetsByRecordsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Source")
    public String source;

    @NameInMap("AssetType")
    public String assetType;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    @NameInMap("RecordIds")
    public java.util.List<Integer> recordIds;

    public static TagAssetsByRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        TagAssetsByRecordsRequest self = new TagAssetsByRecordsRequest();
        return TeaModel.build(map, self);
    }

    public TagAssetsByRecordsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public TagAssetsByRecordsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public TagAssetsByRecordsRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public TagAssetsByRecordsRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public TagAssetsByRecordsRequest setRecordIds(java.util.List<Integer> recordIds) {
        this.recordIds = recordIds;
        return this;
    }
    public java.util.List<Integer> getRecordIds() {
        return this.recordIds;
    }

}
