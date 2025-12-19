// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetAPIKeyCredentialProviderResponseBody extends TeaModel {
    @NameInMap("APIKeyCredentialProvider")
    public GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider APIKeyCredentialProvider;

    /**
     * <strong>example:</strong>
     * <p>76BF2570-76F5-5093-87CE-0918DD85752C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAPIKeyCredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAPIKeyCredentialProviderResponseBody self = new GetAPIKeyCredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAPIKeyCredentialProviderResponseBody setAPIKeyCredentialProvider(GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider APIKeyCredentialProvider) {
        this.APIKeyCredentialProvider = APIKeyCredentialProvider;
        return this;
    }
    public GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider getAPIKeyCredentialProvider() {
        return this.APIKeyCredentialProvider;
    }

    public GetAPIKeyCredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider build(java.util.Map<String, ?> map) throws Exception {
            GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider self = new GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider();
            return TeaModel.build(map, self);
        }

        public GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider setAPIKeyCredentialProviderName(String APIKeyCredentialProviderName) {
            this.APIKeyCredentialProviderName = APIKeyCredentialProviderName;
            return this;
        }
        public String getAPIKeyCredentialProviderName() {
            return this.APIKeyCredentialProviderName;
        }

        public GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
