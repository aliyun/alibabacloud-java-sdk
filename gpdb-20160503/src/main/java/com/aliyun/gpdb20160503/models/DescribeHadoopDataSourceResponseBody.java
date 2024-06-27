// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHadoopDataSourceResponseBody extends TeaModel {
    /**
     * <p>The time when the service was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-08T16:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the service. The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>pxf for hdfs data source</p>
     */
    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    /**
     * <p>The service directory in which Hadoop-related configuration files are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>HadoopDir</p>
     */
    @NameInMap("DataSourceDir")
    public String dataSourceDir;

    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>hdfs_pxf</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>The status of the service. Valid values:</p>
     * <ul>
     * <li>init</li>
     * <li>running</li>
     * <li>exception</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DataSourceStatus")
    public String dataSourceStatus;

    /**
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The E-MapReduce (EMR) Hadoop cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-1234567</p>
     */
    @NameInMap("EmrInstanceId")
    public String emrInstanceId;

    /**
     * <p>The content of the Hadoop hdfs-site.xml file.</p>
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
     * <li>HDFS</li>
     * <li>HIVE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HDFS</p>
     */
    @NameInMap("HadoopCreateType")
    public String hadoopCreateType;

    /**
     * <ul>
     * <li>The address and hostname of the Hadoop cluster (data source) in the /etc/hosts directory.</li>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1 localhost</p>
     */
    @NameInMap("HadoopHostsAddress")
    public String hadoopHostsAddress;

    /**
     * <p>The content of the Hadoop hive-site.xml file.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("HiveConf")
    public String hiveConf;

    /**
     * <p>The content of the Hadoop MapReduceConf file.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("MapReduceConf")
    public String mapReduceConf;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the service status. For example, if the service is in the exception state, the cause of the exception is displayed. If the service is in the running state, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("StatusMessage")
    public String statusMessage;

    /**
     * <p>The content of the Hadoop yarn-site.xml file.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("YarnConf")
    public String yarnConf;

    public static DescribeHadoopDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHadoopDataSourceResponseBody self = new DescribeHadoopDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHadoopDataSourceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeHadoopDataSourceResponseBody setDataSourceDescription(String dataSourceDescription) {
        this.dataSourceDescription = dataSourceDescription;
        return this;
    }
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    public DescribeHadoopDataSourceResponseBody setDataSourceDir(String dataSourceDir) {
        this.dataSourceDir = dataSourceDir;
        return this;
    }
    public String getDataSourceDir() {
        return this.dataSourceDir;
    }

    public DescribeHadoopDataSourceResponseBody setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DescribeHadoopDataSourceResponseBody setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public DescribeHadoopDataSourceResponseBody setDataSourceStatus(String dataSourceStatus) {
        this.dataSourceStatus = dataSourceStatus;
        return this;
    }
    public String getDataSourceStatus() {
        return this.dataSourceStatus;
    }

    public DescribeHadoopDataSourceResponseBody setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DescribeHadoopDataSourceResponseBody setEmrInstanceId(String emrInstanceId) {
        this.emrInstanceId = emrInstanceId;
        return this;
    }
    public String getEmrInstanceId() {
        return this.emrInstanceId;
    }

    public DescribeHadoopDataSourceResponseBody setHDFSConf(String HDFSConf) {
        this.HDFSConf = HDFSConf;
        return this;
    }
    public String getHDFSConf() {
        return this.HDFSConf;
    }

    public DescribeHadoopDataSourceResponseBody setHadoopCoreConf(String hadoopCoreConf) {
        this.hadoopCoreConf = hadoopCoreConf;
        return this;
    }
    public String getHadoopCoreConf() {
        return this.hadoopCoreConf;
    }

    public DescribeHadoopDataSourceResponseBody setHadoopCreateType(String hadoopCreateType) {
        this.hadoopCreateType = hadoopCreateType;
        return this;
    }
    public String getHadoopCreateType() {
        return this.hadoopCreateType;
    }

    public DescribeHadoopDataSourceResponseBody setHadoopHostsAddress(String hadoopHostsAddress) {
        this.hadoopHostsAddress = hadoopHostsAddress;
        return this;
    }
    public String getHadoopHostsAddress() {
        return this.hadoopHostsAddress;
    }

    public DescribeHadoopDataSourceResponseBody setHiveConf(String hiveConf) {
        this.hiveConf = hiveConf;
        return this;
    }
    public String getHiveConf() {
        return this.hiveConf;
    }

    public DescribeHadoopDataSourceResponseBody setMapReduceConf(String mapReduceConf) {
        this.mapReduceConf = mapReduceConf;
        return this;
    }
    public String getMapReduceConf() {
        return this.mapReduceConf;
    }

    public DescribeHadoopDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHadoopDataSourceResponseBody setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }
    public String getStatusMessage() {
        return this.statusMessage;
    }

    public DescribeHadoopDataSourceResponseBody setYarnConf(String yarnConf) {
        this.yarnConf = yarnConf;
        return this;
    }
    public String getYarnConf() {
        return this.yarnConf;
    }

}
