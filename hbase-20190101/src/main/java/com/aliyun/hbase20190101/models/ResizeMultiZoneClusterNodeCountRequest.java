// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeMultiZoneClusterNodeCountRequest extends TeaModel {
    /**
     * <p>The vSwitch ID of the arbitration node.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hangxzhouxb*****</p>
     */
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    /**
     * <p>The ID of the multi-zone cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-f5d8d6s4s2a1****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of core nodes. The minimum value is 4, and the increment must be a multiple of 2.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("CoreNodeCount")
    public Integer coreNodeCount;

    /**
     * <p>The number of log nodes. The minimum value is 4, and the value must be a multiple of 4.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("LogNodeCount")
    public Integer logNodeCount;

    /**
     * <p>The number of core nodes in the primary zone instance. The minimum value is 4, and the increment must be a multiple of 2.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("PrimaryCoreNodeCount")
    public Integer primaryCoreNodeCount;

    /**
     * <p>The vSwitch ID of the instance in the primary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hangxzhouxe*****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <p>The number of core nodes in the secondary zone instance. The minimum value is 4, and the increment must be a multiple of 2.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("StandbyCoreNodeCount")
    public Integer standbyCoreNodeCount;

    /**
     * <p>The vSwitch ID of the instance in the secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-hangxzhouxf****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    public static ResizeMultiZoneClusterNodeCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeMultiZoneClusterNodeCountRequest self = new ResizeMultiZoneClusterNodeCountRequest();
        return TeaModel.build(map, self);
    }

    public ResizeMultiZoneClusterNodeCountRequest setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public ResizeMultiZoneClusterNodeCountRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResizeMultiZoneClusterNodeCountRequest setCoreNodeCount(Integer coreNodeCount) {
        this.coreNodeCount = coreNodeCount;
        return this;
    }
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
    }

    public ResizeMultiZoneClusterNodeCountRequest setLogNodeCount(Integer logNodeCount) {
        this.logNodeCount = logNodeCount;
        return this;
    }
    public Integer getLogNodeCount() {
        return this.logNodeCount;
    }

    public ResizeMultiZoneClusterNodeCountRequest setPrimaryCoreNodeCount(Integer primaryCoreNodeCount) {
        this.primaryCoreNodeCount = primaryCoreNodeCount;
        return this;
    }
    public Integer getPrimaryCoreNodeCount() {
        return this.primaryCoreNodeCount;
    }

    public ResizeMultiZoneClusterNodeCountRequest setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public ResizeMultiZoneClusterNodeCountRequest setStandbyCoreNodeCount(Integer standbyCoreNodeCount) {
        this.standbyCoreNodeCount = standbyCoreNodeCount;
        return this;
    }
    public Integer getStandbyCoreNodeCount() {
        return this.standbyCoreNodeCount;
    }

    public ResizeMultiZoneClusterNodeCountRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

}
