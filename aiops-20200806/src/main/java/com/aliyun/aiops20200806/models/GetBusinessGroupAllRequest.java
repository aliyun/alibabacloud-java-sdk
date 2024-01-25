// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupAllRequest extends TeaModel {
    @NameInMap("BusinessGroupName")
    public String businessGroupName;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Status")
    public Long status;

    public static GetBusinessGroupAllRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupAllRequest self = new GetBusinessGroupAllRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupAllRequest setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
        return this;
    }
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    public GetBusinessGroupAllRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public GetBusinessGroupAllRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetBusinessGroupAllRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetBusinessGroupAllRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
