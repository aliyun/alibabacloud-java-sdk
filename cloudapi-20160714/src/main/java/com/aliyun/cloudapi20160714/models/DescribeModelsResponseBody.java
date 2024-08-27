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
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40306469-2FB5-417A-B723-AF1F4A4FA204</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>ENV</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>ST4</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>2019-01-29T11:07:48Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The description of the model definition.</p>
         * 
         * <strong>example:</strong>
         * <p>Model Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group to which the model belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>30e792398d6c4569b04c0e53a3494381</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The ID of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>766c0b9538a04bdf974953b5576783ba</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The URI of the model.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://apigateway.aliyun.com/models/30e792398d6c4569b04c0e53a3494381/766c0b9538a04bdf974953b5576783ba">https://apigateway.aliyun.com/models/30e792398d6c4569b04c0e53a3494381/766c0b9538a04bdf974953b5576783ba</a></p>
         */
        @NameInMap("ModelRef")
        public String modelRef;

        /**
         * <p>The time when the model was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-29T11:07:48Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The definition of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;object\&quot;,\&quot;properties\&quot;:{\&quot;id\&quot;:{\&quot;format\&quot;:\&quot;int64\&quot;,\&quot;maximum\&quot;:100,\&quot;exclusiveMaximum\&quot;:true,\&quot;type\&quot;:\&quot;integer\&quot;},\&quot;name\&quot;:{\&quot;maxLength\&quot;:10,\&quot;type\&quot;:\&quot;string\&quot;}}}</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The tags of the model.</p>
         */
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
