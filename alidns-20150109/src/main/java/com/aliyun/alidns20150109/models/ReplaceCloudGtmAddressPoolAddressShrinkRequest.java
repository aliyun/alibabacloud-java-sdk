// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ReplaceCloudGtmAddressPoolAddressShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Chinese</li>
     * <li><strong>en-US (default)</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the address pool for which you want to replace addresses. This ID uniquely identifies the address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pool-89618921167339**24</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <p>The addresses.</p>
     */
    @NameInMap("Addresses")
    public String addressesShrink;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static ReplaceCloudGtmAddressPoolAddressShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceCloudGtmAddressPoolAddressShrinkRequest self = new ReplaceCloudGtmAddressPoolAddressShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceCloudGtmAddressPoolAddressShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReplaceCloudGtmAddressPoolAddressShrinkRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public ReplaceCloudGtmAddressPoolAddressShrinkRequest setAddressesShrink(String addressesShrink) {
        this.addressesShrink = addressesShrink;
        return this;
    }
    public String getAddressesShrink() {
        return this.addressesShrink;
    }

    public ReplaceCloudGtmAddressPoolAddressShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
