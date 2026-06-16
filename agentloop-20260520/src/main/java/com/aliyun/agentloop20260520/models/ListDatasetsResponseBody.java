// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListDatasetsResponseBody extends TeaModel {
    @NameInMap("datasets")
    public java.util.List<ListDatasetsResponseBodyDatasets> datasets;

    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("datasetName")
        public String datasetName;

        @NameInMap("description")
        public String description;

        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
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
