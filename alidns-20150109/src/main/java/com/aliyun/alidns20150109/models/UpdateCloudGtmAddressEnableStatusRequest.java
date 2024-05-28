// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressEnableStatusRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    public static UpdateCloudGtmAddressEnableStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressEnableStatusRequest self = new UpdateCloudGtmAddressEnableStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressEnableStatusRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmAddressEnableStatusRequest setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public UpdateCloudGtmAddressEnableStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmAddressEnableStatusRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

}
