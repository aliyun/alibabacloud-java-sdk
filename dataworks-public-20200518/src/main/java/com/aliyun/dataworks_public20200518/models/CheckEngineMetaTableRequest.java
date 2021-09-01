// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckEngineMetaTableRequest extends TeaModel {
    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    @NameInMap("DataSourceType")
    @Validation(required = true)
    public String dataSourceType;

    public static CheckEngineMetaTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckEngineMetaTableRequest self = new CheckEngineMetaTableRequest();
        return TeaModel.build(map, self);
    }

    public CheckEngineMetaTableRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public CheckEngineMetaTableRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

}
