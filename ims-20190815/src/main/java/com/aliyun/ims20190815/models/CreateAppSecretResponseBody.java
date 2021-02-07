// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateAppSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppSecret")
    public CreateAppSecretResponseBodyAppSecret appSecret;

    public static CreateAppSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSecretResponseBody self = new CreateAppSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppSecretResponseBody setAppSecret(CreateAppSecretResponseBodyAppSecret appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public CreateAppSecretResponseBodyAppSecret getAppSecret() {
        return this.appSecret;
    }

    public static class CreateAppSecretResponseBodyAppSecret extends TeaModel {
        @NameInMap("AppSecretValue")
        public String appSecretValue;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppSecretId")
        public String appSecretId;

        @NameInMap("CreateDate")
        public String createDate;

        public static CreateAppSecretResponseBodyAppSecret build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSecretResponseBodyAppSecret self = new CreateAppSecretResponseBodyAppSecret();
            return TeaModel.build(map, self);
        }

        public CreateAppSecretResponseBodyAppSecret setAppSecretValue(String appSecretValue) {
            this.appSecretValue = appSecretValue;
            return this;
        }
        public String getAppSecretValue() {
            return this.appSecretValue;
        }

        public CreateAppSecretResponseBodyAppSecret setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateAppSecretResponseBodyAppSecret setAppSecretId(String appSecretId) {
            this.appSecretId = appSecretId;
            return this;
        }
        public String getAppSecretId() {
            return this.appSecretId;
        }

        public CreateAppSecretResponseBodyAppSecret setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
