// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    @NameInMap("ConnectionInfo")
    public String connectionInfo;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("Name")
    public String name;

    public static CreateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceRequest self = new CreateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceRequest setConnectionInfo(String connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }
    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    public CreateDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateDataSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
