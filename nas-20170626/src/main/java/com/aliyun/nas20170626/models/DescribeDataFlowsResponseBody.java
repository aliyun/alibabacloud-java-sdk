// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDataFlowsResponseBody extends TeaModel {
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
        @NameInMap("AutoRefresh")
        public DescribeDataFlowsResponseBodyDataFlowInfoDataFlowAutoRefresh autoRefresh;

        @NameInMap("AutoRefreshInterval")
        public Long autoRefreshInterval;

        @NameInMap("AutoRefreshPolicy")
        public String autoRefreshPolicy;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataFlowId")
        public String dataFlowId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        @NameInMap("FsetDescription")
        public String fsetDescription;

        @NameInMap("FsetId")
        public String fsetId;

        @NameInMap("SourceSecurityType")
        public String sourceSecurityType;

        @NameInMap("SourceStorage")
        public String sourceStorage;

        /**
         * <p>源端存储内的访问路径。</p>
         */
        @NameInMap("SourceStoragePath")
        public String sourceStoragePath;

        @NameInMap("Status")
        public String status;

        @NameInMap("Throughput")
        public Long throughput;

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
