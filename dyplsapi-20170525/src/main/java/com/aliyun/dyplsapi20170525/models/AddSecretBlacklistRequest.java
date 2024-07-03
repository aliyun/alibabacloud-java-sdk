// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class AddSecretBlacklistRequest extends TeaModel {
    /**
     * <p>The numbers in the blacklist. A point-to-point blacklist has a pair of numbers separated by a colon (:). A number pool blacklist has only one single number.</p>
     * <blockquote>
     * <p> The asterisks (\*) in the sample value are not wildcards.</p>
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
     * <p>The key of the phone number pool.</p>
     * <p>Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the Number Pool Management page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC2235****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The blacklist remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer service feedback</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The control on the call direction.</p>
     * <ul>
     * <li><strong>PHONEA_REJECT</strong>: The first number in the blacklist can be used to call the second number, but the second number cannot be used to call the first number.</li>
     * <li><strong>PHONEB_REJECT</strong>: The first number in the blacklist cannot be used to call the second number, but the second number can be used to call the first number.</li>
     * <li>If this parameter is left empty, the two numbers in the blacklist cannot be used to call each other.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is available only for a point-to-point blacklist.</p>
     * </blockquote>
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
