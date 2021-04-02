// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateSAMLProviderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SAMLProvider")
    @Validation(required = true)
    public UpdateSAMLProviderResponseSAMLProvider SAMLProvider;

    public static UpdateSAMLProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSAMLProviderResponse self = new UpdateSAMLProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSAMLProviderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSAMLProviderResponse setSAMLProvider(UpdateSAMLProviderResponseSAMLProvider SAMLProvider) {
        this.SAMLProvider = SAMLProvider;
        return this;
    }
    public UpdateSAMLProviderResponseSAMLProvider getSAMLProvider() {
        return this.SAMLProvider;
    }

    public static class UpdateSAMLProviderResponseSAMLProvider extends TeaModel {
        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("SAMLProviderName")
        @Validation(required = true)
        public String SAMLProviderName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static UpdateSAMLProviderResponseSAMLProvider build(java.util.Map<String, ?> map) throws Exception {
            UpdateSAMLProviderResponseSAMLProvider self = new UpdateSAMLProviderResponseSAMLProvider();
            return TeaModel.build(map, self);
        }

        public UpdateSAMLProviderResponseSAMLProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public UpdateSAMLProviderResponseSAMLProvider setSAMLProviderName(String SAMLProviderName) {
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        public UpdateSAMLProviderResponseSAMLProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateSAMLProviderResponseSAMLProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public UpdateSAMLProviderResponseSAMLProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
