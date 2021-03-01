// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListMethodsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ServiceName")
    public String serviceName;

    public static ListMethodsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMethodsRequest self = new ListMethodsRequest();
        return TeaModel.build(map, self);
    }

    public ListMethodsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListMethodsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
