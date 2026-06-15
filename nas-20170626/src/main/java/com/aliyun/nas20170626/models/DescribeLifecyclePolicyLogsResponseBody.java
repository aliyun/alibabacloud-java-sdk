// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLifecyclePolicyLogsResponseBody extends TeaModel {
    /**
     * <p>The execution logs of the lifecycle policy.</p>
     */
    @NameInMap("LifecyclePolicyLogs")
    public java.util.List<DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs> lifecyclePolicyLogs;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the request succeeded.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request succeeded.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of logs.</p>
     * 
     * <strong>example:</strong>
     * <p>36</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLifecyclePolicyLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecyclePolicyLogsResponseBody self = new DescribeLifecyclePolicyLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLifecyclePolicyLogsResponseBody setLifecyclePolicyLogs(java.util.List<DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs> lifecyclePolicyLogs) {
        this.lifecyclePolicyLogs = lifecyclePolicyLogs;
        return this;
    }
    public java.util.List<DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs> getLifecyclePolicyLogs() {
        return this.lifecyclePolicyLogs;
    }

    public DescribeLifecyclePolicyLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLifecyclePolicyLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLifecyclePolicyLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLifecyclePolicyLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeLifecyclePolicyLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsRetrieveRules extends TeaModel {
        /**
         * <p>The attribute of the rule. Valid value:</p>
         * <ul>
         * <li><code>RetrieveType</code>: The retrieval method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RetrieveType</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The threshold of the rule. Valid values:</p>
         * <ul>
         * <li><p>If <code>Attribute</code> is set to <code>RetrieveType</code>:</p>
         * <ul>
         * <li><p><code>AfterVisit</code>: Data is retrieved on a best-effort basis when accessed. This value is available only if <code>LifecyclePolicyType</code> is set to <code>Auto</code>.</p>
         * </li>
         * <li><p><code>All</code>: All data is retrieved. This value is available only if <code>LifecyclePolicyType</code> is set to <code>OnDemand</code>.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        public static DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsRetrieveRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsRetrieveRules self = new DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsRetrieveRules();
            return TeaModel.build(map, self);
        }

        public DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsRetrieveRules setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsRetrieveRules setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsTransitRules extends TeaModel {
        /**
         * <p>The attribute of the rule.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li><code>Atime</code>: The last access time of a file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Atime</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The rule threshold.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>If <code>Attribute</code> is set to <code>Atime</code>, this parameter specifies the number of days since a file was last accessed. The value must be an integer from 1 to 365.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        public static DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsTransitRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsTransitRules self = new DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsTransitRules();
            return TeaModel.build(map, self);
        }

        public DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsTransitRules setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsTransitRules setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs extends TeaModel {
        /**
         * <p>The time when the task was created. The time is displayed in UTC and is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-20T02:25:07Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The execution paths of the task.</p>
         */
        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <p>The retrieval rules for file data.</p>
         */
        @NameInMap("RetrieveRules")
        public java.util.List<DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsRetrieveRules> retrieveRules;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><p><code>PENDING</code>: The task is initializing.</p>
         * </li>
         * <li><p><code>RUNNING</code>: The task is running.</p>
         * </li>
         * <li><p><code>STOPPED</code>: The task is stopped.</p>
         * </li>
         * <li><p><code>FINISHED</code>: The task is complete.</p>
         * </li>
         * <li><p><code>FAILED</code>: The task failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage tier. Valid values:</p>
         * <ul>
         * <li><p><code>InfrequentAccess</code>: Infrequent Access (default).</p>
         * </li>
         * <li><p><code>Archive</code>: Archive Storage.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InfrequentAccess</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The task summary.</p>
         * 
         * <strong>example:</strong>
         * <p>Total tasks: 100000, success tasks: 100000</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The transition rules for file data.</p>
         */
        @NameInMap("TransitRules")
        public java.util.List<DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsTransitRules> transitRules;

        public static DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs self = new DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs();
            return TeaModel.build(map, self);
        }

        public DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs setRetrieveRules(java.util.List<DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsRetrieveRules> retrieveRules) {
            this.retrieveRules = retrieveRules;
            return this;
        }
        public java.util.List<DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsRetrieveRules> getRetrieveRules() {
            return this.retrieveRules;
        }

        public DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogs setTransitRules(java.util.List<DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsTransitRules> transitRules) {
            this.transitRules = transitRules;
            return this;
        }
        public java.util.List<DescribeLifecyclePolicyLogsResponseBodyLifecyclePolicyLogsTransitRules> getTransitRules() {
            return this.transitRules;
        }

    }

}
