// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetLegalNoticesThreeRequest extends TeaModel {
    @NameInMap("FetchFieldList")
    public String fetchFieldList;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    public static GetLegalNoticesThreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLegalNoticesThreeRequest self = new GetLegalNoticesThreeRequest();
        return TeaModel.build(map, self);
    }

    public GetLegalNoticesThreeRequest setFetchFieldList(String fetchFieldList) {
        this.fetchFieldList = fetchFieldList;
        return this;
    }
    public String getFetchFieldList() {
        return this.fetchFieldList;
    }

    public GetLegalNoticesThreeRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetLegalNoticesThreeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLegalNoticesThreeRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
