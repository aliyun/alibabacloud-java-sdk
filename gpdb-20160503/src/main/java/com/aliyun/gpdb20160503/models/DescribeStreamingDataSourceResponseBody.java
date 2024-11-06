// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeStreamingDataSourceResponseBody extends TeaModel {
    /**
     * <p>Creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-08T16:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Data source configuration information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;brokers&quot;:&quot;broker0:9091,broker1:9091&quot;,&quot;topic&quot;:&quot;topic&quot;}</p>
     */
    @NameInMap("DataSourceConfig")
    public String dataSourceConfig;

    /**
     * <p>Data source description.</p>
     * 
     * <strong>example:</strong>
     * <p>test-kafka</p>
     */
    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    /**
     * <p>Data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>Data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-kafka</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>Data source type, values include:</p>
     * <ul>
     * <li>kafka</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>kafka</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>Service status message, for example, in case of an exception, it will show the reason for the exception. In normal Running state, this value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>External data service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceId")
    public Integer serviceId;

    /**
     * <p>Service status:</p>
     * <ul>
     * <li><p>Initializing init</p>
     * </li>
     * <li><p>Running running</p>
     * </li>
     * <li><p>Exception exception</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
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
