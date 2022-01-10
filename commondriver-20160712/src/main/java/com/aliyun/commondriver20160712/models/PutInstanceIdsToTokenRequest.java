// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class PutInstanceIdsToTokenRequest extends TeaModel {
    // commodityCode
    @NameInMap("CommodityCode")
    public String commodityCode;

    // fromApp
    @NameInMap("FromApp")
    public String fromApp;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // token
    @NameInMap("Token")
    public String token;

    // instanceIdStr
    @NameInMap("body")
    public String body;

    public static PutInstanceIdsToTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        PutInstanceIdsToTokenRequest self = new PutInstanceIdsToTokenRequest();
        return TeaModel.build(map, self);
    }

    public PutInstanceIdsToTokenRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public PutInstanceIdsToTokenRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public PutInstanceIdsToTokenRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutInstanceIdsToTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public PutInstanceIdsToTokenRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
