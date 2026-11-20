// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class AddSecretBlacklistRequest extends TeaModel {
    /**
     * <p>The blacklisted phone number. The value type depends on the <strong>BlackType</strong> parameter:</p>
     * <ul>
     * <li><strong>Point-to-point blacklist</strong>: A pair of numbers (A and B numbers) separated by a colon (:).</li>
     * <li><strong>Number pool blacklist</strong>: A single number.</li>
     * </ul>
     * <blockquote>
     * <p>(\*) is not a wildcard.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1825638****:1825248****</p>
     */
    @NameInMap("BlackNo")
    public String blackNo;

    /**
     * <p>The blacklist type. Valid values:</p>
     * <ul>
     * <li><strong>POINT_TO_POINT_BLACK</strong>: point-to-point blacklist.</li>
     * <li><strong>PARTNER_GLOBAL_NUMBER_BLACK</strong>: number pool blacklist.</li>
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
     * <p>You can obtain the <strong>number pool key</strong> on the <a href="https://dyplsnext.console.aliyun.com/number-pool">Number Pool Management</a> page in the privacy protection console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC2235****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The remarks for the blacklist entry.</p>
     * 
     * <strong>example:</strong>
     * <p>Blacklist remarks</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The call direction control. Valid values:</p>
     * <ul>
     * <li><strong>PHONEA_REJECT</strong>: The first number in BlackNo can call the second number, but the second number cannot call the first number.</li>
     * <li><strong>PHONEB_REJECT</strong>: The first number in BlackNo cannot call the second number, but the second number can call the first number.</li>
     * <li><strong>Not specified</strong>: The two numbers in BlackNo cannot call each other.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only for point-to-point blacklists.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PHONEA_REJECT</p>
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
