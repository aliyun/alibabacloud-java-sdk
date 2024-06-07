// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class AddSecretBlacklistRequest extends TeaModel {
    /**
     * <p>The numbers in the blacklist. A point-to-point blacklist has a pair of numbers separated by a colon (:). A number pool blacklist has only one single number.</p>
     * <br>
     * <p>>  The asterisks (\\*) in the sample value are not wildcards.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlackNo")
    public String blackNo;

    /**
     * <p>The blacklist type. Valid values:</p>
     * <br>
     * <p>*   **POINT_TO_POINT_BLACK**: point-to-point blacklist.</p>
     * <p>*   **PARTNER_GLOBAL_NUMBER_BLACK**: number pool blacklist.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlackType")
    public String blackType;

    /**
     * <p>The key of the phone number pool.</p>
     * <br>
     * <p>Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the Number Pool Management page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The blacklist remarks.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The control on the call direction.</p>
     * <br>
     * <p>*   **PHONEA_REJECT**: The first number in the blacklist can be used to call the second number, but the second number cannot be used to call the first number.</p>
     * <p>*   **PHONEB_REJECT**: The first number in the blacklist cannot be used to call the second number, but the second number can be used to call the first number.</p>
     * <p>*   If this parameter is left empty, the two numbers in the blacklist cannot be used to call each other.</p>
     * <br>
     * <p>>  This parameter is available only for a point-to-point blacklist.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   DUPLEX_REJECT</p>
     * <p>*   PHONEA_REJECT</p>
     * <p>*   PHONEB_REJECT</p>
     */
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
