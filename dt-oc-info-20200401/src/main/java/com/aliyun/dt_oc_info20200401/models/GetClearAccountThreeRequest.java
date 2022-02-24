// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetClearAccountThreeRequest extends TeaModel {
    @NameInMap("FetchFieldList")
    public String fetchFieldList;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    public static GetClearAccountThreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClearAccountThreeRequest self = new GetClearAccountThreeRequest();
        return TeaModel.build(map, self);
    }

    public GetClearAccountThreeRequest setFetchFieldList(String fetchFieldList) {
        this.fetchFieldList = fetchFieldList;
        return this;
    }
    public String getFetchFieldList() {
        return this.fetchFieldList;
    }

    public GetClearAccountThreeRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetClearAccountThreeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetClearAccountThreeRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
