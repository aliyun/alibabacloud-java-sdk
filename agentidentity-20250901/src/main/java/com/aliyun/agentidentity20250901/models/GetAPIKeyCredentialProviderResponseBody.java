// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetAPIKeyCredentialProviderResponseBody extends TeaModel {
    @NameInMap("APIKeyCredentialProvider")
    public GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider APIKeyCredentialProvider;

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
        @NameInMap("APIKeyCredentialProviderName")
        public String APIKeyCredentialProviderName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CredentialProviderArn")
        public String credentialProviderArn;

        @NameInMap("Description")
        public String description;

        @NameInMap("TokenVaultName")
        public String tokenVaultName;

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

        public GetAPIKeyCredentialProviderResponseBodyAPIKeyCredentialProvider setTokenVaultName(String tokenVaultName) {
            this.tokenVaultName = tokenVaultName;
            return this;
        }
        public String getTokenVaultName() {
            return this.tokenVaultName;
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
