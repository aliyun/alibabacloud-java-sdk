// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCloudResourceRequest extends TeaModel {
    @NameInMap("CloudTypeName")
    public String cloudTypeName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public Integer status;

    public static GetCloudResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudResourceRequest self = new GetCloudResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudResourceRequest setCloudTypeName(String cloudTypeName) {
        this.cloudTypeName = cloudTypeName;
        return this;
    }
    public String getCloudTypeName() {
        return this.cloudTypeName;
    }

    public GetCloudResourceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetCloudResourceRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetCloudResourceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCloudResourceRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
