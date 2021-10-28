// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetPublicDatasetShrinkRequest extends TeaModel {
    // 查询的字段名:DatasetNo, DatasetDescription, About, AccessRequirements, Copyright, Tags, UpdateFrequency, Locations, LastModified, RegionIds
    @NameInMap("Attributes")
    public String attributesShrink;

    // 数据集名称
    @NameInMap("DatasetName")
    public String datasetName;

    public static GetPublicDatasetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublicDatasetShrinkRequest self = new GetPublicDatasetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPublicDatasetShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

    public GetPublicDatasetShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

}
