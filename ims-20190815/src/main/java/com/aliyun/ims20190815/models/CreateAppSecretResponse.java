// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateAppSecretResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppSecret")
    @Validation(required = true)
    public CreateAppSecretResponseAppSecret appSecret;

    public static CreateAppSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSecretResponse self = new CreateAppSecretResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppSecretResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppSecretResponse setAppSecret(CreateAppSecretResponseAppSecret appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public CreateAppSecretResponseAppSecret getAppSecret() {
        return this.appSecret;
    }

    public static class CreateAppSecretResponseAppSecret extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppSecretValue")
        @Validation(required = true)
        public String appSecretValue;

        @NameInMap("AppSecretId")
        @Validation(required = true)
        public String appSecretId;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static CreateAppSecretResponseAppSecret build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSecretResponseAppSecret self = new CreateAppSecretResponseAppSecret();
            return TeaModel.build(map, self);
        }

        public CreateAppSecretResponseAppSecret setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateAppSecretResponseAppSecret setAppSecretValue(String appSecretValue) {
            this.appSecretValue = appSecretValue;
            return this;
        }
        public String getAppSecretValue() {
            return this.appSecretValue;
        }

        public CreateAppSecretResponseAppSecret setAppSecretId(String appSecretId) {
            this.appSecretId = appSecretId;
            return this;
        }
        public String getAppSecretId() {
            return this.appSecretId;
        }

        public CreateAppSecretResponseAppSecret setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
