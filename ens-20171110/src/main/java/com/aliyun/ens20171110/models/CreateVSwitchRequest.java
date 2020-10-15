// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateVSwitchRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("EnsRegionId")
    @Validation(required = true)
    public String ensRegionId;

    @NameInMap("CidrBlock")
    @Validation(required = true)
    public String cidrBlock;

    @NameInMap("VSwitchName")
    public String vSwitchName;

    public static CreateVSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchRequest self = new CreateVSwitchRequest();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateVSwitchRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateVSwitchRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateVSwitchRequest setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

}
