// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectsRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageToken")
    public String pageToken;

    @NameInMap("SelectBy")
    public String selectBy;

    public static ListDevopsProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectsRequest self = new ListDevopsProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectsRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListDevopsProjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDevopsProjectsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDevopsProjectsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public ListDevopsProjectsRequest setSelectBy(String selectBy) {
        this.selectBy = selectBy;
        return this;
    }
    public String getSelectBy() {
        return this.selectBy;
    }

}
