// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateSAMLProviderResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A95A763D-F6B7-5242-83EB-AB45CE67F358</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the IdP.</p>
     */
    @NameInMap("SAMLProvider")
    public CreateSAMLProviderResponseBodySAMLProvider SAMLProvider;

    public static CreateSAMLProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSAMLProviderResponseBody self = new CreateSAMLProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSAMLProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSAMLProviderResponseBody setSAMLProvider(CreateSAMLProviderResponseBodySAMLProvider SAMLProvider) {
        this.SAMLProvider = SAMLProvider;
        return this;
    }
    public CreateSAMLProviderResponseBodySAMLProvider getSAMLProvider() {
        return this.SAMLProvider;
    }

    public static class CreateSAMLProviderResponseBodySAMLProvider extends TeaModel {
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

        public static CreateSAMLProviderResponseBodySAMLProvider build(java.util.Map<String, ?> map) throws Exception {
            CreateSAMLProviderResponseBodySAMLProvider self = new CreateSAMLProviderResponseBodySAMLProvider();
            return TeaModel.build(map, self);
        }

        public CreateSAMLProviderResponseBodySAMLProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateSAMLProviderResponseBodySAMLProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateSAMLProviderResponseBodySAMLProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSAMLProviderResponseBodySAMLProvider setSAMLProviderName(String SAMLProviderName) {
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        public CreateSAMLProviderResponseBodySAMLProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
