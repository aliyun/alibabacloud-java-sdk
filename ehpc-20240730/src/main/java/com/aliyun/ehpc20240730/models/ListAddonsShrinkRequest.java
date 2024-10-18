// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAddonsShrinkRequest extends TeaModel {
    /**
     * <p>The addon IDs.</p>
     */
    @NameInMap("AddonIds")
    public String addonIdsShrink;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number of the page to return. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAddonsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAddonsShrinkRequest self = new ListAddonsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAddonsShrinkRequest setAddonIdsShrink(String addonIdsShrink) {
        this.addonIdsShrink = addonIdsShrink;
        return this;
    }
    public String getAddonIdsShrink() {
        return this.addonIdsShrink;
    }

    public ListAddonsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAddonsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAddonsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
