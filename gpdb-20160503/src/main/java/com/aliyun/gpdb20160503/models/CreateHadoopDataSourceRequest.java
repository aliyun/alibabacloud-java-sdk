// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateHadoopDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>pxf for hdfs data source</p>
     */
    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    /**
     * <strong>example:</strong>
     * <p>hdfs_pxf</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <strong>example:</strong>
     * <p>HDFS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <strong>example:</strong>
     * <p>c-1234567</p>
     */
    @NameInMap("EmrInstanceId")
    public String emrInstanceId;

    /**
     * <p>The string that specifies the content of the Hadoop hdfs-site.xml file. This parameter must be specified when DataSourceType is set to HDFS.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("HDFSConf")
    public String HDFSConf;

    /**
     * <p>The string that specifies the content of the Hadoop core-site.xml file.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("HadoopCoreConf")
    public String hadoopCoreConf;

    /**
     * <strong>example:</strong>
     * <p>emr</p>
     */
    @NameInMap("HadoopCreateType")
    public String hadoopCreateType;

    /**
     * <p>The IP address and hostname of the Hadoop cluster (data source) in the /etc/hosts file.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1 localhost</p>
     */
    @NameInMap("HadoopHostsAddress")
    public String hadoopHostsAddress;

    /**
     * <p>The string that specifies the content of the Hadoop hive-site.xml file. This parameter must be specified when DataSourceType is set to Hive.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("HiveConf")
    public String hiveConf;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("MapReduceConf")
    public String mapReduceConf;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The string that specifies the content of the Hadoop yarn-site.xml file. This parameter must be specified when DataSourceType is set to HDFS.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
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
