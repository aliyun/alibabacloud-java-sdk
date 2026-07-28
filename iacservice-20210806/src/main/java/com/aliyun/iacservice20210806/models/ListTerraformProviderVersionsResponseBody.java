// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTerraformProviderVersionsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records retrieved in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>rnD7wyAII+yDi0UGlV519J4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>73588ebb-9d40-4660-a59f-764636ae6034</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    /**
     * <p>The list of versions.</p>
     */
    @NameInMap("versions")
    public java.util.List<ListTerraformProviderVersionsResponseBodyVersions> versions;

    public static ListTerraformProviderVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTerraformProviderVersionsResponseBody self = new ListTerraformProviderVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTerraformProviderVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTerraformProviderVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTerraformProviderVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTerraformProviderVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTerraformProviderVersionsResponseBody setVersions(java.util.List<ListTerraformProviderVersionsResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListTerraformProviderVersionsResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class ListTerraformProviderVersionsResponseBodyVersions extends TeaModel {
        /**
         * <p>The publish time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-24T05:06:51Z</p>
         */
        @NameInMap("publishedTime")
        public String publishedTime;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.242.0</p>
         */
        @NameInMap("version")
        public String version;

        public static ListTerraformProviderVersionsResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListTerraformProviderVersionsResponseBodyVersions self = new ListTerraformProviderVersionsResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListTerraformProviderVersionsResponseBodyVersions setPublishedTime(String publishedTime) {
            this.publishedTime = publishedTime;
            return this;
        }
        public String getPublishedTime() {
            return this.publishedTime;
        }

        public ListTerraformProviderVersionsResponseBodyVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTerraformProviderVersionsResponseBodyVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
