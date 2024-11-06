// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateHadoopDataSourceRequest extends TeaModel {
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
     * <p>Service description.</p>
     * 
     * <strong>example:</strong>
     * <p>pxf for hdfs data source</p>
     */
    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    /**
     * <p>Service name.</p>
     * 
     * <strong>example:</strong>
     * <p>hdfs_pxf</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>Type of Hadoop external table to be enabled, with values:</p>
     * <ul>
     * <li><p>HDFS </p>
     * </li>
     * <li><p>Hive</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HDFS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>When HadoopCreateType=Emr, this field should contain the EMR instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-1234567</p>
     */
    @NameInMap("EmrInstanceId")
    public String emrInstanceId;

    /**
     * <p>Content string of the Hadoop hdfs-site.xml file. This field is required when enabling an HDFS external table.</p>
     * 
     * <strong>example:</strong>
     * <?xml version="1.0" ?>
     * <!-- Created at 2023-08-15 13:52:43.945 -->
     * <configuration>
     *     <property>
     *         <name>dfs.datanode.cache.revocation.timeout.ms</name>
     *         <value>900000</value>
     *     </property>
     *     <property>
     *         <name>dfs.namenode.resource.check.interval</name>
     *         <value>5000</value>
     *     </property>
     * </configuration>
     */
    @NameInMap("HDFSConf")
    public String HDFSConf;

    /**
     * <p>Content string of the Hadoop core-site.xml file.</p>
     * 
     * <strong>example:</strong>
     * <?xml version="1.0" ?>
     * <!-- Created at 2023-08-15 13:52:39.527 -->
     * <configuration>
     *     <property>
     *         <name>hadoop.http.authentication.kerberos.keytab</name>
     *         <value>/etc/emr/hadoop-conf/http.keytab</value>
     *     </property>
     *     <property>
     *         <name>fs.oss.idle.timeout.millisecond</name>
     *         <value>30000</value>
     *     </property>
     *     <property>
     *         <name>fs.oss.download.thread.concurrency</name>
     *         <value>32</value>
     *     </property>
     * </configuration>
     */
    @NameInMap("HadoopCoreConf")
    public String hadoopCoreConf;

    /**
     * <p>External service type:</p>
     * <ul>
     * <li><p>emr</p>
     * </li>
     * <li><p>hadoop: Self-built Hadoop</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>emr</p>
     */
    @NameInMap("HadoopCreateType")
    public String hadoopCreateType;

    /**
     * <p>Address and hostname of the Hadoop cluster\&quot;s source node in the /etc/hosts file.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.220.128 master-1-1.c-xxx.cn-shanghai.emr.aliyuncs.com
     * 192.168.220.129 core-1-1.c-xxx.cn-shanghai.emr.aliyuncs.com
     * 192.168.220.130 core-1-2.c-xxx.cn-shanghai.emr.aliyuncs.com</p>
     */
    @NameInMap("HadoopHostsAddress")
    public String hadoopHostsAddress;

    /**
     * <p>Content string of the Hadoop hive-site.xml file. This field is required when enabling a HIVE external table.</p>
     * 
     * <strong>example:</strong>
     * <?xml version="1.0" ?>
     * <!-- Created at 2023-08-15 13:52:50.646 -->
     * <configuration>
     *     <property>
     *         <name>hive.exec.reducers.bytes.per.reducer</name>
     *         <value>256000000</value>
     *     </property>
     *     <property>
     *         <name>hive.stats.column.autogather</name>
     *         <value>false</value>
     *     </property>
     * </configuration>
     */
    @NameInMap("HiveConf")
    public String hiveConf;

    /**
     * <p>Content string of the Hadoop mapred-site.xml file. This field is required when enabling an HDFS external table.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("MapReduceConf")
    public String mapReduceConf;

    /**
     * <p>Region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> interface to view available region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Content string of the Hadoop yarn-site.xml file. This field is required when enabling an HDFS external table.</p>
     * 
     * <strong>example:</strong>
     * <?xml version="1.0" ?>
     * <!-- Created at 2023-08-15 13:53:29.021 -->
     * <configuration>
     *     <property>
     *         <name>yarn.nodemanager.linux-container-executor.nonsecure-mode.local-user</name>
     *         <value>hadoop</value>
     *     </property>
     *     <property>
     *         <name>yarn.scheduler.fair.dynamic.max.assign</name>
     *         <value>true</value>
     *     </property>
     * </configuration>
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
