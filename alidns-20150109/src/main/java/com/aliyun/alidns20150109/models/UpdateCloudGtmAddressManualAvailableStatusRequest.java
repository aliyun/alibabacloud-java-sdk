// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressManualAvailableStatusRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    @NameInMap("AvailableMode")
    public String availableMode;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ManualAvailableStatus")
    public String manualAvailableStatus;

    public static UpdateCloudGtmAddressManualAvailableStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressManualAvailableStatusRequest self = new UpdateCloudGtmAddressManualAvailableStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressManualAvailableStatusRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmAddressManualAvailableStatusRequest setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public UpdateCloudGtmAddressManualAvailableStatusRequest setAvailableMode(String availableMode) {
        this.availableMode = availableMode;
        return this;
    }
    public String getAvailableMode() {
        return this.availableMode;
    }

    public UpdateCloudGtmAddressManualAvailableStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmAddressManualAvailableStatusRequest setManualAvailableStatus(String manualAvailableStatus) {
        this.manualAvailableStatus = manualAvailableStatus;
        return this;
    }
    public String getManualAvailableStatus() {
        return this.manualAvailableStatus;
    }

}
