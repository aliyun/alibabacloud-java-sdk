// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetSAMLProviderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SAMLProvider")
    @Validation(required = true)
    public GetSAMLProviderResponseSAMLProvider SAMLProvider;

    public static GetSAMLProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSAMLProviderResponse self = new GetSAMLProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetSAMLProviderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSAMLProviderResponse setSAMLProvider(GetSAMLProviderResponseSAMLProvider SAMLProvider) {
        this.SAMLProvider = SAMLProvider;
        return this;
    }
    public GetSAMLProviderResponseSAMLProvider getSAMLProvider() {
        return this.SAMLProvider;
    }

    public static class GetSAMLProviderResponseSAMLProvider extends TeaModel {
        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("SAMLProviderName")
        @Validation(required = true)
        public String SAMLProviderName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("EncodedSAMLMetadataDocument")
        @Validation(required = true)
        public String encodedSAMLMetadataDocument;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static GetSAMLProviderResponseSAMLProvider build(java.util.Map<String, ?> map) throws Exception {
            GetSAMLProviderResponseSAMLProvider self = new GetSAMLProviderResponseSAMLProvider();
            return TeaModel.build(map, self);
        }

        public GetSAMLProviderResponseSAMLProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetSAMLProviderResponseSAMLProvider setSAMLProviderName(String SAMLProviderName) {
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        public GetSAMLProviderResponseSAMLProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSAMLProviderResponseSAMLProvider setEncodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
            this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
            return this;
        }
        public String getEncodedSAMLMetadataDocument() {
            return this.encodedSAMLMetadataDocument;
        }

        public GetSAMLProviderResponseSAMLProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public GetSAMLProviderResponseSAMLProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
