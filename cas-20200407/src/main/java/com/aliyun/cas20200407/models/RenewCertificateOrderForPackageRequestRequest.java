// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RenewCertificateOrderForPackageRequestRequest extends TeaModel {
    /**
     * <p>The content of the certificate signing request (CSR) file that is manually generated for the domain name by using OpenSSL or Keytool. The key algorithm in the CSR file must be Rivest-Shamir-Adleman (RSA) or elliptic-curve cryptography (ECC), and the key length of the RSA algorithm must be greater than or equal to 2,048 characters. For more information about how to create a CSR file, see [How do I create a CSR file?](~~42218~~)</p>
     * <br>
     * <p>If you do not specify this parameter, Certificate Management Service automatically generates a CSR file for the domain name in the certificate application order that you want to renew.</p>
     * <br>
     * <p>A CSR file contains the information about your server and company. When you apply for a certificate, you must submit the CSR file to the CA. The CA signs the CSR file by using the private key of the root certificate and generates a public key file to issue your certificate.</p>
     * <br>
     * <p>> The **CN** field in the CSR file specifies the domain name that is bound to the certificate.</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The ID of the certificate application order that you want to renew.</p>
     * <br>
     * <p>> After you call the [CreateCertificateForPackageRequest](~~455296~~), [CreateCertificateRequest](~~455292~~), or [CreateCertificateWithCsrRequest](~~455801~~) operation to submit a certificate application, you can obtain the ID of the certificate application order from the **OrderId** response parameter.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    public static RenewCertificateOrderForPackageRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewCertificateOrderForPackageRequestRequest self = new RenewCertificateOrderForPackageRequestRequest();
        return TeaModel.build(map, self);
    }

    public RenewCertificateOrderForPackageRequestRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public RenewCertificateOrderForPackageRequestRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
