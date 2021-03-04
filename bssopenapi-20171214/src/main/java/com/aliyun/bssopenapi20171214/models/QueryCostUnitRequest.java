// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitRequest extends TeaModel {
    @NameInMap("OwnerUid")
    public Long ownerUid;

    @NameInMap("ParentUnitId")
    public Long parentUnitId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryCostUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitRequest self = new QueryCostUnitRequest();
        return TeaModel.build(map, self);
    }

    public QueryCostUnitRequest setOwnerUid(Long ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public Long getOwnerUid() {
        return this.ownerUid;
    }

    public QueryCostUnitRequest setParentUnitId(Long parentUnitId) {
        this.parentUnitId = parentUnitId;
        return this;
    }
    public Long getParentUnitId() {
        return this.parentUnitId;
    }

    public QueryCostUnitRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryCostUnitRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
