// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeModelsRequest extends TeaModel {
    /**
     * <p>The ID of the API group.</p>
     * <p>This parameter is required.</p>
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
     * <p>123</p>
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
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeModelsRequestTag> tag;

    public static DescribeModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelsRequest self = new DescribeModelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeModelsRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public DescribeModelsRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public DescribeModelsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeModelsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeModelsRequest setTag(java.util.List<DescribeModelsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeModelsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeModelsRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeModelsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelsRequestTag self = new DescribeModelsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeModelsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeModelsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
