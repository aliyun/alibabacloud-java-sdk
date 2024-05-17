// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeStreamingDataSourceResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DataSourceConfig")
    public String dataSourceConfig;

    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("DataSourceName")
    public String dataSourceName;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceId")
    public Integer serviceId;

    @NameInMap("Status")
    public String status;

    public static DescribeStreamingDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamingDataSourceResponseBody self = new DescribeStreamingDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamingDataSourceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeStreamingDataSourceResponseBody setDataSourceConfig(String dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
        return this;
    }
    public String getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    public DescribeStreamingDataSourceResponseBody setDataSourceDescription(String dataSourceDescription) {
        this.dataSourceDescription = dataSourceDescription;
        return this;
    }
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    public DescribeStreamingDataSourceResponseBody setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DescribeStreamingDataSourceResponseBody setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public DescribeStreamingDataSourceResponseBody setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DescribeStreamingDataSourceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeStreamingDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamingDataSourceResponseBody setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Integer getServiceId() {
        return this.serviceId;
    }

    public DescribeStreamingDataSourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
