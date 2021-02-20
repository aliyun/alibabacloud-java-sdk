// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgHostsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Search")
    public String search;

    @NameInMap("OrgId")
    public Integer orgId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListOrgHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrgHostsRequest self = new ListOrgHostsRequest();
        return TeaModel.build(map, self);
    }

    public ListOrgHostsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ListOrgHostsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListOrgHostsRequest setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

    public ListOrgHostsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOrgHostsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
