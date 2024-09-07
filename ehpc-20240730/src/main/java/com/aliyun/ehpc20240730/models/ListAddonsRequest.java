// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAddonsRequest extends TeaModel {
    @NameInMap("AddonIds")
    public java.util.List<String> addonIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

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

    public static ListAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAddonsRequest self = new ListAddonsRequest();
        return TeaModel.build(map, self);
    }

    public ListAddonsRequest setAddonIds(java.util.List<String> addonIds) {
        this.addonIds = addonIds;
        return this;
    }
    public java.util.List<String> getAddonIds() {
        return this.addonIds;
    }

    public ListAddonsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAddonsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAddonsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
