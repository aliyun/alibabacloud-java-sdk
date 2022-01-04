// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateDataSourceRequest extends TeaModel {
    @NameInMap("ConnectionInfo")
    public String connectionInfo;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    public static UpdateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceRequest self = new UpdateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceRequest setConnectionInfo(String connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }
    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    public UpdateDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdateDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

}
