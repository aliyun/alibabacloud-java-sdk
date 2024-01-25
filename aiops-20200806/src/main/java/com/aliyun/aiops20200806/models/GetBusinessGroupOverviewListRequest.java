// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupOverviewListRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetBusinessGroupOverviewListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupOverviewListRequest self = new GetBusinessGroupOverviewListRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupOverviewListRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetBusinessGroupOverviewListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetBusinessGroupOverviewListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetBusinessGroupOverviewListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
