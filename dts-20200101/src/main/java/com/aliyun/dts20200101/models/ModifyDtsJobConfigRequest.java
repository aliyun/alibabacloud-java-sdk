// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>lxsn87r328d****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;module\&quot;:\&quot;07\&quot;,\&quot;name\&quot;:\&quot;sink.connection.idle.second\&quot;,\&quot;value\&quot;:60},{\&quot;module\&quot;:\&quot;07\&quot;,\&quot;name\&quot;:\&quot;sink.batch.size.maximum\&quot;,\&quot;value\&quot;:64}]</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyDtsJobConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobConfigRequest self = new ModifyDtsJobConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobConfigRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDtsJobConfigRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyDtsJobConfigRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyDtsJobConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
