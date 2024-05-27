// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmAddressPoolRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AddressPoolId")
    public String addressPoolId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeCloudGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmAddressPoolRequest self = new DescribeCloudGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmAddressPoolRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeCloudGtmAddressPoolRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public DescribeCloudGtmAddressPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
