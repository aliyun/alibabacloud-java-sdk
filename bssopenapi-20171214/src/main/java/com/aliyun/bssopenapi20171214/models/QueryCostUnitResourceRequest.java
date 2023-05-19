// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResourceRequest extends TeaModel {
    /**
     * <p>The user ID of the cost center owner.</p>
     */
    @NameInMap("OwnerUid")
    public Long ownerUid;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the cost center.</p>
     */
    @NameInMap("UnitId")
    public Long unitId;

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

    public QueryCostUnitResourceRequest setUnitId(Long unitId) {
        this.unitId = unitId;
        return this;
    }
    public Long getUnitId() {
        return this.unitId;
    }

}
