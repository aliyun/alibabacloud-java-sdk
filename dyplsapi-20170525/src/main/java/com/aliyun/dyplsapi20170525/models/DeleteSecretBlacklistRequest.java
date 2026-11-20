// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSecretBlacklistRequest extends TeaModel {
    /**
     * <p>The blacklisted number. The value type is determined by the <strong>BlackType</strong> parameter:</p>
     * <ul>
     * <li><strong>Point-to-point blacklist</strong>: a pair of numbers separated by a colon (:)</li>
     * <li><strong>Number pool blacklist</strong>: a single number</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1825<strong><strong>383:1825</strong></strong>483</p>
     */
    @NameInMap("BlackNo")
    public String blackNo;

    /**
     * <p>The type of the blacklist. Valid values:</p>
     * <ul>
     * <li><strong>POINT_TO_POINT_BLACK</strong>: point-to-point blacklist</li>
     * <li><strong>PARTNER_GLOBAL_NUMBER_BLACK</strong>: number pool blacklist</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>POINT_TO_POINT_BLACK</p>
     */
    @NameInMap("BlackType")
    public String blackType;

    /**
     * <p>The key of the number pool.</p>
     * <p>You can obtain the <strong>number pool key</strong> on the <a href="https://dyplsnext.console.aliyun.com/number-pool">Number Pool Management</a> page in the Phone Number Privacy Protection console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC1232****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The remark for the blacklist.</p>
     * 
     * <strong>example:</strong>
     * <p>Blacklist remark</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The call direction control. Valid values:</p>
     * <ul>
     * <li><p><strong>PHONEA_REJECT</strong>: The first number in BlackNo can call the second number, but the second number cannot call the first number.</p>
     * </li>
     * <li><p><strong>PHONEB_REJECT</strong>: The first number in BlackNo cannot call the second number, but the second number can call the first number.</p>
     * </li>
     * <li><p><strong>Leave empty</strong>: The two numbers in BlackNo cannot call each other.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PHONEA_REJECT</p>
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
