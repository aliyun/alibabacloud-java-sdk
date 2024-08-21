// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribePackageStateResponseBody extends TeaModel {
    /**
     * <p>The number of issued certificates of the specified specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IssuedCount")
    public Long issuedCount;

    /**
     * <p>The specifications of the certificate resource plan. Valid values:</p>
     * <ul>
     * <li><strong>digicert-free-1-free</strong>: DigiCert single-domain DV certificate in a three-month free trial, available only on the China site (aliyun.com).</li>
     * <li><strong>symantec-free-1-free</strong>: DigiCert single-domain DV certificate in a one-year free trial, available only on the China site (aliyun.com).</li>
     * <li><strong>symantec-dv-1-starter</strong>: DigiCert wildcard DV certificate.</li>
     * <li><strong>symantec-ov-1-personal</strong>: DigiCert single-domain OV certificate.</li>
     * <li><strong>symantec-ov-w-personal</strong>: DigiCert wildcard OV certificate.</li>
     * <li><strong>geotrust-dv-1-starter</strong>: GeoTrust single-domain DV certificate.</li>
     * <li><strong>geotrust-dv-w-starter</strong>: GeoTrust wildcard DV certificate.</li>
     * <li><strong>geotrust-ov-1-personal</strong>: GeoTrust single-domain OV certificate.</li>
     * <li><strong>geotrust-ov-w-personal</strong>: GeoTrust wildcard OV certificate.</li>
     * <li><strong>globalsign-dv-1-personal</strong>: GlobalSign single-domain DV certificate.</li>
     * <li><strong>globalsign-dv-w-advanced</strong>: GlobalSign wildcard DV certificate.</li>
     * <li><strong>globalsign-ov-1-personal</strong>: GlobalSign single-domain OV certificate.</li>
     * <li><strong>globalsign-ov-w-advanced</strong>: GlobalSign wildcard OV certificate.</li>
     * <li><strong>cfca-ov-1-personal</strong>: CFCA single-domain OV certificate, available only on the China site (aliyun.com).</li>
     * <li><strong>cfca-ev-w-advanced</strong>: CFCA wildcard OV certificate, available only on the China site (aliyun.com).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>symantec-free-1-free</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>10CFA380-1C58-45C7-8075-06215F3DB681</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of purchased certificate resource plans of the specified specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The number of certificate applications that you submitted for certificates of the specified specifications.</p>
     * <blockquote>
     * <p>: A successful call of the <a href="https://help.aliyun.com/document_detail/204087.html">CreateCertificateForPackageRequest</a>, <a href="https://help.aliyun.com/document_detail/164105.html">CreateCertificateRequest</a>, or <a href="https://help.aliyun.com/document_detail/178732.html">CreateCertificateWithCsrRequest</a> operation is counted as one a certificate application, regardless of whether the certificate is issued.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
