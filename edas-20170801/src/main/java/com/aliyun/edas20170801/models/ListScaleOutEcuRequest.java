// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListScaleOutEcuRequest extends TeaModel {
    /**
     * <p>The ID of the application. Specify this parameter if you want to query the available ECUs in the cluster where the application is deployed.</p>
     * <br>
     * <p>>  Specify at least one of the ClusterId and AppId parameters as the query parameter.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the cluster. Specify this parameter if you want to query the available ECUs in the cluster.</p>
     * <br>
     * <p>> Specify at least one of the ClusterId and AppId parameters as the query parameter.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of CPU cores based on which you want to query the available ECUs in the cluster.</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The ID of the instance group. Specify this parameter if you want to query the available ECUs in the cluster where the instance group resides.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The number of ECUs that you want to query. If this parameter is not specified, all the ECUs that meet the query conditions are returned.</p>
     */
    @NameInMap("InstanceNum")
    public Integer instanceNum;

    /**
     * <p>The ID of the namespace.</p>
     * <br>
     * <p>*   The ID of a custom namespace is in the `region ID:namespace identifier` format. Example: cn-beijing:test.</p>
     * <p>*   The ID of the default namespace is in the `region ID` format. Example: cn-beijing.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The size of available memory based on which you want to query the available ECUs in the cluster. Unit: MB.</p>
     */
    @NameInMap("Mem")
    public Integer mem;

    public static ListScaleOutEcuRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScaleOutEcuRequest self = new ListScaleOutEcuRequest();
        return TeaModel.build(map, self);
    }

    public ListScaleOutEcuRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListScaleOutEcuRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListScaleOutEcuRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public ListScaleOutEcuRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListScaleOutEcuRequest setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }
    public Integer getInstanceNum() {
        return this.instanceNum;
    }

    public ListScaleOutEcuRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public ListScaleOutEcuRequest setMem(Integer mem) {
        this.mem = mem;
        return this;
    }
    public Integer getMem() {
        return this.mem;
    }

}
