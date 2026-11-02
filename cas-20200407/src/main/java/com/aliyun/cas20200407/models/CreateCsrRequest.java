// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCsrRequest extends TeaModel {
    /**
     * <p>The key algorithm for the CSR. Only RSA, SM2, and ECC are supported. For more information about key algorithms, see <a href="https://help.aliyun.com/document_detail/197871.html">Certificate purchasing guide</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The primary domain name, also known as the common name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The name of the organization.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing CSR Technology Co., Ltd</p>
     */
    @NameInMap("CorpName")
    public String corpName;

    /**
     * <p>The country or region code of the organization. For example, CN indicates China, and US indicates the United States.</p>
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
     * <p>The length of the key algorithm.</p>
     * <ul>
     * <li>For the RSA algorithm, the length is typically 2048, 3072, or 4096.</li>
     * <li>For the ECC and SM2 algorithms, the length is typically 256.</li>
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
     * <p>The name of the CSR. The name can be up to 50 characters in length and can contain only uppercase and lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>csr-123</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The province or region where the company is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>The subject alternative names (SANs). These are other domain names for which you want to apply for the same SSL certificate. Separate multiple domain names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com,www.example.com">www.aliyundoc.com,www.example.com</a></p>
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
