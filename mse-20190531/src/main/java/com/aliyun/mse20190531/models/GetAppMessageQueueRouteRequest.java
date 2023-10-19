// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetAppMessageQueueRouteRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The name of the Microservices Engine (MSE) namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region where the instance resides. Examples:</p>
     * <br>
     * <p>*   `cn-hangzhou`: China (Hangzhou)</p>
     * <p>*   `cn-beijing`: China (Beijing)</p>
     * <p>*   `cn-shanghai`: China (Shanghai)</p>
     * <p>*   `cn-zhangjiakou`: China (Zhangjiakou)</p>
     * <p>*   `cn-shenzhen`: China (Shenzhen)</p>
     */
    @NameInMap("Region")
    public String region;

    public static GetAppMessageQueueRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppMessageQueueRouteRequest self = new GetAppMessageQueueRouteRequest();
        return TeaModel.build(map, self);
    }

    public GetAppMessageQueueRouteRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetAppMessageQueueRouteRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppMessageQueueRouteRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppMessageQueueRouteRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetAppMessageQueueRouteRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
