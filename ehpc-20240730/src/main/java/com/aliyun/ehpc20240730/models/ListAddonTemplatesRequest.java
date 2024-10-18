// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAddonTemplatesRequest extends TeaModel {
    /**
     * <p>The addon names.</p>
     */
    @NameInMap("AddonNames")
    public java.util.List<String> addonNames;

    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li>Standard</li>
     * <li>Serverless</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ClusterCategory")
    public String clusterCategory;

    /**
     * <p>The page number of the page to return. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID.</p>
     * 
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
