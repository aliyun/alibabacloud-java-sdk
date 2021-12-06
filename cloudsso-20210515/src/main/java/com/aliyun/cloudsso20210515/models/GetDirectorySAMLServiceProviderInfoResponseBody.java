// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectorySAMLServiceProviderInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SAMLServiceProvider")
    public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider SAMLServiceProvider;

    public static GetDirectorySAMLServiceProviderInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDirectorySAMLServiceProviderInfoResponseBody self = new GetDirectorySAMLServiceProviderInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDirectorySAMLServiceProviderInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDirectorySAMLServiceProviderInfoResponseBody setSAMLServiceProvider(GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider SAMLServiceProvider) {
        this.SAMLServiceProvider = SAMLServiceProvider;
        return this;
    }
    public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider getSAMLServiceProvider() {
        return this.SAMLServiceProvider;
    }

    public static class GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider extends TeaModel {
        @NameInMap("AcsUrl")
        public String acsUrl;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("EncodedMetadataDocument")
        public String encodedMetadataDocument;

        @NameInMap("EntityId")
        public String entityId;

        public static GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider build(java.util.Map<String, ?> map) throws Exception {
            GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider self = new GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider();
            return TeaModel.build(map, self);
        }

        public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider setAcsUrl(String acsUrl) {
            this.acsUrl = acsUrl;
            return this;
        }
        public String getAcsUrl() {
            return this.acsUrl;
        }

        public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider setEncodedMetadataDocument(String encodedMetadataDocument) {
            this.encodedMetadataDocument = encodedMetadataDocument;
            return this;
        }
        public String getEncodedMetadataDocument() {
            return this.encodedMetadataDocument;
        }

        public GetDirectorySAMLServiceProviderInfoResponseBodySAMLServiceProvider setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

    }

}
