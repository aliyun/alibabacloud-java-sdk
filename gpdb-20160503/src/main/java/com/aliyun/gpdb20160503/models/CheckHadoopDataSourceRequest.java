// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckHadoopDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckDir")
    public String checkDir;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("RegionId")
    public String regionId;

    public static CheckHadoopDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckHadoopDataSourceRequest self = new CheckHadoopDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CheckHadoopDataSourceRequest setCheckDir(String checkDir) {
        this.checkDir = checkDir;
        return this;
    }
    public String getCheckDir() {
        return this.checkDir;
    }

    public CheckHadoopDataSourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CheckHadoopDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CheckHadoopDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
