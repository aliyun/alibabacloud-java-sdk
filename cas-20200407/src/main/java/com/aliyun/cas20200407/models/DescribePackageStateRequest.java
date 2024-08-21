// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribePackageStateRequest extends TeaModel {
    /**
     * <p>The specifications of the certificate resource plan. Valid values:</p>
     * <ul>
     * <li><strong>digicert-free-1-free</strong> (default): DigiCert single-domain domain validated (DV) certificate in a three-month free trial, available only on the China site (aliyun.com).</li>
     * <li><strong>symantec-free-1-free</strong>: DigiCert single-domain DV certificate in a one-year free trial, available only on the China site (aliyun.com).</li>
     * <li><strong>symantec-dv-1-starter</strong>: DigiCert wildcard DV certificate.</li>
     * <li><strong>symantec-ov-1-personal</strong>: DigiCert single-domain organization validated (OV) certificate.</li>
     * <li><strong>symantec-ov-w-personal</strong>: DigiCert wildcard OV certificate.</li>
     * <li><strong>geotrust-dv-1-starter</strong>: GeoTrust single-domain DV certificate.</li>
     * <li><strong>geotrust-dv-w-starter</strong>: GeoTrust wildcard DV certificate.</li>
     * <li><strong>geotrust-ov-1-personal</strong>: GeoTrust single-domain OV certificate.</li>
     * <li><strong>geotrust-ov-w-personal</strong>: GeoTrust wildcard OV certificate.</li>
     * <li><strong>globalsign-dv-1-personal</strong>: GlobalSign single-domain DV certificate.</li>
     * <li><strong>globalsign-dv-w-advanced</strong>: GlobalSign wildcard DV certificate.</li>
     * <li><strong>globalsign-ov-1-personal</strong>: GlobalSign single-domain OV certificate.</li>
     * <li><strong>globalsign-ov-w-advanced</strong>: GlobalSign wildcard OV certificate.</li>
     * <li><strong>cfca-ov-1-personal</strong>: China Financial Certification Authority (CFCA) single-domain OV certificate, available only on the China site (aliyun.com).</li>
     * <li><strong>cfca-ev-w-advanced</strong>: CFCA wildcard OV certificate, available only on the China site (aliyun.com).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>symantec-free-1-free</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static DescribePackageStateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageStateRequest self = new DescribePackageStateRequest();
        return TeaModel.build(map, self);
    }

    public DescribePackageStateRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
