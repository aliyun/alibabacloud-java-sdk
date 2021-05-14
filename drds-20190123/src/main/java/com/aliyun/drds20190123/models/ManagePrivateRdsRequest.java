// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ManagePrivateRdsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RdsAction")
    public String rdsAction;

    @NameInMap("Params")
    public String params;

    public static ManagePrivateRdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ManagePrivateRdsRequest self = new ManagePrivateRdsRequest();
        return TeaModel.build(map, self);
    }

    public ManagePrivateRdsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ManagePrivateRdsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ManagePrivateRdsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ManagePrivateRdsRequest setRdsAction(String rdsAction) {
        this.rdsAction = rdsAction;
        return this;
    }
    public String getRdsAction() {
        return this.rdsAction;
    }

    public ManagePrivateRdsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
