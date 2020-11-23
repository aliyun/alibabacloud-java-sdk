// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAppSecretResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppSecret")
    @Validation(required = true)
    public GetAppSecretResponseAppSecret appSecret;

    public static GetAppSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSecretResponse self = new GetAppSecretResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSecretResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppSecretResponse setAppSecret(GetAppSecretResponseAppSecret appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public GetAppSecretResponseAppSecret getAppSecret() {
        return this.appSecret;
    }

    public static class GetAppSecretResponseAppSecret extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppSecretId")
        @Validation(required = true)
        public String appSecretId;

        @NameInMap("AppSecretValue")
        @Validation(required = true)
        public String appSecretValue;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static GetAppSecretResponseAppSecret build(java.util.Map<String, ?> map) throws Exception {
            GetAppSecretResponseAppSecret self = new GetAppSecretResponseAppSecret();
            return TeaModel.build(map, self);
        }

        public GetAppSecretResponseAppSecret setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppSecretResponseAppSecret setAppSecretId(String appSecretId) {
            this.appSecretId = appSecretId;
            return this;
        }
        public String getAppSecretId() {
            return this.appSecretId;
        }

        public GetAppSecretResponseAppSecret setAppSecretValue(String appSecretValue) {
            this.appSecretValue = appSecretValue;
            return this;
        }
        public String getAppSecretValue() {
            return this.appSecretValue;
        }

        public GetAppSecretResponseAppSecret setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
