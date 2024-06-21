// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceListRequest extends TeaModel {
    /**
     * <p>The language of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx@xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.xxx</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The type of the framework.</p>
     * 
     * <strong>example:</strong>
     * <p>dubbo</p>
     */
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
