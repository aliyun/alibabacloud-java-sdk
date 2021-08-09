// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetDomainAndUriResourcesRequest extends TeaModel {
    // 当前页码，最小值为1，最大限制为200
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 页面大小。最大限制为500
    @NameInMap("PageSize")
    public Integer pageSize;

    // 域名
    @NameInMap("Domain")
    public String domain;

    // 命名空间ID
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    public static GetDomainAndUriResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainAndUriResourcesRequest self = new GetDomainAndUriResourcesRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainAndUriResourcesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDomainAndUriResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDomainAndUriResourcesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetDomainAndUriResourcesRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

}
