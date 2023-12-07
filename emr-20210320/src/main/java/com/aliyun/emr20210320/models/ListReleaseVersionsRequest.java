// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListReleaseVersionsRequest extends TeaModel {
    /**
     * <p>The type of the cluster.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The type of the IaaS resource.</p>
     */
    @NameInMap("IaasType")
    public String iaasType;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListReleaseVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReleaseVersionsRequest self = new ListReleaseVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListReleaseVersionsRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListReleaseVersionsRequest setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public ListReleaseVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
