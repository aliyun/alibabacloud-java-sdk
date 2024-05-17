// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateStreamingDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSourceConfig")
    public String dataSourceConfig;

    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public Integer serviceId;

    public static CreateStreamingDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamingDataSourceRequest self = new CreateStreamingDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateStreamingDataSourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateStreamingDataSourceRequest setDataSourceConfig(String dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
        return this;
    }
    public String getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    public CreateStreamingDataSourceRequest setDataSourceDescription(String dataSourceDescription) {
        this.dataSourceDescription = dataSourceDescription;
        return this;
    }
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    public CreateStreamingDataSourceRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public CreateStreamingDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateStreamingDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStreamingDataSourceRequest setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Integer getServiceId() {
        return this.serviceId;
    }

}
