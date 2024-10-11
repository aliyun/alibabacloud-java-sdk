// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsAttachableEcsInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InstanceName</p>
     */
    @NameInMap("FilterKey")
    public String filterKey;

    /**
     * <strong>example:</strong>
     * <p>autotest1</p>
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

    public static ListDbfsAttachableEcsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDbfsAttachableEcsInstancesRequest self = new ListDbfsAttachableEcsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListDbfsAttachableEcsInstancesRequest setFilterKey(String filterKey) {
        this.filterKey = filterKey;
        return this;
    }
    public String getFilterKey() {
        return this.filterKey;
    }

    public ListDbfsAttachableEcsInstancesRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public ListDbfsAttachableEcsInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDbfsAttachableEcsInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDbfsAttachableEcsInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
