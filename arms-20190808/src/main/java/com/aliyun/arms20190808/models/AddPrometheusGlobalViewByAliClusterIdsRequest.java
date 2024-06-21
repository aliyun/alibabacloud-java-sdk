// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewByAliClusterIdsRequest extends TeaModel {
    /**
     * <p>The IDs of clusters. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd1d55bef19904324a20ed0ebb86caa5c,c5b48729918ab4745a24482ac29d0973a, c00a94896641449098bf24931e4166003, cd174485c09384060ba542bc1be1185a4</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIds;

    /**
     * <p>The name of the global aggregation instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zyGlobalView</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The identifier to identify the service if custom dashboards are created for the specified clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>adcp</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
