// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressManualAvailableStatusRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese</p>
     * </li>
     * <li><p>en-US (Default): English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>addr-89518218114368****</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    /**
     * <p>The failover method for the address. Valid values:</p>
     * <ul>
     * <li><p>auto: Automatic. The address status is determined by health check results. If a health check fails, DNS resolution stops. If it succeeds, DNS resolution resumes.</p>
     * </li>
     * <li><p>manual: Manual. You control the address status. If set to abnormal, DNS resolution stops and does not resume even if health checks succeed. If set to normal, DNS resolution resumes. If a health check fails, an alert is triggered but resolution does not stop.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("AvailableMode")
    public String availableMode;

    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request. Make sure that the token is unique among different requests. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The availability status of the address. This parameter takes effect only when AvailableMode is set to manual. Valid values:</p>
     * <ul>
     * <li><p>available: Normal. The address is available. If a health check fails, an alert is triggered but DNS resolution continues.</p>
     * </li>
     * <li><p>unavailable: Abnormal. DNS resolution for the address is stopped. It does not resume even if health checks succeed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
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
