// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeModelsResponseBody extends TeaModel {
    @NameInMap("ModelDetails")
    public DescribeModelsResponseBodyModelDetails modelDetails;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelsResponseBody self = new DescribeModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelsResponseBody setModelDetails(DescribeModelsResponseBodyModelDetails modelDetails) {
        this.modelDetails = modelDetails;
        return this;
    }
    public DescribeModelsResponseBodyModelDetails getModelDetails() {
        return this.modelDetails;
    }

    public DescribeModelsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeModelsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeModelsResponseBodyModelDetailsModelDetail extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("ModelRef")
        public String modelRef;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Schema")
        public String schema;

        public static DescribeModelsResponseBodyModelDetailsModelDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelsResponseBodyModelDetailsModelDetail self = new DescribeModelsResponseBodyModelDetailsModelDetail();
            return TeaModel.build(map, self);
        }

        public DescribeModelsResponseBodyModelDetailsModelDetail setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeModelsResponseBodyModelDetailsModelDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeModelsResponseBodyModelDetailsModelDetail setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeModelsResponseBodyModelDetailsModelDetail setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public DescribeModelsResponseBodyModelDetailsModelDetail setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DescribeModelsResponseBodyModelDetailsModelDetail setModelRef(String modelRef) {
            this.modelRef = modelRef;
            return this;
        }
        public String getModelRef() {
            return this.modelRef;
        }

        public DescribeModelsResponseBodyModelDetailsModelDetail setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeModelsResponseBodyModelDetailsModelDetail setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class DescribeModelsResponseBodyModelDetails extends TeaModel {
        @NameInMap("ModelDetail")
        public java.util.List<DescribeModelsResponseBodyModelDetailsModelDetail> modelDetail;

        public static DescribeModelsResponseBodyModelDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelsResponseBodyModelDetails self = new DescribeModelsResponseBodyModelDetails();
            return TeaModel.build(map, self);
        }

        public DescribeModelsResponseBodyModelDetails setModelDetail(java.util.List<DescribeModelsResponseBodyModelDetailsModelDetail> modelDetail) {
            this.modelDetail = modelDetail;
            return this;
        }
        public java.util.List<DescribeModelsResponseBodyModelDetailsModelDetail> getModelDetail() {
            return this.modelDetail;
        }

    }

}
