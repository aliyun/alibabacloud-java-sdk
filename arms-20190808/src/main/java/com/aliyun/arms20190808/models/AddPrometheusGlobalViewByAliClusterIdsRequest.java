// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewByAliClusterIdsRequest extends TeaModel {
    @NameInMap("ClusterIds")
    public String clusterIds;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RegionId")
    public String regionId;

    public static AddPrometheusGlobalViewByAliClusterIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusGlobalViewByAliClusterIdsRequest self = new AddPrometheusGlobalViewByAliClusterIdsRequest();
        return TeaModel.build(map, self);
    }

    public AddPrometheusGlobalViewByAliClusterIdsRequest setClusterIds(String clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public String getClusterIds() {
        return this.clusterIds;
    }

    public AddPrometheusGlobalViewByAliClusterIdsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddPrometheusGlobalViewByAliClusterIdsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AddPrometheusGlobalViewByAliClusterIdsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
