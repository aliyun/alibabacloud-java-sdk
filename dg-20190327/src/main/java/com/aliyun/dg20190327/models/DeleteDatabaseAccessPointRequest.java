// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class DeleteDatabaseAccessPointRequest extends TeaModel {
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

    public static DeleteDatabaseAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseAccessPointRequest self = new DeleteDatabaseAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseAccessPointRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public DeleteDatabaseAccessPointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDatabaseAccessPointRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DeleteDatabaseAccessPointRequest setVpcAZone(String vpcAZone) {
        this.vpcAZone = vpcAZone;
        return this;
    }
    public String getVpcAZone() {
        return this.vpcAZone;
    }

    public DeleteDatabaseAccessPointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DeleteDatabaseAccessPointRequest setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
        return this;
    }
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

}
