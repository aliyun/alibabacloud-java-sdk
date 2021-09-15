// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetAppSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetAppSecretResponseBodyData data;

    public static GetAppSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppSecretResponseBody self = new GetAppSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppSecretResponseBody setData(GetAppSecretResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppSecretResponseBodyData getData() {
        return this.data;
    }

    public static class GetAppSecretResponseBodyData extends TeaModel {
        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("AppId")
        public String appId;

        public static GetAppSecretResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppSecretResponseBodyData self = new GetAppSecretResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppSecretResponseBodyData setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public GetAppSecretResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
