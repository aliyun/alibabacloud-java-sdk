// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyJudgmentDocumentRequest extends TeaModel {
    @NameInMap("CountSqlId")
    public Integer countSqlId;

    @NameInMap("FetchFieldList")
    public String fetchFieldList;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    public static GetCompanyJudgmentDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyJudgmentDocumentRequest self = new GetCompanyJudgmentDocumentRequest();
        return TeaModel.build(map, self);
    }

    public GetCompanyJudgmentDocumentRequest setCountSqlId(Integer countSqlId) {
        this.countSqlId = countSqlId;
        return this;
    }
    public Integer getCountSqlId() {
        return this.countSqlId;
    }

    public GetCompanyJudgmentDocumentRequest setFetchFieldList(String fetchFieldList) {
        this.fetchFieldList = fetchFieldList;
        return this;
    }
    public String getFetchFieldList() {
        return this.fetchFieldList;
    }

    public GetCompanyJudgmentDocumentRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetCompanyJudgmentDocumentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCompanyJudgmentDocumentRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
