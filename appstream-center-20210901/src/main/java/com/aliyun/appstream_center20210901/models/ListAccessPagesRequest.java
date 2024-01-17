// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAccessPagesRequest extends TeaModel {
    @NameInMap("AccessPageId")
    public String accessPageId;

    @NameInMap("AccessPageName")
    public String accessPageName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SortType")
    public String sortType;

    public static ListAccessPagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessPagesRequest self = new ListAccessPagesRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessPagesRequest setAccessPageId(String accessPageId) {
        this.accessPageId = accessPageId;
        return this;
    }
    public String getAccessPageId() {
        return this.accessPageId;
    }

    public ListAccessPagesRequest setAccessPageName(String accessPageName) {
        this.accessPageName = accessPageName;
        return this;
    }
    public String getAccessPageName() {
        return this.accessPageName;
    }

    public ListAccessPagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccessPagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccessPagesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListAccessPagesRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

}
