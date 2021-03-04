// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResourceRequest extends TeaModel {
    @NameInMap("OwnerUid")
    public Long ownerUid;

    @NameInMap("UnitId")
    public Long unitId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryCostUnitResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitResourceRequest self = new QueryCostUnitResourceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCostUnitResourceRequest setOwnerUid(Long ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public Long getOwnerUid() {
        return this.ownerUid;
    }

    public QueryCostUnitResourceRequest setUnitId(Long unitId) {
        this.unitId = unitId;
        return this;
    }
    public Long getUnitId() {
        return this.unitId;
    }

    public QueryCostUnitResourceRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryCostUnitResourceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
