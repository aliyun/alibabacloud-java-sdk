// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeStageModelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StageModelInfoList")
    public java.util.List<DescribeStageModelsResponseBodyStageModelInfoList> stageModelInfoList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeStageModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStageModelsResponseBody self = new DescribeStageModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStageModelsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStageModelsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStageModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStageModelsResponseBody setStageModelInfoList(java.util.List<DescribeStageModelsResponseBodyStageModelInfoList> stageModelInfoList) {
        this.stageModelInfoList = stageModelInfoList;
        return this;
    }
    public java.util.List<DescribeStageModelsResponseBodyStageModelInfoList> getStageModelInfoList() {
        return this.stageModelInfoList;
    }

    public DescribeStageModelsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeStageModelsResponseBodyStageModelInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-08-13T01:54:03Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>Stage description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2024-12-10T00:01:09Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("StageAlias")
        public String stageAlias;

        /**
         * <strong>example:</strong>
         * <p>j3j435j23l4j23l55xxx</p>
         */
        @NameInMap("StageModelId")
        public String stageModelId;

        /**
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeStageModelsResponseBodyStageModelInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStageModelsResponseBodyStageModelInfoList self = new DescribeStageModelsResponseBodyStageModelInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeStageModelsResponseBodyStageModelInfoList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeStageModelsResponseBodyStageModelInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeStageModelsResponseBodyStageModelInfoList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeStageModelsResponseBodyStageModelInfoList setStageAlias(String stageAlias) {
            this.stageAlias = stageAlias;
            return this;
        }
        public String getStageAlias() {
            return this.stageAlias;
        }

        public DescribeStageModelsResponseBodyStageModelInfoList setStageModelId(String stageModelId) {
            this.stageModelId = stageModelId;
            return this;
        }
        public String getStageModelId() {
            return this.stageModelId;
        }

        public DescribeStageModelsResponseBodyStageModelInfoList setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeStageModelsResponseBodyStageModelInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
