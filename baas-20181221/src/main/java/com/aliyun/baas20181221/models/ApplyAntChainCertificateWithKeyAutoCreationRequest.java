// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ApplyAntChainCertificateWithKeyAutoCreationRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("Password")
    public String password;

    @NameInMap("CountryName")
    public String countryName;

    @NameInMap("StateOrProvinceName")
    public String stateOrProvinceName;

    @NameInMap("LocalityName")
    public String localityName;

    @NameInMap("OrganizationName")
    public String organizationName;

    @NameInMap("OrganizationUnitName")
    public String organizationUnitName;

    @NameInMap("CommonName")
    public String commonName;

    public static ApplyAntChainCertificateWithKeyAutoCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntChainCertificateWithKeyAutoCreationRequest self = new ApplyAntChainCertificateWithKeyAutoCreationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }
    public String getCountryName() {
        return this.countryName;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setStateOrProvinceName(String stateOrProvinceName) {
        this.stateOrProvinceName = stateOrProvinceName;
        return this;
    }
    public String getStateOrProvinceName() {
        return this.stateOrProvinceName;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setLocalityName(String localityName) {
        this.localityName = localityName;
        return this;
    }
    public String getLocalityName() {
        return this.localityName;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setOrganizationUnitName(String organizationUnitName) {
        this.organizationUnitName = organizationUnitName;
        return this;
    }
    public String getOrganizationUnitName() {
        return this.organizationUnitName;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

}
