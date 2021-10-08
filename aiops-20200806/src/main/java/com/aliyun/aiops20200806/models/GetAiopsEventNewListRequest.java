// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAiopsEventNewListRequest extends TeaModel {
    @NameInMap("Uid")
    public Long uid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetAiopsEventNewListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiopsEventNewListRequest self = new GetAiopsEventNewListRequest();
        return TeaModel.build(map, self);
    }

    public GetAiopsEventNewListRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public GetAiopsEventNewListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAiopsEventNewListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAiopsEventNewListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
