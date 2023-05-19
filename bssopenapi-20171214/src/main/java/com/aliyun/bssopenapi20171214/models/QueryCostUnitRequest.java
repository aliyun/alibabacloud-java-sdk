// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitRequest extends TeaModel {
    /**
     * <p>The user ID of the cost center owner.</p>
     */
    @NameInMap("OwnerUid")
    public Long ownerUid;

    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the parent cost center. A value of -1 indicates the root cost center.</p>
     */
    @NameInMap("ParentUnitId")
    public Long parentUnitId;

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

    public QueryCostUnitRequest setParentUnitId(Long parentUnitId) {
        this.parentUnitId = parentUnitId;
        return this;
    }
    public Long getParentUnitId() {
        return this.parentUnitId;
    }

}
