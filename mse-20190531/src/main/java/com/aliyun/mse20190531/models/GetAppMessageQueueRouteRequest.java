// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetAppMessageQueueRouteRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the application.
    @NameInMap("AppId")
    public String appId;

    // The region where the cluster resides. Examples:
    // 
    // *   `cn-hangzhou`: China (Hangzhou)
    // *   `cn-beijing`: China (Beijing)
    // *   `cn-shanghai`: China (Shanghai)
    // *   `cn-zhangjiakou`: China (Zhangjiakou)
    // *   `cn-shenzhen`: China (Shenzhen)
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

    public GetAppMessageQueueRouteRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
