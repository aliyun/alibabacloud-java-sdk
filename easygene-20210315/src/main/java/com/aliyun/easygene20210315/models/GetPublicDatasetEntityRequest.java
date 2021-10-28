// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetPublicDatasetEntityRequest extends TeaModel {
    // 数据集名称
    @NameInMap("DatasetName")
    public String datasetName;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 公共数据集所在区域
    @NameInMap("Location")
    public String location;

    public static GetPublicDatasetEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublicDatasetEntityRequest self = new GetPublicDatasetEntityRequest();
        return TeaModel.build(map, self);
    }

    public GetPublicDatasetEntityRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public GetPublicDatasetEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetPublicDatasetEntityRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
