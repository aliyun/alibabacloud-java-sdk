// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNamespacesResponseBody extends TeaModel {
    /**
     * <p>Return results.</p>
     */
    @NameInMap("Data")
    public ListNamespacesResponseBodyData data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D1F1A6F3-7E03-5EAD-B3F1-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesResponseBody self = new ListNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespacesResponseBody setData(ListNamespacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNamespacesResponseBodyData getData() {
        return this.data;
    }

    public ListNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNamespacesResponseBodyDataResult extends TeaModel {
        /**
         * <p>Number of applications.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AppCount")
        public Integer appCount;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-02T09:49:48.000+0000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Namespace description.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace 1 for testing</p>
         */
        @NameInMap("Describe")
        public String describe;

        /**
         * <p>Number of online nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("InstanceCount")
        public Long instanceCount;

        /**
         * <p>Namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>myNamespace</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Alibaba Cloud tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;1&quot;:&quot;1&quot;,&quot;2&quot;:&quot;2&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-02T09:49:48.000+0000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>178*******</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Version. Basic Edition 0, Professional Edition 1, Enterprise Edition 2.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static ListNamespacesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacesResponseBodyDataResult self = new ListNamespacesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListNamespacesResponseBodyDataResult setAppCount(Integer appCount) {
            this.appCount = appCount;
            return this;
        }
        public Integer getAppCount() {
            return this.appCount;
        }

        public ListNamespacesResponseBodyDataResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNamespacesResponseBodyDataResult setDescribe(String describe) {
            this.describe = describe;
            return this;
        }
        public String getDescribe() {
            return this.describe;
        }

        public ListNamespacesResponseBodyDataResult setInstanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        public ListNamespacesResponseBodyDataResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListNamespacesResponseBodyDataResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListNamespacesResponseBodyDataResult setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public ListNamespacesResponseBodyDataResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListNamespacesResponseBodyDataResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListNamespacesResponseBodyDataResult setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListNamespacesResponseBodyDataResults extends TeaModel {
        /**
         * <p>Number of applications.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AppCount")
        public Integer appCount;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-02T09:49:48.000+0000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Namespace description.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace 1 for testing</p>
         */
        @NameInMap("Describe")
        public String describe;

        /**
         * <p>Number of online nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("InstanceCount")
        public Long instanceCount;

        /**
         * <p>Namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>myNamespace</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-02T09:49:48.000+0000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>178*******</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Version. Basic Edition 0, Professional Edition 1, Enterprise Edition 2.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static ListNamespacesResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacesResponseBodyDataResults self = new ListNamespacesResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public ListNamespacesResponseBodyDataResults setAppCount(Integer appCount) {
            this.appCount = appCount;
            return this;
        }
        public Integer getAppCount() {
            return this.appCount;
        }

        public ListNamespacesResponseBodyDataResults setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNamespacesResponseBodyDataResults setDescribe(String describe) {
            this.describe = describe;
            return this;
        }
        public String getDescribe() {
            return this.describe;
        }

        public ListNamespacesResponseBodyDataResults setInstanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        public ListNamespacesResponseBodyDataResults setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListNamespacesResponseBodyDataResults setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListNamespacesResponseBodyDataResults setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListNamespacesResponseBodyDataResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListNamespacesResponseBodyDataResults setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListNamespacesResponseBodyData extends TeaModel {
        /**
         * <p>Result page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Return results.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListNamespacesResponseBodyDataResult> result;

        /**
         * <p>Result set.</p>
         */
        @NameInMap("Results")
        public java.util.List<ListNamespacesResponseBodyDataResults> results;

        /**
         * <p>Total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListNamespacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacesResponseBodyData self = new ListNamespacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNamespacesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListNamespacesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListNamespacesResponseBodyData setResult(java.util.List<ListNamespacesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListNamespacesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListNamespacesResponseBodyData setResults(java.util.List<ListNamespacesResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ListNamespacesResponseBodyDataResults> getResults() {
            return this.results;
        }

        public ListNamespacesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
