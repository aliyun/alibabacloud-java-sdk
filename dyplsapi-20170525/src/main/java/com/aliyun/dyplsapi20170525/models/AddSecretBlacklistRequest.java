// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class AddSecretBlacklistRequest extends TeaModel {
    @NameInMap("BlackNo")
    public String blackNo;

    @NameInMap("BlackType")
    public String blackType;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("WayControl")
    public String wayControl;

    public static AddSecretBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSecretBlacklistRequest self = new AddSecretBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public AddSecretBlacklistRequest setBlackNo(String blackNo) {
        this.blackNo = blackNo;
        return this;
    }
    public String getBlackNo() {
        return this.blackNo;
    }

    public AddSecretBlacklistRequest setBlackType(String blackType) {
        this.blackType = blackType;
        return this;
    }
    public String getBlackType() {
        return this.blackType;
    }

    public AddSecretBlacklistRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public AddSecretBlacklistRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddSecretBlacklistRequest setWayControl(String wayControl) {
        this.wayControl = wayControl;
        return this;
    }
    public String getWayControl() {
        return this.wayControl;
    }

}
