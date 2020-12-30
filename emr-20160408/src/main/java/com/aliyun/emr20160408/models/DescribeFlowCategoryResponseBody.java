// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowCategoryResponseBody extends TeaModel {
    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("Type")
    public String type;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("CategoryType")
    public String categoryType;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    public static DescribeFlowCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowCategoryResponseBody self = new DescribeFlowCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowCategoryResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeFlowCategoryResponseBody setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public DescribeFlowCategoryResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeFlowCategoryResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeFlowCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowCategoryResponseBody setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public DescribeFlowCategoryResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeFlowCategoryResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DescribeFlowCategoryResponseBody setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public DescribeFlowCategoryResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFlowCategoryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
