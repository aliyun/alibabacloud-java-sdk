// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListCertConfigsRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    public static ListCertConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCertConfigsRequest self = new ListCertConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListCertConfigsRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ListCertConfigsRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

}
