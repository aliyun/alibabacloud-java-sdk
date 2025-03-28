// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetSAMLProviderResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BAADB995-0C7A-476D-B293-7E94568EEDFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the IdP.</p>
     */
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
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::177242285274****:saml-provider/test-provider</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-22T02:37:05Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a provider.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The metadata file, which is Base64 encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>PD94bWwgdmVy****</p>
         */
        @NameInMap("EncodedSAMLMetadataDocument")
        public String encodedSAMLMetadataDocument;

        /**
         * <p>The name of the IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>test-provider</p>
         */
        @NameInMap("SAMLProviderName")
        public String SAMLProviderName;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-22T02:51:20Z</p>
         */
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
