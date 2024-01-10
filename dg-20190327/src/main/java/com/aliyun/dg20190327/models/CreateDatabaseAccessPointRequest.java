// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class CreateDatabaseAccessPointRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcAZone")
    public String vpcAZone;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpcRegionId")
    public String vpcRegionId;

    public static CreateDatabaseAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseAccessPointRequest self = new CreateDatabaseAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseAccessPointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDatabaseAccessPointRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public CreateDatabaseAccessPointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDatabaseAccessPointRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDatabaseAccessPointRequest setVpcAZone(String vpcAZone) {
        this.vpcAZone = vpcAZone;
        return this;
    }
    public String getVpcAZone() {
        return this.vpcAZone;
    }

    public CreateDatabaseAccessPointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateDatabaseAccessPointRequest setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
        return this;
    }
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

}
