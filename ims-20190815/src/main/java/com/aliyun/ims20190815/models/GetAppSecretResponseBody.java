// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAppSecretResponseBody extends TeaModel {
    @NameInMap("AppSecret")
    public GetAppSecretResponseBodyAppSecret appSecret;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAppSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppSecretResponseBody self = new GetAppSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppSecretResponseBody setAppSecret(GetAppSecretResponseBodyAppSecret appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public GetAppSecretResponseBodyAppSecret getAppSecret() {
        return this.appSecret;
    }

    public GetAppSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAppSecretResponseBodyAppSecret extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppSecretId")
        public String appSecretId;

        @NameInMap("AppSecretValue")
        public String appSecretValue;

        @NameInMap("CreateDate")
        public String createDate;

        public static GetAppSecretResponseBodyAppSecret build(java.util.Map<String, ?> map) throws Exception {
            GetAppSecretResponseBodyAppSecret self = new GetAppSecretResponseBodyAppSecret();
            return TeaModel.build(map, self);
        }

        public GetAppSecretResponseBodyAppSecret setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppSecretResponseBodyAppSecret setAppSecretId(String appSecretId) {
            this.appSecretId = appSecretId;
            return this;
        }
        public String getAppSecretId() {
            return this.appSecretId;
        }

        public GetAppSecretResponseBodyAppSecret setAppSecretValue(String appSecretValue) {
            this.appSecretValue = appSecretValue;
            return this;
        }
        public String getAppSecretValue() {
            return this.appSecretValue;
        }

        public GetAppSecretResponseBodyAppSecret setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
