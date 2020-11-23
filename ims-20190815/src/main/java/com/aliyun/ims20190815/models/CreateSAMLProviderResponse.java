// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateSAMLProviderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SAMLProvider")
    @Validation(required = true)
    public CreateSAMLProviderResponseSAMLProvider SAMLProvider;

    public static CreateSAMLProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSAMLProviderResponse self = new CreateSAMLProviderResponse();
        return TeaModel.build(map, self);
    }

    public CreateSAMLProviderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSAMLProviderResponse setSAMLProvider(CreateSAMLProviderResponseSAMLProvider SAMLProvider) {
        this.SAMLProvider = SAMLProvider;
        return this;
    }
    public CreateSAMLProviderResponseSAMLProvider getSAMLProvider() {
        return this.SAMLProvider;
    }

    public static class CreateSAMLProviderResponseSAMLProvider extends TeaModel {
        @NameInMap("SAMLProviderName")
        @Validation(required = true)
        public String SAMLProviderName;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        public static CreateSAMLProviderResponseSAMLProvider build(java.util.Map<String, ?> map) throws Exception {
            CreateSAMLProviderResponseSAMLProvider self = new CreateSAMLProviderResponseSAMLProvider();
            return TeaModel.build(map, self);
        }

        public CreateSAMLProviderResponseSAMLProvider setSAMLProviderName(String SAMLProviderName) {
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        public CreateSAMLProviderResponseSAMLProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public CreateSAMLProviderResponseSAMLProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSAMLProviderResponseSAMLProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateSAMLProviderResponseSAMLProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
