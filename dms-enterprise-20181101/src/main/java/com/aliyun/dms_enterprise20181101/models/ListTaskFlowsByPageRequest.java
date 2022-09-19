// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowsByPageRequest extends TeaModel {
    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("Tid")
    public Long tid;

    public static ListTaskFlowsByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowsByPageRequest self = new ListTaskFlowsByPageRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowsByPageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListTaskFlowsByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskFlowsByPageRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListTaskFlowsByPageRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
