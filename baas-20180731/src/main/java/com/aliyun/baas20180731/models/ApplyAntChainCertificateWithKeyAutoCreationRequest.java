// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyAntChainCertificateWithKeyAutoCreationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CountryName")
    public String countryName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LocalityName")
    public String localityName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationName")
    public String organizationName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationUnitName")
    public String organizationUnitName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StateOrProvinceName")
    public String stateOrProvinceName;

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

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }
    public String getCountryName() {
        return this.countryName;
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

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ApplyAntChainCertificateWithKeyAutoCreationRequest setStateOrProvinceName(String stateOrProvinceName) {
        this.stateOrProvinceName = stateOrProvinceName;
        return this;
    }
    public String getStateOrProvinceName() {
        return this.stateOrProvinceName;
    }

}
