// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListAutoSnapshotPolicyUnappliedDbfsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FsName</p>
     */
    @NameInMap("FilterKey")
    public String filterKey;

    /**
     * <strong>example:</strong>
     * <p>DBFS1</p>
     */
    @NameInMap("FilterValue")
    public String filterValue;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListAutoSnapshotPolicyUnappliedDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoSnapshotPolicyUnappliedDbfsRequest self = new ListAutoSnapshotPolicyUnappliedDbfsRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoSnapshotPolicyUnappliedDbfsRequest setFilterKey(String filterKey) {
        this.filterKey = filterKey;
        return this;
    }
    public String getFilterKey() {
        return this.filterKey;
    }

    public ListAutoSnapshotPolicyUnappliedDbfsRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public ListAutoSnapshotPolicyUnappliedDbfsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAutoSnapshotPolicyUnappliedDbfsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAutoSnapshotPolicyUnappliedDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
