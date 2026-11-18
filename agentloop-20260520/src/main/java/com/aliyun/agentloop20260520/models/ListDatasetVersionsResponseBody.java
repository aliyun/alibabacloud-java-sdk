// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListDatasetVersionsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of versions per page used for this query, which is not the actual number of versions returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. This parameter is returned when a next page exists. To query the next page, pass this value as is to nextToken. If this parameter is not returned or is empty, no next page exists. The example is for demonstration purposes only.</p>
     * 
     * <strong>example:</strong>
     * <p>umaQfI7x758Ns4TgWrj8yA3fYlnk7dJgsfhMrSViRY8=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The unique identifier of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D17DE39E-6C62-50E3-9EB7-FDE41BB0D43D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of versions of the dataset, excluding deleted versions. This value is not limited by the current page size.</p>
     * 
     * <strong>example:</strong>
     * <p>35</p>
     */
    @NameInMap("total")
    public Integer total;

    /**
     * <p>The list of historical versions of the dataset on the current page. An empty array is returned if no versions meet the conditions.</p>
     */
    @NameInMap("versions")
    public java.util.List<ListDatasetVersionsResponseBodyVersions> versions;

    public static ListDatasetVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetVersionsResponseBody self = new ListDatasetVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDatasetVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDatasetVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetVersionsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListDatasetVersionsResponseBody setVersions(java.util.List<ListDatasetVersionsResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListDatasetVersionsResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class ListDatasetVersionsResponseBodyVersions extends TeaModel {
        /**
         * <p>The creation time of the version, in RFC 3339 format, including time zone information. For example, the Z in 2026-11-11T06:00:00Z indicates UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-11T06:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description provided when the version was created. If no description was provided, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The dataset version used for the first evaluation</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the historical version, which corresponds to the name specified when the version was created. This value can be used as the version parameter for DeleteDatasetVersion.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        public static ListDatasetVersionsResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetVersionsResponseBodyVersions self = new ListDatasetVersionsResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListDatasetVersionsResponseBodyVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDatasetVersionsResponseBodyVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDatasetVersionsResponseBodyVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
