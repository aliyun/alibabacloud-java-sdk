// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeDataSourcesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data sources.</p>
     */
    @NameInMap("DataSources")
    public java.util.List<DescribeDataSourcesResponseBodyDataSources> dataSources;

    /**
     * <p>The response message. The value is &quot;successful&quot; if the request was successful, or an error message if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36A5CD24-<strong><strong>-</strong></strong>-****-5F30C3F1753F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned data sources.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourcesResponseBody self = new DescribeDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDataSourcesResponseBody setDataSources(java.util.List<DescribeDataSourcesResponseBodyDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<DescribeDataSourcesResponseBodyDataSources> getDataSources() {
        return this.dataSources;
    }

    public DescribeDataSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDataSourcesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataSourcesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDataSourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataSourcesResponseBodyDataSources extends TeaModel {
        /**
         * <p>The client group ID used to access the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-0003jyv******fsku5m</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The connection information of the data source, which describes how to access the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;dataServerAddresses&quot;: [
         *         {
         *             &quot;host&quot;: &quot;123.123.123.123&quot;,
         *             &quot;port&quot;: &quot;8080&quot;
         *         }
         *     ],
         *     &quot;sharePath&quot;: &quot;/share&quot;,
         *     &quot;mountOptions&quot;: &quot;vers=3&quot;,
         *     &quot;fileSystemType&quot;: &quot;nfs&quot;
         * }</p>
         */
        @NameInMap("ConnectionInfo")
        public String connectionInfo;

        /**
         * <p>The time when the data source was created. UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1770257653</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-000******2nqeo</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>COMMON_NAS</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>COMMON_NAS</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>The paths excluded from analysis. Archiving feature only.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       &quot;/home/alice/log&quot;
         * ]</p>
         */
        @NameInMap("Exclude")
        public String exclude;

        /**
         * <p>The paths included in the analysis. Archiving feature only.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       &quot;/home/alice&quot;,
         *       &quot;/home/bob&quot;
         * ]</p>
         */
        @NameInMap("Include")
        public String include;

        /**
         * <p>Whether the index is available. Archiving feature only.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndexAvailable")
        public Boolean indexAvailable;

        /**
         * <p>The index level. Valid values:</p>
         * <ul>
         * <li><p>OFF: No index is created.</p>
         * </li>
         * <li><p>META: A metadata index is created.</p>
         * </li>
         * <li><p>ALL: A full-text index is created. This value is deprecated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>META</p>
         */
        @NameInMap("IndexLevel")
        public String indexLevel;

        /**
         * <p>The time when the index was last updated. UNIX timestamp in seconds. Archiving feature only.</p>
         * 
         * <strong>example:</strong>
         * <p>1745454604</p>
         */
        @NameInMap("IndexUpdateTime")
        public Boolean indexUpdateTime;

        /**
         * <p>Whether an index is being built. Archiving feature only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Indexing")
        public Boolean indexing;

        /**
         * <p>The analysis options. Archiving feature only.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The analysis paths. Archiving feature only.</p>
         */
        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <p>The analysis plan ID. Archiving feature only.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-123***7890</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The analysis schedule. Archiving feature only. Format: <code>I|{startTime}|{interval}</code>. <code>{startTime}</code> is the start time as a UNIX timestamp in seconds. <code>{interval}</code> is the execution interval in ISO 8601 format. Example: PT1H for one hour, P1D for one day.</p>
         * 
         * <strong>example:</strong>
         * <p>I|1729493847|P1D</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>The rate limit configuration. Archiving feature only.</p>
         * 
         * <strong>example:</strong>
         * <p>6:21:10240</p>
         */
        @NameInMap("SpeedLimit")
        public String speedLimit;

        /**
         * <p>The time when the data source was last updated. UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1745454604</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static DescribeDataSourcesResponseBodyDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourcesResponseBodyDataSources self = new DescribeDataSourcesResponseBodyDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourcesResponseBodyDataSources setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeDataSourcesResponseBodyDataSources setConnectionInfo(String connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        public DescribeDataSourcesResponseBodyDataSources setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDataSourcesResponseBodyDataSources setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public DescribeDataSourcesResponseBodyDataSources setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public DescribeDataSourcesResponseBodyDataSources setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public DescribeDataSourcesResponseBodyDataSources setExclude(String exclude) {
            this.exclude = exclude;
            return this;
        }
        public String getExclude() {
            return this.exclude;
        }

        public DescribeDataSourcesResponseBodyDataSources setInclude(String include) {
            this.include = include;
            return this;
        }
        public String getInclude() {
            return this.include;
        }

        public DescribeDataSourcesResponseBodyDataSources setIndexAvailable(Boolean indexAvailable) {
            this.indexAvailable = indexAvailable;
            return this;
        }
        public Boolean getIndexAvailable() {
            return this.indexAvailable;
        }

        public DescribeDataSourcesResponseBodyDataSources setIndexLevel(String indexLevel) {
            this.indexLevel = indexLevel;
            return this;
        }
        public String getIndexLevel() {
            return this.indexLevel;
        }

        public DescribeDataSourcesResponseBodyDataSources setIndexUpdateTime(Boolean indexUpdateTime) {
            this.indexUpdateTime = indexUpdateTime;
            return this;
        }
        public Boolean getIndexUpdateTime() {
            return this.indexUpdateTime;
        }

        public DescribeDataSourcesResponseBodyDataSources setIndexing(Boolean indexing) {
            this.indexing = indexing;
            return this;
        }
        public Boolean getIndexing() {
            return this.indexing;
        }

        public DescribeDataSourcesResponseBodyDataSources setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public DescribeDataSourcesResponseBodyDataSources setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public DescribeDataSourcesResponseBodyDataSources setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public DescribeDataSourcesResponseBodyDataSources setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

        public DescribeDataSourcesResponseBodyDataSources setSpeedLimit(String speedLimit) {
            this.speedLimit = speedLimit;
            return this;
        }
        public String getSpeedLimit() {
            return this.speedLimit;
        }

        public DescribeDataSourcesResponseBodyDataSources setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
