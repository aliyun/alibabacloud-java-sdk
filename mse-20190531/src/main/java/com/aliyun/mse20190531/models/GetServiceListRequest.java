// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceListRequest extends TeaModel {
    // The language of the response.
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the application.
    @NameInMap("AppId")
    public String appId;

    // The IP address.
    @NameInMap("Ip")
    public String ip;

    // The ID of the region.
    @NameInMap("Region")
    public String region;

    // The name of the service.
    @NameInMap("ServiceName")
    public String serviceName;

    // The type of the framework.
    @NameInMap("ServiceType")
    public String serviceType;

    public static GetServiceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListRequest self = new GetServiceListRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetServiceListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetServiceListRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetServiceListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetServiceListRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetServiceListRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
