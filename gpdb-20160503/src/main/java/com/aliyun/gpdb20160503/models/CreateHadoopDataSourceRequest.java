// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateHadoopDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    @NameInMap("DataSourceName")
    public String dataSourceName;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("EmrInstanceId")
    public String emrInstanceId;

    @NameInMap("HDFSConf")
    public String HDFSConf;

    @NameInMap("HadoopCoreConf")
    public String hadoopCoreConf;

    @NameInMap("HadoopCreateType")
    public String hadoopCreateType;

    @NameInMap("HadoopHostsAddress")
    public String hadoopHostsAddress;

    @NameInMap("HiveConf")
    public String hiveConf;

    @NameInMap("MapReduceConf")
    public String mapReduceConf;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("YarnConf")
    public String yarnConf;

    public static CreateHadoopDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHadoopDataSourceRequest self = new CreateHadoopDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateHadoopDataSourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateHadoopDataSourceRequest setDataSourceDescription(String dataSourceDescription) {
        this.dataSourceDescription = dataSourceDescription;
        return this;
    }
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    public CreateHadoopDataSourceRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public CreateHadoopDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateHadoopDataSourceRequest setEmrInstanceId(String emrInstanceId) {
        this.emrInstanceId = emrInstanceId;
        return this;
    }
    public String getEmrInstanceId() {
        return this.emrInstanceId;
    }

    public CreateHadoopDataSourceRequest setHDFSConf(String HDFSConf) {
        this.HDFSConf = HDFSConf;
        return this;
    }
    public String getHDFSConf() {
        return this.HDFSConf;
    }

    public CreateHadoopDataSourceRequest setHadoopCoreConf(String hadoopCoreConf) {
        this.hadoopCoreConf = hadoopCoreConf;
        return this;
    }
    public String getHadoopCoreConf() {
        return this.hadoopCoreConf;
    }

    public CreateHadoopDataSourceRequest setHadoopCreateType(String hadoopCreateType) {
        this.hadoopCreateType = hadoopCreateType;
        return this;
    }
    public String getHadoopCreateType() {
        return this.hadoopCreateType;
    }

    public CreateHadoopDataSourceRequest setHadoopHostsAddress(String hadoopHostsAddress) {
        this.hadoopHostsAddress = hadoopHostsAddress;
        return this;
    }
    public String getHadoopHostsAddress() {
        return this.hadoopHostsAddress;
    }

    public CreateHadoopDataSourceRequest setHiveConf(String hiveConf) {
        this.hiveConf = hiveConf;
        return this;
    }
    public String getHiveConf() {
        return this.hiveConf;
    }

    public CreateHadoopDataSourceRequest setMapReduceConf(String mapReduceConf) {
        this.mapReduceConf = mapReduceConf;
        return this;
    }
    public String getMapReduceConf() {
        return this.mapReduceConf;
    }

    public CreateHadoopDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHadoopDataSourceRequest setYarnConf(String yarnConf) {
        this.yarnConf = yarnConf;
        return this;
    }
    public String getYarnConf() {
        return this.yarnConf;
    }

}
