// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetAppSecretResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAppSecretResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppSecretResponseBody self = new GetAppSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppSecretResponseBody setData(GetAppSecretResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppSecretResponseBodyData getData() {
        return this.data;
    }

    public GetAppSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppSecretResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppSecret")
        public String appSecret;

        public static GetAppSecretResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppSecretResponseBodyData self = new GetAppSecretResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppSecretResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppSecretResponseBodyData setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

    }

}
