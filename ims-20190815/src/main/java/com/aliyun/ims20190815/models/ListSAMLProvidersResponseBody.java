// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListSAMLProvidersResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The `marker`. This parameter is returned only if the value of `IsTruncated` is `true`. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the IdP.</p>
     */
    @NameInMap("SAMLProviders")
    public ListSAMLProvidersResponseBodySAMLProviders SAMLProviders;

    public static ListSAMLProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSAMLProvidersResponseBody self = new ListSAMLProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSAMLProvidersResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListSAMLProvidersResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListSAMLProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSAMLProvidersResponseBody setSAMLProviders(ListSAMLProvidersResponseBodySAMLProviders SAMLProviders) {
        this.SAMLProviders = SAMLProviders;
        return this;
    }
    public ListSAMLProvidersResponseBodySAMLProviders getSAMLProviders() {
        return this.SAMLProviders;
    }

    public static class ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the IdP.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the IdP.</p>
         */
        @NameInMap("SAMLProviderName")
        public String SAMLProviderName;

        /**
         * <p>The update time.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider build(java.util.Map<String, ?> map) throws Exception {
            ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider self = new ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider();
            return TeaModel.build(map, self);
        }

        public ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider setSAMLProviderName(String SAMLProviderName) {
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        public ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

    public static class ListSAMLProvidersResponseBodySAMLProviders extends TeaModel {
        @NameInMap("SAMLProvider")
        public java.util.List<ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider> SAMLProvider;

        public static ListSAMLProvidersResponseBodySAMLProviders build(java.util.Map<String, ?> map) throws Exception {
            ListSAMLProvidersResponseBodySAMLProviders self = new ListSAMLProvidersResponseBodySAMLProviders();
            return TeaModel.build(map, self);
        }

        public ListSAMLProvidersResponseBodySAMLProviders setSAMLProvider(java.util.List<ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider> SAMLProvider) {
            this.SAMLProvider = SAMLProvider;
            return this;
        }
        public java.util.List<ListSAMLProvidersResponseBodySAMLProvidersSAMLProvider> getSAMLProvider() {
            return this.SAMLProvider;
        }

    }

}
