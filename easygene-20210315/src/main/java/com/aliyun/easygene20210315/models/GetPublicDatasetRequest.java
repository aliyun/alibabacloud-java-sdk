// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetPublicDatasetRequest extends TeaModel {
    // 数据集名称
    @NameInMap("DatasetName")
    public String datasetName;

    // 查询的字段名
    @NameInMap("Attributes")
    public java.util.List<String> attributes;

    public static GetPublicDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublicDatasetRequest self = new GetPublicDatasetRequest();
        return TeaModel.build(map, self);
    }

    public GetPublicDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public GetPublicDatasetRequest setAttributes(java.util.List<String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<String> getAttributes() {
        return this.attributes;
    }

}
