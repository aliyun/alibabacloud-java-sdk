// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetSAMLServiceProviderInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SAMLServiceProviderInfo")
    public GetSAMLServiceProviderInfoResponseBodySAMLServiceProviderInfo SAMLServiceProviderInfo;

    public static GetSAMLServiceProviderInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSAMLServiceProviderInfoResponseBody self = new GetSAMLServiceProviderInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSAMLServiceProviderInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSAMLServiceProviderInfoResponseBody setSAMLServiceProviderInfo(GetSAMLServiceProviderInfoResponseBodySAMLServiceProviderInfo SAMLServiceProviderInfo) {
        this.SAMLServiceProviderInfo = SAMLServiceProviderInfo;
        return this;
    }
    public GetSAMLServiceProviderInfoResponseBodySAMLServiceProviderInfo getSAMLServiceProviderInfo() {
        return this.SAMLServiceProviderInfo;
    }

    public static class GetSAMLServiceProviderInfoResponseBodySAMLServiceProviderInfo extends TeaModel {
        @NameInMap("ACSURL")
        public String ACSURL;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("SPMetadataDocument")
        public String SPMetadataDocument;

        @NameInMap("UserPoolId")
        public String userPoolId;

        public static GetSAMLServiceProviderInfoResponseBodySAMLServiceProviderInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSAMLServiceProviderInfoResponseBodySAMLServiceProviderInfo self = new GetSAMLServiceProviderInfoResponseBodySAMLServiceProviderInfo();
            return TeaModel.build(map, self);
        }

        public GetSAMLServiceProviderInfoResponseBodySAMLServiceProviderInfo setACSURL(String ACSURL) {
            this.ACSURL = ACSURL;
            return this;
        }
        public String getACSURL() {
            return this.ACSURL;
        }

        public GetSAMLServiceProviderInfoResponseBodySAMLServiceProviderInfo setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetSAMLServiceProviderInfoResponseBodySAMLServiceProviderInfo setSPMetadataDocument(String SPMetadataDocument) {
            this.SPMetadataDocument = SPMetadataDocument;
            return this;
        }
        public String getSPMetadataDocument() {
            return this.SPMetadataDocument;
        }

        public GetSAMLServiceProviderInfoResponseBodySAMLServiceProviderInfo setUserPoolId(String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public String getUserPoolId() {
            return this.userPoolId;
        }

    }

}
