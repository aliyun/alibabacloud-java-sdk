// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateAPIKeyCredentialProviderResponseBody extends TeaModel {
    @NameInMap("APIKeyCredentialProvider")
    public CreateAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider APIKeyCredentialProvider;

    /**
     * <strong>example:</strong>
     * <p>0B447F15-7037-512D-8EFC-A4188FC9E9E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAPIKeyCredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAPIKeyCredentialProviderResponseBody self = new CreateAPIKeyCredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAPIKeyCredentialProviderResponseBody setAPIKeyCredentialProvider(CreateAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider APIKeyCredentialProvider) {
        this.APIKeyCredentialProvider = APIKeyCredentialProvider;
        return this;
    }
    public CreateAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider getAPIKeyCredentialProvider() {
        return this.APIKeyCredentialProvider;
    }

    public CreateAPIKeyCredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>api-key-dash-scope</p>
         */
        @NameInMap("APIKeyCredentialProviderName")
        public String APIKeyCredentialProviderName;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default/apikeycredentialprovider/api-key-dash-scope</p>
         */
        @NameInMap("CredentialProviderArn")
        public String credentialProviderArn;

        /**
         * <strong>example:</strong>
         * <p>example provider</p>
         */
        @NameInMap("Description")
        public String description;

        public static CreateAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider build(java.util.Map<String, ?> map) throws Exception {
            CreateAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider self = new CreateAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider();
            return TeaModel.build(map, self);
        }

        public CreateAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider setAPIKeyCredentialProviderName(String APIKeyCredentialProviderName) {
            this.APIKeyCredentialProviderName = APIKeyCredentialProviderName;
            return this;
        }
        public String getAPIKeyCredentialProviderName() {
            return this.APIKeyCredentialProviderName;
        }

        public CreateAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public CreateAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
