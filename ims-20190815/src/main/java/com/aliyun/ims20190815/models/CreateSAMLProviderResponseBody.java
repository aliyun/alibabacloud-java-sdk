// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateSAMLProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("SAMLProviderName")
        public String SAMLProviderName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Arn")
        public String arn;

        public static CreateSAMLProviderResponseBodySAMLProvider build(java.util.Map<String, ?> map) throws Exception {
            CreateSAMLProviderResponseBodySAMLProvider self = new CreateSAMLProviderResponseBodySAMLProvider();
            return TeaModel.build(map, self);
        }

        public CreateSAMLProviderResponseBodySAMLProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
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

        public CreateSAMLProviderResponseBodySAMLProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateSAMLProviderResponseBodySAMLProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

}
