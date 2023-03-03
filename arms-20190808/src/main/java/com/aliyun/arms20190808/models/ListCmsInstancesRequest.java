// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListCmsInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The filter condition. Format: \[unk]{"key":"value"}\[unk]. You must set the \[unk]key\[unk] and \[unk]value\[unk] fields.</p>
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
