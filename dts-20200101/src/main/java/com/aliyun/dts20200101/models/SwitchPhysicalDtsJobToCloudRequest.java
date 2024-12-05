// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SwitchPhysicalDtsJobToCloudRequest extends TeaModel {
    /**
     * <p>Migration, synchronization, or subscription instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsl3m1213ye7l****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>Data migration or synchronization instance ID, which can be queried by calling the <strong>describedtsjobs</strong> interface.</p>
     * 
     * <strong>example:</strong>
     * <p>l5512es7w15****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>Region ID. Pass this parameter to specify the region where the instance is located. For more details, see the list of supported regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz4us4iruleja</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Synchronization direction, values: - <strong>Forward</strong>: Forward. - <strong>Reverse</strong>: Reverse.</p>
     * <blockquote>
     * <ul>
     * <li>The default value is <strong>Forward</strong>. - <strong>Reverse</strong> can only be passed when the topology of the data synchronization instance is bidirectional, to release the reverse synchronization link.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    public static SwitchPhysicalDtsJobToCloudRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchPhysicalDtsJobToCloudRequest self = new SwitchPhysicalDtsJobToCloudRequest();
        return TeaModel.build(map, self);
    }

    public SwitchPhysicalDtsJobToCloudRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public SwitchPhysicalDtsJobToCloudRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public SwitchPhysicalDtsJobToCloudRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SwitchPhysicalDtsJobToCloudRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SwitchPhysicalDtsJobToCloudRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

}
