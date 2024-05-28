// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmGlobalAlertRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeCloudGtmGlobalAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmGlobalAlertRequest self = new DescribeCloudGtmGlobalAlertRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmGlobalAlertRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeCloudGtmGlobalAlertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
