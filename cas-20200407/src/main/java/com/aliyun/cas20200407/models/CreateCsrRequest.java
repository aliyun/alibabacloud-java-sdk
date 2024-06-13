// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCsrRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    @NameInMap("CorpName")
    public String corpName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    @NameInMap("Department")
    public String department;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeySize")
    public Integer keySize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Locality")
    public String locality;

    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Province")
    public String province;

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
