// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressPoolReferenceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese.</p>
     * </li>
     * <li><p>en-US: English. This is the default value.</p>
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
     * <p>The client token that is used to ensure the idempotence of the request. Generate a token to make sure that it is unique among different requests. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeCloudGtmAddressPoolReferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressPoolReferenceRequest self = new DescribeCloudGtmAddressPoolReferenceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressPoolReferenceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeCloudGtmAddressPoolReferenceRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public DescribeCloudGtmAddressPoolReferenceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
