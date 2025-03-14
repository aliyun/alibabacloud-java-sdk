// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateSAMLProviderResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E5EDDFD2-3654-4F9F-9780-4AE7D81823EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the IdP.</p>
     */
    @NameInMap("SAMLProvider")
    public UpdateSAMLProviderResponseBodySAMLProvider SAMLProvider;

    public static UpdateSAMLProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSAMLProviderResponseBody self = new UpdateSAMLProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSAMLProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSAMLProviderResponseBody setSAMLProvider(UpdateSAMLProviderResponseBodySAMLProvider SAMLProvider) {
        this.SAMLProvider = SAMLProvider;
        return this;
    }
    public UpdateSAMLProviderResponseBodySAMLProvider getSAMLProvider() {
        return this.SAMLProvider;
    }

    public static class UpdateSAMLProviderResponseBodySAMLProvider extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::177242285274****:saml-provider/test-provider</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The point in time at which the IdP was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-22T02:37:05Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a new provider.</p>
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
         * <p>The point in time at which the information about the IdP was modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-22T02:51:20Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static UpdateSAMLProviderResponseBodySAMLProvider build(java.util.Map<String, ?> map) throws Exception {
            UpdateSAMLProviderResponseBodySAMLProvider self = new UpdateSAMLProviderResponseBodySAMLProvider();
            return TeaModel.build(map, self);
        }

        public UpdateSAMLProviderResponseBodySAMLProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public UpdateSAMLProviderResponseBodySAMLProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateSAMLProviderResponseBodySAMLProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateSAMLProviderResponseBodySAMLProvider setSAMLProviderName(String SAMLProviderName) {
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        public UpdateSAMLProviderResponseBodySAMLProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
