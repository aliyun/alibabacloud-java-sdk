// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateStorageCollectorRequest extends TeaModel {
    // 数据源类型
    @NameInMap("DatasourceType")
    public String datasourceType;

    public static CreateStorageCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageCollectorRequest self = new CreateStorageCollectorRequest();
        return TeaModel.build(map, self);
    }

    public CreateStorageCollectorRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

}
