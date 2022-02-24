// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetLcenseInfomationRequest extends TeaModel {
    @NameInMap("FetchFieldList")
    public String fetchFieldList;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    public static GetLcenseInfomationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLcenseInfomationRequest self = new GetLcenseInfomationRequest();
        return TeaModel.build(map, self);
    }

    public GetLcenseInfomationRequest setFetchFieldList(String fetchFieldList) {
        this.fetchFieldList = fetchFieldList;
        return this;
    }
    public String getFetchFieldList() {
        return this.fetchFieldList;
    }

    public GetLcenseInfomationRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetLcenseInfomationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLcenseInfomationRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
