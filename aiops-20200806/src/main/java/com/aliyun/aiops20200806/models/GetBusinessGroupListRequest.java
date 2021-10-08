// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupListRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetBusinessGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupListRequest self = new GetBusinessGroupListRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupListRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetBusinessGroupListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetBusinessGroupListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetBusinessGroupListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
