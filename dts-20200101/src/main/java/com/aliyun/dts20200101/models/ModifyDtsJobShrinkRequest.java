// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DbList")
    public String dbListShrink;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("EtlOperatorColumnReference")
    public String etlOperatorColumnReference;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    public static ModifyDtsJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobShrinkRequest self = new ModifyDtsJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDtsJobShrinkRequest setDbListShrink(String dbListShrink) {
        this.dbListShrink = dbListShrink;
        return this;
    }
    public String getDbListShrink() {
        return this.dbListShrink;
    }

    public ModifyDtsJobShrinkRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifyDtsJobShrinkRequest setEtlOperatorColumnReference(String etlOperatorColumnReference) {
        this.etlOperatorColumnReference = etlOperatorColumnReference;
        return this;
    }
    public String getEtlOperatorColumnReference() {
        return this.etlOperatorColumnReference;
    }

    public ModifyDtsJobShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobShrinkRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

}
