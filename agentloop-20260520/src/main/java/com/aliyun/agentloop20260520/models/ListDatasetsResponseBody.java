// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListDatasetsResponseBody extends TeaModel {
    /**
     * <p>The result set.</p>
     */
    @NameInMap("datasets")
    public java.util.List<ListDatasetsResponseBodyDatasets> datasets;

    /**
     * <p>The maximum number of results specified in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page of results.</p>
     * <p>If the total number of results exceeds the maxResults limit, the results are truncated. You can use this token to query the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>umaQfI7x758Ns4TgWrj8yA3fYlnk7dJgsfhMrSViRY8=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90F52F93-8800-5A71-8737-18F34BA90166</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListDatasetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsResponseBody self = new ListDatasetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetsResponseBody setDatasets(java.util.List<ListDatasetsResponseBodyDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<ListDatasetsResponseBodyDatasets> getDatasets() {
        return this.datasets;
    }

    public ListDatasetsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDatasetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDatasetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListDatasetsResponseBodyDatasets extends TeaModel {
        /**
         * <p>The name of the agent space.</p>
         * 
         * <strong>example:</strong>
         * <p>sop-agent</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>The time when the dataset was created.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-19T02:11:02Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>product_faq_dataset</p>
         */
        @NameInMap("datasetName")
        public String datasetName;

        /**
         * <p>The description of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>Product FAQ dataset for semantic search</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The time when the dataset was last updated.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-18T02:21:32Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListDatasetsResponseBodyDatasets build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyDatasets self = new ListDatasetsResponseBodyDatasets();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyDatasets setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public ListDatasetsResponseBodyDatasets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDatasetsResponseBodyDatasets setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public ListDatasetsResponseBodyDatasets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDatasetsResponseBodyDatasets setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDatasetsResponseBodyDatasets setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
