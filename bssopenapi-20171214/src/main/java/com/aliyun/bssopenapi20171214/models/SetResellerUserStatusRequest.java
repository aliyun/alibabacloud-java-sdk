// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserStatusRequest extends TeaModel {
    /**
     * <p>The type of the business. Valid values: FREEZE: the frozen business of the account. TRUSTEESHIP: the hosted business of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FREEZE</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The account status that you want to set. Valid values: Freeze: The account is frozen. Thaw: The account is unfrozen. Trusteeship: The account is hosted. TrusteeshipCancel: The account is not hosted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Freeze</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>停机模式
     * 取值：
     *     0：普通停机
     *     1：立即停机</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StopMode")
    public String stopMode;

    public static SetResellerUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserStatusRequest self = new SetResellerUserStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetResellerUserStatusRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public SetResellerUserStatusRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SetResellerUserStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SetResellerUserStatusRequest setStopMode(String stopMode) {
        this.stopMode = stopMode;
        return this;
    }
    public String getStopMode() {
        return this.stopMode;
    }

}
