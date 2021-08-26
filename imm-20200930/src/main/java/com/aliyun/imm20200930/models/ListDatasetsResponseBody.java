// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListDatasetsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextToken")
    public String nextToken;

    // Responses
    @NameInMap("Datasets")
    public java.util.List<ListDatasetsResponseBodyDatasets> datasets;

    public static ListDatasetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsResponseBody self = new ListDatasetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDatasetsResponseBody setDatasets(java.util.List<ListDatasetsResponseBodyDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<ListDatasetsResponseBodyDatasets> getDatasets() {
        return this.datasets;
    }

    public static class ListDatasetsResponseBodyDatasets extends TeaModel {
        // ProjectName
        @NameInMap("ProjectName")
        public String projectName;

        // DatasetName
        @NameInMap("DatasetName")
        public String datasetName;

        @NameInMap("Workflow")
        public String workflow;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DatasetMaxOSSBindCount")
        public Long datasetMaxOSSBindCount;

        @NameInMap("DatasetMaxFileCount")
        public Long datasetMaxFileCount;

        @NameInMap("DatasetMaxEntityCount")
        public Long datasetMaxEntityCount;

        @NameInMap("DatasetMaxRelationCount")
        public Long datasetMaxRelationCount;

        @NameInMap("DatasetMaxTotalFileSize")
        public Long datasetMaxTotalFileSize;

        @NameInMap("BindCount")
        public Long bindCount;

        public static ListDatasetsResponseBodyDatasets build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyDatasets self = new ListDatasetsResponseBodyDatasets();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyDatasets setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDatasetsResponseBodyDatasets setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public ListDatasetsResponseBodyDatasets setWorkflow(String workflow) {
            this.workflow = workflow;
            return this;
        }
        public String getWorkflow() {
            return this.workflow;
        }

        public ListDatasetsResponseBodyDatasets setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDatasetsResponseBodyDatasets setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListDatasetsResponseBodyDatasets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDatasetsResponseBodyDatasets setDatasetMaxOSSBindCount(Long datasetMaxOSSBindCount) {
            this.datasetMaxOSSBindCount = datasetMaxOSSBindCount;
            return this;
        }
        public Long getDatasetMaxOSSBindCount() {
            return this.datasetMaxOSSBindCount;
        }

        public ListDatasetsResponseBodyDatasets setDatasetMaxFileCount(Long datasetMaxFileCount) {
            this.datasetMaxFileCount = datasetMaxFileCount;
            return this;
        }
        public Long getDatasetMaxFileCount() {
            return this.datasetMaxFileCount;
        }

        public ListDatasetsResponseBodyDatasets setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
            this.datasetMaxEntityCount = datasetMaxEntityCount;
            return this;
        }
        public Long getDatasetMaxEntityCount() {
            return this.datasetMaxEntityCount;
        }

        public ListDatasetsResponseBodyDatasets setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
            this.datasetMaxRelationCount = datasetMaxRelationCount;
            return this;
        }
        public Long getDatasetMaxRelationCount() {
            return this.datasetMaxRelationCount;
        }

        public ListDatasetsResponseBodyDatasets setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
            this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
            return this;
        }
        public Long getDatasetMaxTotalFileSize() {
            return this.datasetMaxTotalFileSize;
        }

        public ListDatasetsResponseBodyDatasets setBindCount(Long bindCount) {
            this.bindCount = bindCount;
            return this;
        }
        public Long getBindCount() {
            return this.bindCount;
        }

    }

}
