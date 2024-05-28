// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressReferenceRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AddressId")
    public String addressId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeCloudGtmAddressReferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressReferenceRequest self = new DescribeCloudGtmAddressReferenceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressReferenceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeCloudGtmAddressReferenceRequest setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public DescribeCloudGtmAddressReferenceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
