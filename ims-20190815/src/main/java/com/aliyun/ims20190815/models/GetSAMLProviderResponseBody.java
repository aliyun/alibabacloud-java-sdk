// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetSAMLProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SAMLProvider")
    public GetSAMLProviderResponseBodySAMLProvider SAMLProvider;

    public static GetSAMLProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSAMLProviderResponseBody self = new GetSAMLProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSAMLProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSAMLProviderResponseBody setSAMLProvider(GetSAMLProviderResponseBodySAMLProvider SAMLProvider) {
        this.SAMLProvider = SAMLProvider;
        return this;
    }
    public GetSAMLProviderResponseBodySAMLProvider getSAMLProvider() {
        return this.SAMLProvider;
    }

    public static class GetSAMLProviderResponseBodySAMLProvider extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("EncodedSAMLMetadataDocument")
        public String encodedSAMLMetadataDocument;

        @NameInMap("SAMLProviderName")
        public String SAMLProviderName;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetSAMLProviderResponseBodySAMLProvider build(java.util.Map<String, ?> map) throws Exception {
            GetSAMLProviderResponseBodySAMLProvider self = new GetSAMLProviderResponseBodySAMLProvider();
            return TeaModel.build(map, self);
        }

        public GetSAMLProviderResponseBodySAMLProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public GetSAMLProviderResponseBodySAMLProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetSAMLProviderResponseBodySAMLProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSAMLProviderResponseBodySAMLProvider setEncodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
            this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
            return this;
        }
        public String getEncodedSAMLMetadataDocument() {
            return this.encodedSAMLMetadataDocument;
        }

        public GetSAMLProviderResponseBodySAMLProvider setSAMLProviderName(String SAMLProviderName) {
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        public GetSAMLProviderResponseBodySAMLProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
