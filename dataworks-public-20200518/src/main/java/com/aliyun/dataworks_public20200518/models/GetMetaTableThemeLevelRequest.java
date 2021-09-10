// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableThemeLevelRequest extends TeaModel {
    @NameInMap("TableGuid")
    public String tableGuid;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    public static GetMetaTableThemeLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableThemeLevelRequest self = new GetMetaTableThemeLevelRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableThemeLevelRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableThemeLevelRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

}
