// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class App extends TeaModel {
    // appKey
    @NameInMap("AppKey")
    public String appKey;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 请求时间戳(ms)
    @NameInMap("RequestTs")
    public Long requestTs;

    // 签名
    @NameInMap("Sign")
    public String sign;

    // 签名类型
    @NameInMap("SignType")
    public String signType;

    public static App build(java.util.Map<String, ?> map) throws Exception {
        App self = new App();
        return TeaModel.build(map, self);
    }

    public App setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public App setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public App setRequestTs(Long requestTs) {
        this.requestTs = requestTs;
        return this;
    }
    public Long getRequestTs() {
        return this.requestTs;
    }

    public App setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public App setSignType(String signType) {
        this.signType = signType;
        return this;
    }
    public String getSignType() {
        return this.signType;
    }

}
