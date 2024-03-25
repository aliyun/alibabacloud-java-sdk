// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class EnableAutoGroupCreationRequest extends TeaModel {
    /**
     * <p>Specify whether to enable the flexible group creation feature. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the flexible group creation feature.</p>
     * <p>*   **false**: disabled the flexible group creation feature.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>You can call the [GetInstanceList](~~437663~~) operation to query instances.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static EnableAutoGroupCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAutoGroupCreationRequest self = new EnableAutoGroupCreationRequest();
        return TeaModel.build(map, self);
    }

    public EnableAutoGroupCreationRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public EnableAutoGroupCreationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableAutoGroupCreationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
