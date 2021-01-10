// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionRequest extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("FilterBy")
    public String filterBy;

    @NameInMap("SpaceId")
    public String spaceId;

    public static ListFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionRequest self = new ListFunctionRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListFunctionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFunctionRequest setFilterBy(String filterBy) {
        this.filterBy = filterBy;
        return this;
    }
    public String getFilterBy() {
        return this.filterBy;
    }

    public ListFunctionRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
