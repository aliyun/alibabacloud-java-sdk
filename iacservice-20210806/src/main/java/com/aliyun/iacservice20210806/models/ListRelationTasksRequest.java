// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRelationTasksRequest extends TeaModel {
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("moduleId")
    public String moduleId;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("projectId")
    public String projectId;

    public static ListRelationTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRelationTasksRequest self = new ListRelationTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListRelationTasksRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListRelationTasksRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListRelationTasksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRelationTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRelationTasksRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
