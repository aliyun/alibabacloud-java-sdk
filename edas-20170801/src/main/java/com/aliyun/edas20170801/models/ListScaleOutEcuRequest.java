// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListScaleOutEcuRequest extends TeaModel {
    /**
     * <p>The ID of the application. Specify this parameter if you want to query the available ECUs in the cluster where the application is deployed.</p>
     * <blockquote>
     * <p> Specify at least one of the ClusterId and AppId parameters as the query parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>b93024fd-8a9d-4ef7-99f1-5f0d65cc****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the cluster. Specify this parameter if you want to query the available ECUs in the cluster.</p>
     * <blockquote>
     * <p>Specify at least one of the ClusterId and AppId parameters as the query parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>52984524-6d48-4bbd-******************</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of CPU cores based on which you want to query the available ECUs in the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The ID of the instance group. Specify this parameter if you want to query the available ECUs in the cluster where the instance group resides.</p>
     * 
     * <strong>example:</strong>
     * <p>8123db90-880f-486f-<strong><strong>-</strong></strong></p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The number of ECUs that you want to query. If this parameter is not specified, all the ECUs that meet the query conditions are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InstanceNum")
    public Integer instanceNum;

    /**
     * <p>The ID of the namespace.</p>
     * <ul>
     * <li>The ID of a custom namespace is in the <code>region ID:namespace identifier</code> format. Example: cn-beijing:test.</li>
     * <li>The ID of the default namespace is in the <code>region ID</code> format. Example: cn-beijing.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The size of available memory based on which you want to query the available ECUs in the cluster. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
