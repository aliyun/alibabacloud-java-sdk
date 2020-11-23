// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListAppSecretIdsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppSecrets")
    @Validation(required = true)
    public ListAppSecretIdsResponseAppSecrets appSecrets;

    public static ListAppSecretIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppSecretIdsResponse self = new ListAppSecretIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppSecretIdsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppSecretIdsResponse setAppSecrets(ListAppSecretIdsResponseAppSecrets appSecrets) {
        this.appSecrets = appSecrets;
        return this;
    }
    public ListAppSecretIdsResponseAppSecrets getAppSecrets() {
        return this.appSecrets;
    }

    public static class ListAppSecretIdsResponseAppSecretsAppSecret extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppSecretId")
        @Validation(required = true)
        public String appSecretId;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static ListAppSecretIdsResponseAppSecretsAppSecret build(java.util.Map<String, ?> map) throws Exception {
            ListAppSecretIdsResponseAppSecretsAppSecret self = new ListAppSecretIdsResponseAppSecretsAppSecret();
            return TeaModel.build(map, self);
        }

        public ListAppSecretIdsResponseAppSecretsAppSecret setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppSecretIdsResponseAppSecretsAppSecret setAppSecretId(String appSecretId) {
            this.appSecretId = appSecretId;
            return this;
        }
        public String getAppSecretId() {
            return this.appSecretId;
        }

        public ListAppSecretIdsResponseAppSecretsAppSecret setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

    public static class ListAppSecretIdsResponseAppSecrets extends TeaModel {
        @NameInMap("AppSecret")
        @Validation(required = true)
        public java.util.List<ListAppSecretIdsResponseAppSecretsAppSecret> appSecret;

        public static ListAppSecretIdsResponseAppSecrets build(java.util.Map<String, ?> map) throws Exception {
            ListAppSecretIdsResponseAppSecrets self = new ListAppSecretIdsResponseAppSecrets();
            return TeaModel.build(map, self);
        }

        public ListAppSecretIdsResponseAppSecrets setAppSecret(java.util.List<ListAppSecretIdsResponseAppSecretsAppSecret> appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public java.util.List<ListAppSecretIdsResponseAppSecretsAppSecret> getAppSecret() {
            return this.appSecret;
        }

    }

}
