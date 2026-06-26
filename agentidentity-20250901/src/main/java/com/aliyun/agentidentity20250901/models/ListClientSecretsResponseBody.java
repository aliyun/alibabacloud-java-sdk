// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListClientSecretsResponseBody extends TeaModel {
    @NameInMap("ClientSecrets")
    public java.util.List<ListClientSecretsResponseBodyClientSecrets> clientSecrets;

    @NameInMap("RequestId")
    public String requestId;

    public static ListClientSecretsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientSecretsResponseBody self = new ListClientSecretsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientSecretsResponseBody setClientSecrets(java.util.List<ListClientSecretsResponseBodyClientSecrets> clientSecrets) {
        this.clientSecrets = clientSecrets;
        return this;
    }
    public java.util.List<ListClientSecretsResponseBodyClientSecrets> getClientSecrets() {
        return this.clientSecrets;
    }

    public ListClientSecretsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClientSecretsResponseBodyClientSecrets extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClientName")
        public String clientName;

        @NameInMap("ClientSecretId")
        public String clientSecretId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UserPoolName")
        public String userPoolName;

        public static ListClientSecretsResponseBodyClientSecrets build(java.util.Map<String, ?> map) throws Exception {
            ListClientSecretsResponseBodyClientSecrets self = new ListClientSecretsResponseBodyClientSecrets();
            return TeaModel.build(map, self);
        }

        public ListClientSecretsResponseBodyClientSecrets setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListClientSecretsResponseBodyClientSecrets setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ListClientSecretsResponseBodyClientSecrets setClientSecretId(String clientSecretId) {
            this.clientSecretId = clientSecretId;
            return this;
        }
        public String getClientSecretId() {
            return this.clientSecretId;
        }

        public ListClientSecretsResponseBodyClientSecrets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClientSecretsResponseBodyClientSecrets setUserPoolName(String userPoolName) {
            this.userPoolName = userPoolName;
            return this;
        }
        public String getUserPoolName() {
            return this.userPoolName;
        }

    }

}
