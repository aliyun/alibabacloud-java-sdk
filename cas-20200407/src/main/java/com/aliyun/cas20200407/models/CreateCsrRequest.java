// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCsrRequest extends TeaModel {
    /**
     * <p>The algorithm. Valid values: RSA, SM2, and ECC. For more information about algorithms, see <a href="https://help.aliyun.com/document_detail/197871.html">Select an SSL certificate</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The primary domain name, which is a common name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123.com</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The name of the company.</p>
     * 
     * <strong>example:</strong>
     * <p>aly</p>
     */
    @NameInMap("CorpName")
    public String corpName;

    /**
     * <p>The code of the country or region in which the organization is located. For example, you can use CN to indicate China and use US to indicate the United States.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <p>The department that uses the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>IT</p>
     */
    @NameInMap("Department")
    public String department;

    /**
     * <p>The key length that is used by the algorithm.</p>
     * <ul>
     * <li>The key length for RSA algorithms can be 2,048, 3,072, and 4,096 bits.</li>
     * <li>The key length for ECC and SM2 algorithms can be 256 bits.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("KeySize")
    public Integer keySize;

    /**
     * <p>The city where the company is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("Locality")
    public String locality;

    /**
     * <p>The name of the CSR. The name can be up to 50 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>csr-123</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The province or location where the company is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>The secondary domain names. Separate multiple domain names with commas (,). You can use the CSR to apply for a certificate for both the primary and secondary domain names.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com,www.aliyundoc.com">www.example.com,www.aliyundoc.com</a></p>
     */
    @NameInMap("Sans")
    public String sans;

    public static CreateCsrRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCsrRequest self = new CreateCsrRequest();
        return TeaModel.build(map, self);
    }

    public CreateCsrRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateCsrRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateCsrRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public CreateCsrRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public CreateCsrRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public CreateCsrRequest setKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }
    public Integer getKeySize() {
        return this.keySize;
    }

    public CreateCsrRequest setLocality(String locality) {
        this.locality = locality;
        return this;
    }
    public String getLocality() {
        return this.locality;
    }

    public CreateCsrRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCsrRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public CreateCsrRequest setSans(String sans) {
        this.sans = sans;
        return this;
    }
    public String getSans() {
        return this.sans;
    }

}
