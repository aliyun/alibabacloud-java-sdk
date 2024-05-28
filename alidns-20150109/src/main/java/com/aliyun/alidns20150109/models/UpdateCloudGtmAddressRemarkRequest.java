// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressRemarkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Remark")
    public String remark;

    public static UpdateCloudGtmAddressRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressRemarkRequest self = new UpdateCloudGtmAddressRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressRemarkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmAddressRemarkRequest setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public UpdateCloudGtmAddressRemarkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmAddressRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
