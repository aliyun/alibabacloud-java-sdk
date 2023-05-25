// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeModelsRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 10.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the model.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

}
