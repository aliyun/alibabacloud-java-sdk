// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeModelsResponseBody extends TeaModel {
    /**
     * <p>The returned information about models. It is an array consisting of ModelDetail data.</p>
     */
    @NameInMap("ModelDetails")
    public DescribeModelsResponseBodyModelDetails modelDetails;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
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

    public static class DescribeModelsResponseBodyModelDetailsModelDetailTagsTagInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeModelsResponseBodyModelDetailsModelDetailTagsTagInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelsResponseBodyModelDetailsModelDetailTagsTagInfo self = new DescribeModelsResponseBodyModelDetailsModelDetailTagsTagInfo();
            return TeaModel.build(map, self);
        }

        public DescribeModelsResponseBodyModelDetailsModelDetailTagsTagInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeModelsResponseBodyModelDetailsModelDetailTagsTagInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeModelsResponseBodyModelDetailsModelDetailTags extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.List<DescribeModelsResponseBodyModelDetailsModelDetailTagsTagInfo> tagInfo;

        public static DescribeModelsResponseBodyModelDetailsModelDetailTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelsResponseBodyModelDetailsModelDetailTags self = new DescribeModelsResponseBodyModelDetailsModelDetailTags();
            return TeaModel.build(map, self);
        }

        public DescribeModelsResponseBodyModelDetailsModelDetailTags setTagInfo(java.util.List<DescribeModelsResponseBodyModelDetailsModelDetailTagsTagInfo> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.List<DescribeModelsResponseBodyModelDetailsModelDetailTagsTagInfo> getTagInfo() {
            return this.tagInfo;
        }

    }

    public static class DescribeModelsResponseBodyModelDetailsModelDetail extends TeaModel {
        /**
         * <p>The time when the model was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The definition of the model description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group to which the model belongs.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The ID of the model.</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The name of the model.</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The URI of the model.</p>
         */
        @NameInMap("ModelRef")
        public String modelRef;

        /**
         * <p>The last modification time of the model.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The definition of the model.</p>
         */
        @NameInMap("Schema")
        public String schema;

        @NameInMap("Tags")
        public DescribeModelsResponseBodyModelDetailsModelDetailTags tags;

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

        public DescribeModelsResponseBodyModelDetailsModelDetail setTags(DescribeModelsResponseBodyModelDetailsModelDetailTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeModelsResponseBodyModelDetailsModelDetailTags getTags() {
            return this.tags;
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
