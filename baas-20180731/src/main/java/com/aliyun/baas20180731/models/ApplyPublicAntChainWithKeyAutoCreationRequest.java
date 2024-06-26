// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyPublicAntChainWithKeyAutoCreationRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("CommonName")
    public String commonName;

    @NameInMap("CountryName")
    public String countryName;

    @NameInMap("LocalityName")
    public String localityName;

    @NameInMap("OrganizationName")
    public String organizationName;

    @NameInMap("OrganizationUnitName")
    public String organizationUnitName;

    @NameInMap("Password")
    public String password;

    @NameInMap("StateOrProvinceName")
    public String stateOrProvinceName;

    public static ApplyPublicAntChainWithKeyAutoCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyPublicAntChainWithKeyAutoCreationRequest self = new ApplyPublicAntChainWithKeyAutoCreationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyPublicAntChainWithKeyAutoCreationRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ApplyPublicAntChainWithKeyAutoCreationRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public ApplyPublicAntChainWithKeyAutoCreationRequest setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }
    public String getCountryName() {
        return this.countryName;
    }

    public ApplyPublicAntChainWithKeyAutoCreationRequest setLocalityName(String localityName) {
        this.localityName = localityName;
        return this;
    }
    public String getLocalityName() {
        return this.localityName;
    }

    public ApplyPublicAntChainWithKeyAutoCreationRequest setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

    public ApplyPublicAntChainWithKeyAutoCreationRequest setOrganizationUnitName(String organizationUnitName) {
        this.organizationUnitName = organizationUnitName;
        return this;
    }
    public String getOrganizationUnitName() {
        return this.organizationUnitName;
    }

    public ApplyPublicAntChainWithKeyAutoCreationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ApplyPublicAntChainWithKeyAutoCreationRequest setStateOrProvinceName(String stateOrProvinceName) {
        this.stateOrProvinceName = stateOrProvinceName;
        return this;
    }
    public String getStateOrProvinceName() {
        return this.stateOrProvinceName;
    }

}
