// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyStreamingDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DataSourceConfig")
    public String dataSourceConfig;

    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyStreamingDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingDataSourceRequest self = new ModifyStreamingDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingDataSourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyStreamingDataSourceRequest setDataSourceConfig(String dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
        return this;
    }
    public String getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    public ModifyStreamingDataSourceRequest setDataSourceDescription(String dataSourceDescription) {
        this.dataSourceDescription = dataSourceDescription;
        return this;
    }
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    public ModifyStreamingDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ModifyStreamingDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
