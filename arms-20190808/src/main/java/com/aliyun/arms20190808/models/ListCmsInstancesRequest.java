// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListCmsInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>n9p9o9o3se</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>direct</p>
     */
    @NameInMap("TypeFilter")
    public String typeFilter;

    public static ListCmsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCmsInstancesRequest self = new ListCmsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListCmsInstancesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListCmsInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCmsInstancesRequest setTypeFilter(String typeFilter) {
        this.typeFilter = typeFilter;
        return this;
    }
    public String getTypeFilter() {
        return this.typeFilter;
    }

}
