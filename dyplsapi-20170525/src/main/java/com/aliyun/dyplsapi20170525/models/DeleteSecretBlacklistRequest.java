// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSecretBlacklistRequest extends TeaModel {
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

    public static DeleteSecretBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretBlacklistRequest self = new DeleteSecretBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecretBlacklistRequest setBlackNo(String blackNo) {
        this.blackNo = blackNo;
        return this;
    }
    public String getBlackNo() {
        return this.blackNo;
    }

    public DeleteSecretBlacklistRequest setBlackType(String blackType) {
        this.blackType = blackType;
        return this;
    }
    public String getBlackType() {
        return this.blackType;
    }

    public DeleteSecretBlacklistRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public DeleteSecretBlacklistRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DeleteSecretBlacklistRequest setWayControl(String wayControl) {
        this.wayControl = wayControl;
        return this;
    }
    public String getWayControl() {
        return this.wayControl;
    }

}
