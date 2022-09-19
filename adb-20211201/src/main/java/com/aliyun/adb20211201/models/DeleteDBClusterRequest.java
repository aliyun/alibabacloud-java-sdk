// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteDBClusterRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("FixCode")
    public String fixCode;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterRequest self = new DeleteDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteDBClusterRequest setFixCode(String fixCode) {
        this.fixCode = fixCode;
        return this;
    }
    public String getFixCode() {
        return this.fixCode;
    }

    public DeleteDBClusterRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteDBClusterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DeleteDBClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
