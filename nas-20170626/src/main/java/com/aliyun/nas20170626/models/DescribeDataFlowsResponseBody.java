// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowsResponseBody extends TeaModel {
    /**
     * <p>The dataflow details.</p>
     */
    @NameInMap("DataFlowInfo")
    public DescribeDataFlowsResponseBodyDataFlowInfo dataFlowInfo;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
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
         * <p>Limits:</p>
         * <ul>
         * <li>The directory must be 2 to 1,024 characters in length.</li>
         * <li>The directory must be encoded in UTF-8.</li>
         * <li>The directory must start and end with a forward slash (/).</li>
         * </ul>
         * <blockquote>
         * <p> The directory must be an existing directory in the CPFS file system and must be in a fileset where the dataflow is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/prefix1/prefix2/</p>
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
         * <blockquote>
         * <p> Only CPFS supports this parameter.</p>
         * </blockquote>
         */
        @NameInMap("AutoRefresh")
        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefresh autoRefresh;

        /**
         * <p>The automatic update interval. CPFS checks whether data is updated in the directory at the interval specified by this parameter. If data is updated, CPFS starts an automatic update task. Unit: minutes.</p>
         * <p>Valid values: 5 to 526600. Default value: 10.</p>
         * <blockquote>
         * <p> Only CPFS supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AutoRefreshInterval")
        public Long autoRefreshInterval;

        /**
         * <p>The automatic update policy. The updated data in the source storage is imported into the CPFS file system based on the policy. The following information is displayed:</p>
         * <ul>
         * <li>None: Updated data in the source storage is not automatically imported into the CPFS file system. You can run a dataflow task to import the updated data from the source storage.</li>
         * <li>ImportChanged: Updated data in the source storage is automatically imported into the CPFS file system.</li>
         * </ul>
         * <blockquote>
         * <p> Only CPFS is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("AutoRefreshPolicy")
        public String autoRefreshPolicy;

        /**
         * <p>The time when the fileset was created.</p>
         * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * <blockquote>
         * <p> Only CPFS supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-09-30T10:08:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the dataflow.</p>
         * 
         * <strong>example:</strong>
         * <p>df-194433a5be31****</p>
         */
        @NameInMap("DataFlowId")
        public String dataFlowId;

        /**
         * <p>The description of the dataflow.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length and</li>
         * <li>start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The name can contain digits, letters, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error message. Valid values:</p>
         * <ul>
         * <li>None (default): The dataflow status is normal.</li>
         * <li>SourceStorageUnreachable: The access path of the source storage is not found.</li>
         * <li>ThroughputTooLow: The dataflow throughput is low.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SourceStorageUnreachable</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-099394bd928c****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The directory of the fileset in the CPFS file system.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The directory must be 2 to 1024 characters in length.</li>
         * <li>The directory must be encoded in UTF-8.</li>
         * <li>The directory must start and end with a forward slash (/).</li>
         * <li>The directory must be a fileset directory in the CPFS file system.</li>
         * </ul>
         * <blockquote>
         * <p> Only CPFS is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/a/b/c/</p>
         */
        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        /**
         * <p>The description of the automatic update.</p>
         * <blockquote>
         * <p> Only CPFS supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FsetTest</p>
         */
        @NameInMap("FsetDescription")
        public String fsetDescription;

        /**
         * <p>The fileset ID.</p>
         * <blockquote>
         * <p> Only CPFS supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fset-1902718ea0ae****</p>
         */
        @NameInMap("FsetId")
        public String fsetId;

        /**
         * <p>The type of security mechanism for the source storage. This parameter must be specified if the source storage is accessed with a security mechanism. Valid value:</p>
         * <ul>
         * <li>Null (default): The OSS bucket can be accessed without a security mechanism.</li>
         * <li>SSL: The source storage must be accessed with an SSL certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SSL</p>
         */
        @NameInMap("SourceSecurityType")
        public String sourceSecurityType;

        /**
         * <p>The access path of the source storage. Format: <code>&lt;storage type&gt;://[&lt;account id&gt;:]&lt;path&gt;</code>.</p>
         * <p>Among them:</p>
         * <ul>
         * <li><p>storage type: Only OSS is supported.</p>
         * </li>
         * <li><p>account id: The UID of the account of the source storage.</p>
         * </li>
         * <li><p>path: The name of the OSS bucket.</p>
         * <ul>
         * <li>The name can contain only lowercase letters, digits, and hyphens (-). The name must start and end with a lowercase letter or digit.</li>
         * <li>The name must be 8 to 128 characters in length.</li>
         * <li>Must be encoded in UTF-8.</li>
         * <li>The name cannot start with http:// or https://.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The OSS bucket must be an existing bucket in the region.</p>
         * </li>
         * <li><p>Only CPFS for Lingjun V2.6.0 and later support the account id parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket1</p>
         */
        @NameInMap("SourceStorage")
        public String sourceStorage;

        /**
         * <p>The access path in the bucket of the source storage.</p>
         * <blockquote>
         * <p> Only CPFS for Lingjun supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/prefix/</p>
         */
        @NameInMap("SourceStoragePath")
        public String sourceStoragePath;

        /**
         * <p>The dataflow status. The following information is displayed:</p>
         * <ul>
         * <li>Starting: The dataflow is being created or enabled.</li>
         * <li>Running: The dataflow has been created and is running properly.</li>
         * <li>Updating: The dataflow is being modified. For example, the dataflow throughput is increased and the automatic update interval is modified.</li>
         * <li>Deleting: The dataflow is being deleted.</li>
         * <li>Stopping: The dataflow is being disabled.</li>
         * <li>Stopped: The dataflow has been disabled.</li>
         * <li>Misconfigured: The dataflow configuration is abnormal. For example, the source storage is inaccessible, and the automatic update cannot be completed due to low dataflow throughput.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The maximum dataflow throughput. Unit: MB/s. Valid value:</p>
         * <ul>
         * <li>600</li>
         * <li>1200</li>
         * <li>1500</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The dataflow throughput must be less than the I/O throughput of the file system.</p>
         * </li>
         * <li><p>Only CPFS supports this parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("Throughput")
        public Long throughput;

        /**
         * <p>The time when the fileset was last updated.</p>
         * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * <blockquote>
         * <p> Only CPFS supports this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-09-30T10:08:08Z</p>
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
