// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSecretBlacklistRequest extends TeaModel {
    /**
     * <p>The phone numbers in the blacklist. A point-to-point blacklist has a pair of numbers separated by a colon (":"). A number pool blacklist or a platform blacklist has only one single number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlackNo")
    public String blackNo;

    /**
     * <p>The blacklist type. Valid values:</p>
     * <br>
     * <p>*   **POINT_TO_POINT_BLACK**: point-to-point blacklist</p>
     * <p>*   **PARTNER_GLOBAL_NUMBER_BLACK**: number pool blacklist</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlackType")
    public String blackType;

    /**
     * <p>The key of the phone number pool. Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The remarks for the blacklist.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The control on the call direction.</p>
     * <br>
     * <p>*   **PHONEA_REJECT**: The first phone number in the blacklist can be used to call the second phone number, but the second phone number in the blacklist cannot be used to call the first phone number.</p>
     * <p>*   **PHONEB_REJECT**: The first phone number in the blacklist cannot be used to call the second phone number, but the second phone number in the blacklist can be used to call the first phone number.</p>
     * <p>*   If this parameter is not specified, the two phone numbers in the blacklist cannot be used to call each other.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   DUPLEX_REJECT</p>
     * <p>*   PHONEA_REJECT</p>
     * <p>*   PHONEB_REJECT</p>
     */
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
