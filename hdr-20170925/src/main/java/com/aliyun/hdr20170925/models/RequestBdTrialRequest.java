// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RequestBdTrialRequest extends TeaModel {
    @NameInMap("Company")
    public String company;

    @NameInMap("Contact")
    public String contact;

    @NameInMap("DataSize")
    public Long dataSize;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("Distribution")
    public String distribution;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Telephone")
    public String telephone;

    @NameInMap("Version")
    public String version;

    public static RequestBdTrialRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestBdTrialRequest self = new RequestBdTrialRequest();
        return TeaModel.build(map, self);
    }

    public RequestBdTrialRequest setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public RequestBdTrialRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public RequestBdTrialRequest setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Long getDataSize() {
        return this.dataSize;
    }

    public RequestBdTrialRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public RequestBdTrialRequest setDistribution(String distribution) {
        this.distribution = distribution;
        return this;
    }
    public String getDistribution() {
        return this.distribution;
    }

    public RequestBdTrialRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RequestBdTrialRequest setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public RequestBdTrialRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
