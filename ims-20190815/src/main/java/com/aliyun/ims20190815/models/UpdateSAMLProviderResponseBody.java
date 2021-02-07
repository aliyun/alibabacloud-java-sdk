// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateSAMLProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

        public static UpdateSAMLProviderResponseBodySAMLProvider build(java.util.Map<String, ?> map) throws Exception {
            UpdateSAMLProviderResponseBodySAMLProvider self = new UpdateSAMLProviderResponseBodySAMLProvider();
            return TeaModel.build(map, self);
        }

        public UpdateSAMLProviderResponseBodySAMLProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
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

        public UpdateSAMLProviderResponseBodySAMLProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateSAMLProviderResponseBodySAMLProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

    }

}
