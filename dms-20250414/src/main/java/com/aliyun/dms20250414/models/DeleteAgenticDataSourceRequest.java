// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteAgenticDataSourceRequest extends TeaModel {
    /**
     * <p>The UUID of the data source to delete. Ensure that no workloads are using the data source before deletion.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou_a1b2c3d4e5f6</p>
     */
    @NameInMap("DataSourceUuid")
    public String dataSourceUuid;

    public static DeleteAgenticDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDataSourceRequest self = new DeleteAgenticDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDataSourceRequest setDataSourceUuid(String dataSourceUuid) {
        this.dataSourceUuid = dataSourceUuid;
        return this;
    }
    public String getDataSourceUuid() {
        return this.dataSourceUuid;
    }

}
