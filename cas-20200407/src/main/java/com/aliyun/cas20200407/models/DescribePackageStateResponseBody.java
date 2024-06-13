// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribePackageStateResponseBody extends TeaModel {
    /**
     * <p>The number of issued certificates of the specified specifications.</p>
     */
    @NameInMap("IssuedCount")
    public Long issuedCount;

    /**
     * <p>The specifications of the certificate. Valid values:</p>
     * <br>
     * <p>*   **symantec-free-1-free**: DigiCert single-domain DV certificate in 3 months free trial.</p>
     * <p>*   **symantec-free-1-free**: DigiCert single-domain DV certificate in 1 year free trial.</p>
     * <p>*   **symantec-dv-1-starter**: DigiCert wildcard DV certificate.</p>
     * <p>*   **symantec-ov-1-personal**: DigiCert single-domain OV certificate.</p>
     * <p>*   **symantec-ov-w-personal**: DigiCert wildcard OV certificate.</p>
     * <p>*   **geotrust-dv-1-starter**: GeoTrust single-domain DV certificate.</p>
     * <p>*   **geotrust-dv-w-starter**: GeoTrust wildcard DV certificate.</p>
     * <p>*   **geotrust-ov-1-personal**: GeoTrust single-domain OV certificate.</p>
     * <p>*   **geotrust-ov-w-personal**: GeoTrust wildcard OV certificate.</p>
     * <p>*   **globalsign-dv-1-personal**: GlobalSign single-domain DV certificate.</p>
     * <p>*   **globalsign-dv-w-advanced**: GlobalSign wildcard DV certificate.</p>
     * <p>*   **globalsign-ov-1-personal**: GlobalSign single-domain OV certificate.</p>
     * <p>*   **globalsign-ov-w-advanced**: GlobalSign wildcard OV certificate.</p>
     * <p>*   **cfca-ov-1-personal**: CFCA single-domain OV certificate.</p>
     * <p>*   **cfca-ev-w-advanced**: CFCA wildcard OV certificate.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of purchased certificate resource plans of the specified specifications.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The number of certificate applications that you submitted for certificates of the specified specifications.</p>
     * <br>
     * <p>> A successful call of the [CreateCertificateForPackageRequest](https://help.aliyun.com/document_detail/455296.html), [CreateCertificateRequest](https://help.aliyun.com/document_detail/455292.html), or [CreateCertificateWithCsrRequest](https://help.aliyun.com/document_detail/455801.html) operation is counted as one a certificate application, regardless of whether the certificate is issued.</p>
     */
    @NameInMap("UsedCount")
    public Long usedCount;

    public static DescribePackageStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageStateResponseBody self = new DescribePackageStateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackageStateResponseBody setIssuedCount(Long issuedCount) {
        this.issuedCount = issuedCount;
        return this;
    }
    public Long getIssuedCount() {
        return this.issuedCount;
    }

    public DescribePackageStateResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribePackageStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackageStateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribePackageStateResponseBody setUsedCount(Long usedCount) {
        this.usedCount = usedCount;
        return this;
    }
    public Long getUsedCount() {
        return this.usedCount;
    }

}
