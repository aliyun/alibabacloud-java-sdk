// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResourceRequest extends TeaModel {
    /**
     * <p>The user ID of the financial unit owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23453245</p>
     */
    @NameInMap("OwnerUid")
    public Long ownerUid;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the financial unit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>235325</p>
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
