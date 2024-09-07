// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAddonTemplatesRequest extends TeaModel {
    @NameInMap("AddonNames")
    public java.util.List<String> addonNames;

    /**
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ClusterCategory")
    public String clusterCategory;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListAddonTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAddonTemplatesRequest self = new ListAddonTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListAddonTemplatesRequest setAddonNames(java.util.List<String> addonNames) {
        this.addonNames = addonNames;
        return this;
    }
    public java.util.List<String> getAddonNames() {
        return this.addonNames;
    }

    public ListAddonTemplatesRequest setClusterCategory(String clusterCategory) {
        this.clusterCategory = clusterCategory;
        return this;
    }
    public String getClusterCategory() {
        return this.clusterCategory;
    }

    public ListAddonTemplatesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAddonTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAddonTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
