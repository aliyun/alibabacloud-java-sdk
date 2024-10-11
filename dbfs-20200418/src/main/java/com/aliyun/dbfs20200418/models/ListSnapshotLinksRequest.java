// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListSnapshotLinksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FsId</p>
     */
    @NameInMap("FilterKey")
    public String filterKey;

    /**
     * <strong>example:</strong>
     * <p>dbfs-kwziq4dpsle********</p>
     */
    @NameInMap("FilterValue")
    public String filterValue;

    /**
     * <strong>example:</strong>
     * <p>[&quot;dbfs-kwziq4dpsle********&quot;,&quot;dbfs-vuaqvfcjqsg********&quot;]</p>
     */
    @NameInMap("FsIds")
    public String fsIds;

    /**
     * <strong>example:</strong>
     * <p>[&quot;sl-bp1grgphbcc9brb5****&quot;,&quot;sl-bp1c4izumvq0i5bs****&quot;,&quot;sl-bp1akk7isz866dds****&quot;]</p>
     */
    @NameInMap("LinkIds")
    public String linkIds;

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

    public static ListSnapshotLinksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotLinksRequest self = new ListSnapshotLinksRequest();
        return TeaModel.build(map, self);
    }

    public ListSnapshotLinksRequest setFilterKey(String filterKey) {
        this.filterKey = filterKey;
        return this;
    }
    public String getFilterKey() {
        return this.filterKey;
    }

    public ListSnapshotLinksRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public ListSnapshotLinksRequest setFsIds(String fsIds) {
        this.fsIds = fsIds;
        return this;
    }
    public String getFsIds() {
        return this.fsIds;
    }

    public ListSnapshotLinksRequest setLinkIds(String linkIds) {
        this.linkIds = linkIds;
        return this;
    }
    public String getLinkIds() {
        return this.linkIds;
    }

    public ListSnapshotLinksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSnapshotLinksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSnapshotLinksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
