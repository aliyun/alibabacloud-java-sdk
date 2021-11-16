// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckEngineMetaTableRequest extends TeaModel {
    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("TableGuid")
    public String tableGuid;

    public static CheckEngineMetaTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckEngineMetaTableRequest self = new CheckEngineMetaTableRequest();
        return TeaModel.build(map, self);
    }

    public CheckEngineMetaTableRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CheckEngineMetaTableRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
