// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateClientSecretResponseBody extends TeaModel {
    @NameInMap("ClientSecret")
    public CreateClientSecretResponseBodyClientSecret clientSecret;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateClientSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClientSecretResponseBody self = new CreateClientSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClientSecretResponseBody setClientSecret(CreateClientSecretResponseBodyClientSecret clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public CreateClientSecretResponseBodyClientSecret getClientSecret() {
        return this.clientSecret;
    }

    public CreateClientSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateClientSecretResponseBodyClientSecret extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClientName")
        public String clientName;

        @NameInMap("ClientSecretId")
        public String clientSecretId;

        @NameInMap("ClientSecretValue")
        public String clientSecretValue;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UserPoolName")
        public String userPoolName;

        public static CreateClientSecretResponseBodyClientSecret build(java.util.Map<String, ?> map) throws Exception {
            CreateClientSecretResponseBodyClientSecret self = new CreateClientSecretResponseBodyClientSecret();
            return TeaModel.build(map, self);
        }

        public CreateClientSecretResponseBodyClientSecret setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public CreateClientSecretResponseBodyClientSecret setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public CreateClientSecretResponseBodyClientSecret setClientSecretId(String clientSecretId) {
            this.clientSecretId = clientSecretId;
            return this;
        }
        public String getClientSecretId() {
            return this.clientSecretId;
        }

        public CreateClientSecretResponseBodyClientSecret setClientSecretValue(String clientSecretValue) {
            this.clientSecretValue = clientSecretValue;
            return this;
        }
        public String getClientSecretValue() {
            return this.clientSecretValue;
        }

        public CreateClientSecretResponseBodyClientSecret setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateClientSecretResponseBodyClientSecret setUserPoolName(String userPoolName) {
            this.userPoolName = userPoolName;
            return this;
        }
        public String getUserPoolName() {
            return this.userPoolName;
        }

    }

}
