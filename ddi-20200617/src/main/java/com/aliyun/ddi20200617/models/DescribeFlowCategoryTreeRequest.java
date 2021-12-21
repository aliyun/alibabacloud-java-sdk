// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowCategoryTreeRequest extends TeaModel {
    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    public static DescribeFlowCategoryTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowCategoryTreeRequest self = new DescribeFlowCategoryTreeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowCategoryTreeRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DescribeFlowCategoryTreeRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeFlowCategoryTreeRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeFlowCategoryTreeRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeFlowCategoryTreeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFlowCategoryTreeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
