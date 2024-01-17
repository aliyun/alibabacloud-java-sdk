// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeModelsForInnerResponseBody extends TeaModel {
    @NameInMap("ModelDetails")
    public DescribeModelsForInnerResponseBodyModelDetails modelDetails;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeModelsForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelsForInnerResponseBody self = new DescribeModelsForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelsForInnerResponseBody setModelDetails(DescribeModelsForInnerResponseBodyModelDetails modelDetails) {
        this.modelDetails = modelDetails;
        return this;
    }
    public DescribeModelsForInnerResponseBodyModelDetails getModelDetails() {
        return this.modelDetails;
    }

    public DescribeModelsForInnerResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeModelsForInnerResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeModelsForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelsForInnerResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeModelsForInnerResponseBodyModelDetailsModelDetail extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("ModelRef")
        public String modelRef;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Schema")
        public String schema;

        public static DescribeModelsForInnerResponseBodyModelDetailsModelDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelsForInnerResponseBodyModelDetailsModelDetail self = new DescribeModelsForInnerResponseBodyModelDetailsModelDetail();
            return TeaModel.build(map, self);
        }

        public DescribeModelsForInnerResponseBodyModelDetailsModelDetail setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeModelsForInnerResponseBodyModelDetailsModelDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeModelsForInnerResponseBodyModelDetailsModelDetail setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeModelsForInnerResponseBodyModelDetailsModelDetail setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DescribeModelsForInnerResponseBodyModelDetailsModelDetail setModelRef(String modelRef) {
            this.modelRef = modelRef;
            return this;
        }
        public String getModelRef() {
            return this.modelRef;
        }

        public DescribeModelsForInnerResponseBodyModelDetailsModelDetail setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeModelsForInnerResponseBodyModelDetailsModelDetail setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class DescribeModelsForInnerResponseBodyModelDetails extends TeaModel {
        @NameInMap("ModelDetail")
        public java.util.List<DescribeModelsForInnerResponseBodyModelDetailsModelDetail> modelDetail;

        public static DescribeModelsForInnerResponseBodyModelDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelsForInnerResponseBodyModelDetails self = new DescribeModelsForInnerResponseBodyModelDetails();
            return TeaModel.build(map, self);
        }

        public DescribeModelsForInnerResponseBodyModelDetails setModelDetail(java.util.List<DescribeModelsForInnerResponseBodyModelDetailsModelDetail> modelDetail) {
            this.modelDetail = modelDetail;
            return this;
        }
        public java.util.List<DescribeModelsForInnerResponseBodyModelDetailsModelDetail> getModelDetail() {
            return this.modelDetail;
        }

    }

}
