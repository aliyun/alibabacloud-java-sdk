// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListSAMLProvidersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsTruncated")
    @Validation(required = true)
    public Boolean isTruncated;

    @NameInMap("Marker")
    @Validation(required = true)
    public String marker;

    @NameInMap("SAMLProviders")
    @Validation(required = true)
    public ListSAMLProvidersResponseSAMLProviders SAMLProviders;

    public static ListSAMLProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSAMLProvidersResponse self = new ListSAMLProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListSAMLProvidersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSAMLProvidersResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListSAMLProvidersResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListSAMLProvidersResponse setSAMLProviders(ListSAMLProvidersResponseSAMLProviders SAMLProviders) {
        this.SAMLProviders = SAMLProviders;
        return this;
    }
    public ListSAMLProvidersResponseSAMLProviders getSAMLProviders() {
        return this.SAMLProviders;
    }

    public static class ListSAMLProvidersResponseSAMLProvidersSAMLProvider extends TeaModel {
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

        public static ListSAMLProvidersResponseSAMLProvidersSAMLProvider build(java.util.Map<String, ?> map) throws Exception {
            ListSAMLProvidersResponseSAMLProvidersSAMLProvider self = new ListSAMLProvidersResponseSAMLProvidersSAMLProvider();
            return TeaModel.build(map, self);
        }

        public ListSAMLProvidersResponseSAMLProvidersSAMLProvider setSAMLProviderName(String SAMLProviderName) {
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        public ListSAMLProvidersResponseSAMLProvidersSAMLProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListSAMLProvidersResponseSAMLProvidersSAMLProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSAMLProvidersResponseSAMLProvidersSAMLProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListSAMLProvidersResponseSAMLProvidersSAMLProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

    public static class ListSAMLProvidersResponseSAMLProviders extends TeaModel {
        @NameInMap("SAMLProvider")
        @Validation(required = true)
        public java.util.List<ListSAMLProvidersResponseSAMLProvidersSAMLProvider> SAMLProvider;

        public static ListSAMLProvidersResponseSAMLProviders build(java.util.Map<String, ?> map) throws Exception {
            ListSAMLProvidersResponseSAMLProviders self = new ListSAMLProvidersResponseSAMLProviders();
            return TeaModel.build(map, self);
        }

        public ListSAMLProvidersResponseSAMLProviders setSAMLProvider(java.util.List<ListSAMLProvidersResponseSAMLProvidersSAMLProvider> SAMLProvider) {
            this.SAMLProvider = SAMLProvider;
            return this;
        }
        public java.util.List<ListSAMLProvidersResponseSAMLProvidersSAMLProvider> getSAMLProvider() {
            return this.SAMLProvider;
        }

    }

}
