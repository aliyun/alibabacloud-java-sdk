// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolEnableStatusRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese</p>
     * </li>
     * <li><p>en-US (default): English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pool-89528023225442****</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <p>A client token to ensure the idempotence of the request. Generate a unique value from your client for this parameter. The client token can contain only ASCII characters and must be no more than 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The enabled status of the address pool:</p>
     * <ul>
     * <li><p>enable: Enables the address pool. If the health check is normal, the address pool is included in DNS resolution.</p>
     * </li>
     * <li><p>disable: Disables the address pool. The address pool is not included in DNS resolution, regardless of its health check status.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    public static UpdateCloudGtmAddressPoolEnableStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolEnableStatusRequest self = new UpdateCloudGtmAddressPoolEnableStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolEnableStatusRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmAddressPoolEnableStatusRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public UpdateCloudGtmAddressPoolEnableStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmAddressPoolEnableStatusRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

}
