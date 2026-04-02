// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDatasetsResponseBody extends TeaModel {
    @NameInMap("datasets")
    public java.util.List<ListDatasetsResponseBodyDatasets> datasets;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>d9a48d977f45aa6fcf6981ed13b885b3fab0b124c12dcbbe70edce5d81ba****************</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>96</p>
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
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>1695090077</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test_dataset</p>
         */
        @NameInMap("datasetName")
        public String datasetName;

        /**
         * <strong>example:</strong>
         * <p>test dataset</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>1695090077</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListDatasetsResponseBodyDatasets build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyDatasets self = new ListDatasetsResponseBodyDatasets();
            return TeaModel.build(map, self);
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

        public ListDatasetsResponseBodyDatasets setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
