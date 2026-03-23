// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolListRequest extends TeaModel {
    /**
     * <p>Specifies whether to return all entries.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The keyword to search for IP pools by name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number to return, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>44fb3ec8-1f87-42e4-866d-e23dad9e7c9a</p>
     */
    @NameInMap("PoolId")
    public String poolId;

    public static DedicatedIpPoolListRequest build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpPoolListRequest self = new DedicatedIpPoolListRequest();
        return TeaModel.build(map, self);
    }

    public DedicatedIpPoolListRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public DedicatedIpPoolListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DedicatedIpPoolListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public DedicatedIpPoolListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DedicatedIpPoolListRequest setPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }
    public String getPoolId() {
        return this.poolId;
    }

}
