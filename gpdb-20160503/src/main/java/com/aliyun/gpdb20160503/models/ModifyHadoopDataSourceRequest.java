// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyHadoopDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    @NameInMap("DataSourceId")
    public String dataSourceId;

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

    public static ModifyHadoopDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHadoopDataSourceRequest self = new ModifyHadoopDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHadoopDataSourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyHadoopDataSourceRequest setDataSourceDescription(String dataSourceDescription) {
        this.dataSourceDescription = dataSourceDescription;
        return this;
    }
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    public ModifyHadoopDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ModifyHadoopDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ModifyHadoopDataSourceRequest setEmrInstanceId(String emrInstanceId) {
        this.emrInstanceId = emrInstanceId;
        return this;
    }
    public String getEmrInstanceId() {
        return this.emrInstanceId;
    }

    public ModifyHadoopDataSourceRequest setHDFSConf(String HDFSConf) {
        this.HDFSConf = HDFSConf;
        return this;
    }
    public String getHDFSConf() {
        return this.HDFSConf;
    }

    public ModifyHadoopDataSourceRequest setHadoopCoreConf(String hadoopCoreConf) {
        this.hadoopCoreConf = hadoopCoreConf;
        return this;
    }
    public String getHadoopCoreConf() {
        return this.hadoopCoreConf;
    }

    public ModifyHadoopDataSourceRequest setHadoopCreateType(String hadoopCreateType) {
        this.hadoopCreateType = hadoopCreateType;
        return this;
    }
    public String getHadoopCreateType() {
        return this.hadoopCreateType;
    }

    public ModifyHadoopDataSourceRequest setHadoopHostsAddress(String hadoopHostsAddress) {
        this.hadoopHostsAddress = hadoopHostsAddress;
        return this;
    }
    public String getHadoopHostsAddress() {
        return this.hadoopHostsAddress;
    }

    public ModifyHadoopDataSourceRequest setHiveConf(String hiveConf) {
        this.hiveConf = hiveConf;
        return this;
    }
    public String getHiveConf() {
        return this.hiveConf;
    }

    public ModifyHadoopDataSourceRequest setMapReduceConf(String mapReduceConf) {
        this.mapReduceConf = mapReduceConf;
        return this;
    }
    public String getMapReduceConf() {
        return this.mapReduceConf;
    }

    public ModifyHadoopDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHadoopDataSourceRequest setYarnConf(String yarnConf) {
        this.yarnConf = yarnConf;
        return this;
    }
    public String getYarnConf() {
        return this.yarnConf;
    }

}
