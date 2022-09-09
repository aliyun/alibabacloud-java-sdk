// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListGroupRequest extends TeaModel {
    @NameInMap("pageNumber")
    public String pageNumber;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("projectId")
    public String projectId;

    public static ListGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupRequest self = new ListGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListGroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
