// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyHadoopDataSourceRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Service description, with a maximum length of 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>pxf for hdfs data source</p>
     */
    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li>mysql</li>
     * </ul>
     * <ul>
     * <li>postgresql</li>
     * </ul>
     * <ul>
     * <li>hdfs</li>
     * </ul>
     * <ul>
     * <li>hive</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>When HadoopCreateType is Emr, the value of this field is the EMR instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-1234567</p>
     */
    @NameInMap("EmrInstanceId")
    public String emrInstanceId;

    /**
     * <p>The content of the Hadoop hdfs-site.xml file. This parameter must be specified when DataSourceType is set to HDFS.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("HDFSConf")
    public String HDFSConf;

    /**
     * <p>The content of the Hadoop core-site.xml file.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("HadoopCoreConf")
    public String hadoopCoreConf;

    /**
     * <p>The type of the external service. Valid values:</p>
     * <ul>
     * <li>emr: E-MapReduce (EMR) Hadoop cluster.</li>
     * <li>selfCreate: self-managed Hadoop cluster.</li>
     * </ul>
     * 
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
     * <p>The content of the Hadoop hive-site.xml file. This parameter must be specified when DataSourceType is set to Hive.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("HiveConf")
    public String hiveConf;

    /**
     * <p>The content of the Hadoop mapred-site.xml file. This parameter must be specified when DataSourceType is set to HDFS.</p>
     * 
     * <strong>example:</strong>
     * <?xml version="1.0" ?>
     * <!-- Created at 2023-08-15 13:53:28.962 -->
     * <configuration>
     *     <property>
     *         <name>mapreduce.map.speculative</name>
     *         <value>true</value>
     *     </property>
     *     <property>
     *         <name>mapreduce.jobhistory.keytab</name>
     *         <value></value>
     *     </property>
     * </configuration>
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
     * <p>The content of the Hadoop yarn-site.xml file. This parameter must be specified when DataSourceType is set to HDFS.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
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
