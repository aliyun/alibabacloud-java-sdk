// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListAppSecretIdsResponseBody extends TeaModel {
    /**
     * <p>The details of the application secret.</p>
     */
    @NameInMap("AppSecrets")
    public ListAppSecretIdsResponseBodyAppSecrets appSecrets;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAppSecretIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppSecretIdsResponseBody self = new ListAppSecretIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppSecretIdsResponseBody setAppSecrets(ListAppSecretIdsResponseBodyAppSecrets appSecrets) {
        this.appSecrets = appSecrets;
        return this;
    }
    public ListAppSecretIdsResponseBodyAppSecrets getAppSecrets() {
        return this.appSecrets;
    }

    public ListAppSecretIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAppSecretIdsResponseBodyAppSecretsAppSecret extends TeaModel {
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
         * <p>The creation time.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        public static ListAppSecretIdsResponseBodyAppSecretsAppSecret build(java.util.Map<String, ?> map) throws Exception {
            ListAppSecretIdsResponseBodyAppSecretsAppSecret self = new ListAppSecretIdsResponseBodyAppSecretsAppSecret();
            return TeaModel.build(map, self);
        }

        public ListAppSecretIdsResponseBodyAppSecretsAppSecret setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppSecretIdsResponseBodyAppSecretsAppSecret setAppSecretId(String appSecretId) {
            this.appSecretId = appSecretId;
            return this;
        }
        public String getAppSecretId() {
            return this.appSecretId;
        }

        public ListAppSecretIdsResponseBodyAppSecretsAppSecret setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

    public static class ListAppSecretIdsResponseBodyAppSecrets extends TeaModel {
        @NameInMap("AppSecret")
        public java.util.List<ListAppSecretIdsResponseBodyAppSecretsAppSecret> appSecret;

        public static ListAppSecretIdsResponseBodyAppSecrets build(java.util.Map<String, ?> map) throws Exception {
            ListAppSecretIdsResponseBodyAppSecrets self = new ListAppSecretIdsResponseBodyAppSecrets();
            return TeaModel.build(map, self);
        }

        public ListAppSecretIdsResponseBodyAppSecrets setAppSecret(java.util.List<ListAppSecretIdsResponseBodyAppSecretsAppSecret> appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public java.util.List<ListAppSecretIdsResponseBodyAppSecretsAppSecret> getAppSecret() {
            return this.appSecret;
        }

    }

}
