// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListAutoSnapshotPolicyAppliedDbfsRequest extends TeaModel {
    @NameInMap("FilterKey")
    public String filterKey;

    @NameInMap("FilterValue")
    public String filterValue;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListAutoSnapshotPolicyAppliedDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoSnapshotPolicyAppliedDbfsRequest self = new ListAutoSnapshotPolicyAppliedDbfsRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoSnapshotPolicyAppliedDbfsRequest setFilterKey(String filterKey) {
        this.filterKey = filterKey;
        return this;
    }
    public String getFilterKey() {
        return this.filterKey;
    }

    public ListAutoSnapshotPolicyAppliedDbfsRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public ListAutoSnapshotPolicyAppliedDbfsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAutoSnapshotPolicyAppliedDbfsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAutoSnapshotPolicyAppliedDbfsRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListAutoSnapshotPolicyAppliedDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
