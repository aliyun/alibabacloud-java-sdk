// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DbList")
    public java.util.Map<String, ?> dbList;

    @NameInMap("EtlOperatorColumnReference")
    public String etlOperatorColumnReference;

    public static ModifyDtsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobRequest self = new ModifyDtsJobRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifyDtsJobRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ModifyDtsJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDtsJobRequest setDbList(java.util.Map<String, ?> dbList) {
        this.dbList = dbList;
        return this;
    }
    public java.util.Map<String, ?> getDbList() {
        return this.dbList;
    }

    public ModifyDtsJobRequest setEtlOperatorColumnReference(String etlOperatorColumnReference) {
        this.etlOperatorColumnReference = etlOperatorColumnReference;
        return this;
    }
    public String getEtlOperatorColumnReference() {
        return this.etlOperatorColumnReference;
    }

}
