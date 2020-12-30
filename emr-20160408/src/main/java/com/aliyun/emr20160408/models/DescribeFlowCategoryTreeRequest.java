// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowCategoryTreeRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("CategoryId")
    public String categoryId;

    public static DescribeFlowCategoryTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowCategoryTreeRequest self = new DescribeFlowCategoryTreeRequest();
        return TeaModel.build(map, self);
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

    public DescribeFlowCategoryTreeRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeFlowCategoryTreeRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeFlowCategoryTreeRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

}
