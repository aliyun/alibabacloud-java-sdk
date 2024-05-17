// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteStreamingDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSourceId")
    public Integer dataSourceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteStreamingDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamingDataSourceRequest self = new DeleteStreamingDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStreamingDataSourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteStreamingDataSourceRequest setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Integer getDataSourceId() {
        return this.dataSourceId;
    }

    public DeleteStreamingDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
