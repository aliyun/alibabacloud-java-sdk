// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableThemeLevelRequest extends TeaModel {
    /**
     * <p>The data type. Currently, only odps is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The unique ID of the table. Format: odps.${projectName}.${tableName}.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.project1.name1</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    public static GetMetaTableThemeLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableThemeLevelRequest self = new GetMetaTableThemeLevelRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableThemeLevelRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetMetaTableThemeLevelRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
