// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSecretBlacklistRequest extends TeaModel {
    /**
     * <p>The phone numbers in the blacklist. A point-to-point blacklist has a pair of numbers separated by a colon (&quot;:&quot;). A number pool blacklist or a platform blacklist has only one single number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18252<em><strong>383:18252</strong></em>483</p>
     */
    @NameInMap("BlackNo")
    public String blackNo;

    /**
     * <p>The blacklist type. Valid values:</p>
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
     * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC1232****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The remarks for the blacklist.</p>
     * 
     * <strong>example:</strong>
     * <p>fragile</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The control on the call direction.</p>
     * <ul>
     * <li><strong>PHONEA_REJECT</strong>: The first phone number in the blacklist can be used to call the second phone number, but the second phone number in the blacklist cannot be used to call the first phone number.</li>
     * <li><strong>PHONEB_REJECT</strong>: The first phone number in the blacklist cannot be used to call the second phone number, but the second phone number in the blacklist can be used to call the first phone number.</li>
     * <li>If this parameter is not specified, the two phone numbers in the blacklist cannot be used to call each other.</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>DUPLEX_REJECT</li>
     * <li>PHONEA_REJECT</li>
     * <li>PHONEB_REJECT</li>
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
