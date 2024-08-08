// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultipartFileUploadInfosResponseBody extends TeaModel {
    @NameInMap("multipartHeaderSignatureInfos")
    public java.util.List<GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfos> multipartHeaderSignatureInfos;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static GetMultipartFileUploadInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultipartFileUploadInfosResponseBody self = new GetMultipartFileUploadInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultipartFileUploadInfosResponseBody setMultipartHeaderSignatureInfos(java.util.List<GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfos> multipartHeaderSignatureInfos) {
        this.multipartHeaderSignatureInfos = multipartHeaderSignatureInfos;
        return this;
    }
    public java.util.List<GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfos> getMultipartHeaderSignatureInfos() {
        return this.multipartHeaderSignatureInfos;
    }

    public GetMultipartFileUploadInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultipartFileUploadInfosResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetMultipartFileUploadInfosResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("ExpirationSeconds")
        public Integer expirationSeconds;

        @NameInMap("Headers")
        public java.util.Map<String, String> headers;

        @NameInMap("InternalResourceUrls")
        public java.util.List<String> internalResourceUrls;

        /**
         * <strong>example:</strong>
         * <p>ZHANGJIAKOU</p>
         */
        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceUrls")
        public java.util.List<String> resourceUrls;

        public static GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo self = new GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo();
            return TeaModel.build(map, self);
        }

        public GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo setExpirationSeconds(Integer expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }
        public Integer getExpirationSeconds() {
            return this.expirationSeconds;
        }

        public GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo setInternalResourceUrls(java.util.List<String> internalResourceUrls) {
            this.internalResourceUrls = internalResourceUrls;
            return this;
        }
        public java.util.List<String> getInternalResourceUrls() {
            return this.internalResourceUrls;
        }

        public GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo setResourceUrls(java.util.List<String> resourceUrls) {
            this.resourceUrls = resourceUrls;
            return this;
        }
        public java.util.List<String> getResourceUrls() {
            return this.resourceUrls;
        }

    }

    public static class GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfos extends TeaModel {
        @NameInMap("HeaderSignatureInfo")
        public GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo headerSignatureInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PartNumber")
        public Integer partNumber;

        public static GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfos build(java.util.Map<String, ?> map) throws Exception {
            GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfos self = new GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfos();
            return TeaModel.build(map, self);
        }

        public GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfos setHeaderSignatureInfo(GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo headerSignatureInfo) {
            this.headerSignatureInfo = headerSignatureInfo;
            return this;
        }
        public GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfosHeaderSignatureInfo getHeaderSignatureInfo() {
            return this.headerSignatureInfo;
        }

        public GetMultipartFileUploadInfosResponseBodyMultipartHeaderSignatureInfos setPartNumber(Integer partNumber) {
            this.partNumber = partNumber;
            return this;
        }
        public Integer getPartNumber() {
            return this.partNumber;
        }

    }

}
