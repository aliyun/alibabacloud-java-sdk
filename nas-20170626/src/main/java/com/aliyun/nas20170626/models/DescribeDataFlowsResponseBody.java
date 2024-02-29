// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowsResponseBody extends TeaModel {
    /**
     * <p>The details about dataflows.</p>
     */
    @NameInMap("DataFlowInfo")
    public DescribeDataFlowsResponseBodyDataFlowInfo dataFlowInfo;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataFlowsResponseBody self = new DescribeDataFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataFlowsResponseBody setDataFlowInfo(DescribeDataFlowsResponseBodyDataFlowInfo dataFlowInfo) {
        this.dataFlowInfo = dataFlowInfo;
        return this;
    }
    public DescribeDataFlowsResponseBodyDataFlowInfo getDataFlowInfo() {
        return this.dataFlowInfo;
    }

    public DescribeDataFlowsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDataFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefreshAutoRefresh extends TeaModel {
        /**
         * <p>The automatic update directory. CPFS automatically checks whether the source data only in the directory is updated and imports the updated data.</p>
         * <br>
         * <p>Limits:</p>
         * <br>
         * <p>*   The directory must be 2 to 1,024 characters in length.</p>
         * <p>*   The directory must be encoded in UTF-8.</p>
         * <p>*   The directory must start and end with a forward slash (/).</p>
         * <br>
         * <p>>  The directory must be an existing directory in the CPFS file system and must be in a fileset where the dataflow is enabled.</p>
         */
        @NameInMap("RefreshPath")
        public String refreshPath;

        public static DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefreshAutoRefresh build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefreshAutoRefresh self = new DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefreshAutoRefresh();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefreshAutoRefresh setRefreshPath(String refreshPath) {
            this.refreshPath = refreshPath;
            return this;
        }
        public String getRefreshPath() {
            return this.refreshPath;
        }

    }

    public static class DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefresh extends TeaModel {
        @NameInMap("AutoRefresh")
        public java.util.List<DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefreshAutoRefresh> autoRefresh;

        public static DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefresh build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefresh self = new DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefresh();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefresh setAutoRefresh(java.util.List<DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefreshAutoRefresh> autoRefresh) {
            this.autoRefresh = autoRefresh;
            return this;
        }
        public java.util.List<DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefreshAutoRefresh> getAutoRefresh() {
            return this.autoRefresh;
        }

    }

    public static class DescribeDataFlowsResponseBodyDataFlowInfoDataFlow extends TeaModel {
        /**
         * <p>The details about automatic update policies.</p>
         */
        @NameInMap("AutoRefresh")
        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefresh autoRefresh;

        /**
         * <p>The automatic update interval. CPFS checks whether data is updated in the directory at the interval specified by this parameter. If data is updated, CPFS starts an automatic update task. Unit: minutes.</p>
         * <br>
         * <p>Valid values: 5 to 526600. Default value: 10.</p>
         */
        @NameInMap("AutoRefreshInterval")
        public Long autoRefreshInterval;

        /**
         * <p>The automatic update policy. The updated data in the source storage is imported into the CPFS file system based on the policy. Valid values:</p>
         * <br>
         * <p>*   None: Updated data in the source storage is not automatically imported to the CPFS file system. You can run a dataflow task to import the updated data from the source storage.</p>
         * <p>*   ImportChanged: Updated data in the source storage is automatically imported to the CPFS file system.</p>
         */
        @NameInMap("AutoRefreshPolicy")
        public String autoRefreshPolicy;

        /**
         * <p>The time when the fileset was created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The dataflow ID.</p>
         */
        @NameInMap("DataFlowId")
        public String dataFlowId;

        /**
         * <p>The description of the dataflow.</p>
         * <br>
         * <p>Limits:</p>
         * <br>
         * <p>*   The description must be 2 to 128 characters in length.</p>
         * <p>*   The description must start with a letter but cannot start with `http://` or `https://`.</p>
         * <p>*   The description can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error message returned. Valid values:</p>
         * <br>
         * <p>*   None (default): The dataflow status is normal.</p>
         * <p>*   SourceStorageUnreachable: The access path of the source storage is not found.</p>
         * <p>*   ThroughputTooLow: The dataflow throughput is low.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the file system.</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The directory of the fileset in the CPFS file system.</p>
         * <br>
         * <p>Limits:</p>
         * <br>
         * <p>*   The directory must be 2 to 1,024 characters in length.</p>
         * <p>*   The directory must be encoded in UTF-8.</p>
         * <p>*   The directory must start and end with a forward slash (/).</p>
         * <p>*   The directory must be a fileset directory in the CPFS file system.</p>
         */
        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        /**
         * <p>The description of the automatic update.</p>
         */
        @NameInMap("FsetDescription")
        public String fsetDescription;

        /**
         * <p>The fileset ID.</p>
         */
        @NameInMap("FsetId")
        public String fsetId;

        /**
         * <p>The type of security mechanism for the source storage. This parameter must be specified if the source storage is accessed with a security mechanism. Valid values:</p>
         * <br>
         * <p>*   None (default): The source storage can be accessed without a security mechanism.</p>
         * <p>*   SSL: The source storage must be accessed with an SSL certificate.</p>
         */
        @NameInMap("SourceSecurityType")
        public String sourceSecurityType;

        /**
         * <p>The access path of the source storage. Format:://.</p>
         * <br>
         * <p>Parameters:</p>
         * <br>
         * <p>*   storage type: Only OSS is supported.</p>
         * <br>
         * <p>*   path: the name of the OSS bucket.</p>
         * <br>
         * <p>    *   The name can contain only lowercase letters, digits, and hyphens (-). The name must start and end with a lowercase letter or digit.</p>
         * <p>    *   The name must be 8 to 128 characters in length.</p>
         * <p>    *   The name must be encoded in UTF-8.</p>
         * <p>    *   The name cannot start with http:// or https://.</p>
         * <br>
         * <p>>  The OSS bucket must be an existing bucket in the region.</p>
         */
        @NameInMap("SourceStorage")
        public String sourceStorage;

        /**
         * <p>源端存储内的访问路径。</p>
         */
        @NameInMap("SourceStoragePath")
        public String sourceStoragePath;

        /**
         * <p>The dataflow status. Valid values:</p>
         * <br>
         * <p>*   Starting: The dataflow is being created or enabled.</p>
         * <p>*   Running: The dataflow has been created and is running properly.</p>
         * <p>*   Updating: The dataflow is being modified. For example, the dataflow throughput is increased and the automatic update interval is modified.</p>
         * <p>*   Deleting: The dataflow is being deleted.</p>
         * <p>*   Stopping: The dataflow is being disabled.</p>
         * <p>*   Stopped: The dataflow has been disabled.</p>
         * <p>*   Misconfigured: The dataflow configuration is abnormal. For example, the source storage is inaccessible, and the automatic update cannot be completed due to low dataflow throughput.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The maximum dataflow throughput. Unit: MB/s. Valid values:</p>
         * <br>
         * <p>*   600</p>
         * <p>*   1,200</p>
         * <p>*   1,500</p>
         * <br>
         * <p>>  The dataflow throughput must be less than the I/O throughput of the file system.</p>
         */
        @NameInMap("Throughput")
        public Long throughput;

        /**
         * <p>The time when the fileset was last updated.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeDataFlowsResponseBodyDataFlowInfoDataFlow build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowsResponseBodyDataFlowInfoDataFlow self = new DescribeDataFlowsResponseBodyDataFlowInfoDataFlow();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setAutoRefresh(DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefresh autoRefresh) {
            this.autoRefresh = autoRefresh;
            return this;
        }
        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefresh getAutoRefresh() {
            return this.autoRefresh;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setAutoRefreshInterval(Long autoRefreshInterval) {
            this.autoRefreshInterval = autoRefreshInterval;
            return this;
        }
        public Long getAutoRefreshInterval() {
            return this.autoRefreshInterval;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setAutoRefreshPolicy(String autoRefreshPolicy) {
            this.autoRefreshPolicy = autoRefreshPolicy;
            return this;
        }
        public String getAutoRefreshPolicy() {
            return this.autoRefreshPolicy;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setDataFlowId(String dataFlowId) {
            this.dataFlowId = dataFlowId;
            return this;
        }
        public String getDataFlowId() {
            return this.dataFlowId;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setFileSystemPath(String fileSystemPath) {
            this.fileSystemPath = fileSystemPath;
            return this;
        }
        public String getFileSystemPath() {
            return this.fileSystemPath;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setFsetDescription(String fsetDescription) {
            this.fsetDescription = fsetDescription;
            return this;
        }
        public String getFsetDescription() {
            return this.fsetDescription;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setFsetId(String fsetId) {
            this.fsetId = fsetId;
            return this;
        }
        public String getFsetId() {
            return this.fsetId;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setSourceSecurityType(String sourceSecurityType) {
            this.sourceSecurityType = sourceSecurityType;
            return this;
        }
        public String getSourceSecurityType() {
            return this.sourceSecurityType;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setSourceStorage(String sourceStorage) {
            this.sourceStorage = sourceStorage;
            return this;
        }
        public String getSourceStorage() {
            return this.sourceStorage;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setSourceStoragePath(String sourceStoragePath) {
            this.sourceStoragePath = sourceStoragePath;
            return this;
        }
        public String getSourceStoragePath() {
            return this.sourceStoragePath;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setThroughput(Long throughput) {
            this.throughput = throughput;
            return this;
        }
        public Long getThroughput() {
            return this.throughput;
        }

        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlow setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeDataFlowsResponseBodyDataFlowInfo extends TeaModel {
        @NameInMap("DataFlow")
        public java.util.List<DescribeDataFlowsResponseBodyDataFlowInfoDataFlow> dataFlow;

        public static DescribeDataFlowsResponseBodyDataFlowInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataFlowsResponseBodyDataFlowInfo self = new DescribeDataFlowsResponseBodyDataFlowInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDataFlowsResponseBodyDataFlowInfo setDataFlow(java.util.List<DescribeDataFlowsResponseBodyDataFlowInfoDataFlow> dataFlow) {
            this.dataFlow = dataFlow;
            return this;
        }
        public java.util.List<DescribeDataFlowsResponseBodyDataFlowInfoDataFlow> getDataFlow() {
            return this.dataFlow;
        }

    }

}
