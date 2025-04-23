// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListProjectBuildsRequest extends TeaModel {
    @NameInMap("groupId")
    public String groupId;

    @NameInMap("pageNumber")
    public String pageNumber;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("projectBuildAction")
    public String projectBuildAction;

    public static ListProjectBuildsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectBuildsRequest self = new ListProjectBuildsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectBuildsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListProjectBuildsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectBuildsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListProjectBuildsRequest setProjectBuildAction(String projectBuildAction) {
        this.projectBuildAction = projectBuildAction;
        return this;
    }
    public String getProjectBuildAction() {
        return this.projectBuildAction;
    }

}
