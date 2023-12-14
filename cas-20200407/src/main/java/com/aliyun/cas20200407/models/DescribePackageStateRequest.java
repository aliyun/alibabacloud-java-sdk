// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribePackageStateRequest extends TeaModel {
    /**
     * <p>The specifications of the certificate resource plan. Valid values:</p>
     * <br>
     * <p>*   **digicert-free-1-free**: DigiCert single-domain DV certificate in 3 months free trial. This is the default value.</p>
     * <p>*   **symantec-free-1-free**: DigiCert single-domain DV certificate in 1 year free trial.</p>
     * <p>*   **symantec-dv-1-starter**: DigiCert wildcard DV certificate.</p>
     * <p>*   **symantec-ov-1-personal**: DigiCert single-domain organization validated (OV) certificate.</p>
     * <p>*   **symantec-ov-w-personal**: DigiCert wildcard OV certificate.</p>
     * <p>*   **geotrust-dv-1-starter**: GeoTrust single-domain DV certificate.</p>
     * <p>*   **geotrust-dv-w-starter**: GeoTrust wildcard DV certificate.</p>
     * <p>*   **geotrust-ov-1-personal**: GeoTrust single-domain OV certificate.</p>
     * <p>*   **geotrust-ov-w-personal**: GeoTrust wildcard OV certificate.</p>
     * <p>*   **globalsign-dv-1-personal**: GlobalSign single-domain DV certificate.</p>
     * <p>*   **globalsign-dv-w-advanced**: GlobalSign wildcard DV certificate.</p>
     * <p>*   **globalsign-ov-1-personal**: GlobalSign single-domain OV certificate.</p>
     * <p>*   **globalsign-ov-w-advanced**: GlobalSign wildcard OV certificate.</p>
     * <p>*   **cfca-ov-1-personal**: China Financial Certification Authority (CFCA) single-domain OV certificate.</p>
     * <p>*   **cfca-ev-w-advanced**: CFCA wildcard OV certificate.</p>
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
