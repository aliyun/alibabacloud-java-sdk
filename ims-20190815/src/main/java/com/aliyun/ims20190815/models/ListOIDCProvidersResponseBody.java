// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListOIDCProvidersResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The <code>marker</code>. This parameter is returned only if the value of <code>IsTruncated</code> is <code>true</code>. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.``</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    @NameInMap("OIDCProviders")
    public ListOIDCProvidersResponseBodyOIDCProviders OIDCProviders;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D2148337-B86A-57F0-8B31-EB7BE0125226</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListOIDCProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOIDCProvidersResponseBody self = new ListOIDCProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOIDCProvidersResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListOIDCProvidersResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListOIDCProvidersResponseBody setOIDCProviders(ListOIDCProvidersResponseBodyOIDCProviders OIDCProviders) {
        this.OIDCProviders = OIDCProviders;
        return this;
    }
    public ListOIDCProvidersResponseBodyOIDCProviders getOIDCProviders() {
        return this.OIDCProviders;
    }

    public ListOIDCProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("ClientIds")
        public String clientIds;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Fingerprints")
        public String fingerprints;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IssuanceLimitTime")
        public Long issuanceLimitTime;

        @NameInMap("IssuerUrl")
        public String issuerUrl;

        @NameInMap("OIDCProviderName")
        public String OIDCProviderName;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider build(java.util.Map<String, ?> map) throws Exception {
            ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider self = new ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider();
            return TeaModel.build(map, self);
        }

        public ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider setClientIds(String clientIds) {
            this.clientIds = clientIds;
            return this;
        }
        public String getClientIds() {
            return this.clientIds;
        }

        public ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider setFingerprints(String fingerprints) {
            this.fingerprints = fingerprints;
            return this;
        }
        public String getFingerprints() {
            return this.fingerprints;
        }

        public ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider setIssuanceLimitTime(Long issuanceLimitTime) {
            this.issuanceLimitTime = issuanceLimitTime;
            return this;
        }
        public Long getIssuanceLimitTime() {
            return this.issuanceLimitTime;
        }

        public ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider setIssuerUrl(String issuerUrl) {
            this.issuerUrl = issuerUrl;
            return this;
        }
        public String getIssuerUrl() {
            return this.issuerUrl;
        }

        public ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider setOIDCProviderName(String OIDCProviderName) {
            this.OIDCProviderName = OIDCProviderName;
            return this;
        }
        public String getOIDCProviderName() {
            return this.OIDCProviderName;
        }

        public ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

    public static class ListOIDCProvidersResponseBodyOIDCProviders extends TeaModel {
        @NameInMap("OIDCProvider")
        public java.util.List<ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider> OIDCProvider;

        public static ListOIDCProvidersResponseBodyOIDCProviders build(java.util.Map<String, ?> map) throws Exception {
            ListOIDCProvidersResponseBodyOIDCProviders self = new ListOIDCProvidersResponseBodyOIDCProviders();
            return TeaModel.build(map, self);
        }

        public ListOIDCProvidersResponseBodyOIDCProviders setOIDCProvider(java.util.List<ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider> OIDCProvider) {
            this.OIDCProvider = OIDCProvider;
            return this;
        }
        public java.util.List<ListOIDCProvidersResponseBodyOIDCProvidersOIDCProvider> getOIDCProvider() {
            return this.OIDCProvider;
        }

    }

}
