// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHadoopDataSourceResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    @NameInMap("DataSourceDir")
    public String dataSourceDir;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("DataSourceName")
    public String dataSourceName;

    @NameInMap("DataSourceStatus")
    public String dataSourceStatus;

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

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusMessage")
    public String statusMessage;

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
