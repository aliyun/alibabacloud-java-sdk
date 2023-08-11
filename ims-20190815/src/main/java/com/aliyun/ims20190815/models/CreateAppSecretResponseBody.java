// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateAppSecretResponseBody extends TeaModel {
    /**
     * <p>The information of the application secret.</p>
     */
    @NameInMap("AppSecret")
    public CreateAppSecretResponseBodyAppSecret appSecret;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSecretResponseBody self = new CreateAppSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppSecretResponseBody setAppSecret(CreateAppSecretResponseBodyAppSecret appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public CreateAppSecretResponseBodyAppSecret getAppSecret() {
        return this.appSecret;
    }

    public CreateAppSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAppSecretResponseBodyAppSecret extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the application secret.</p>
         */
        @NameInMap("AppSecretId")
        public String appSecretId;

        /**
         * <p>The content of the application secret. This value can be used as the client secret for open authorization.</p>
         */
        @NameInMap("AppSecretValue")
        public String appSecretValue;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        public static CreateAppSecretResponseBodyAppSecret build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSecretResponseBodyAppSecret self = new CreateAppSecretResponseBodyAppSecret();
            return TeaModel.build(map, self);
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

        public CreateAppSecretResponseBodyAppSecret setAppSecretValue(String appSecretValue) {
            this.appSecretValue = appSecretValue;
            return this;
        }
        public String getAppSecretValue() {
            return this.appSecretValue;
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
