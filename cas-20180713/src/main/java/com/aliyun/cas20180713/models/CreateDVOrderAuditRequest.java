// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class CreateDVOrderAuditRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("DomainVerifyType")
    public String domainVerifyType;

    @NameInMap("Username")
    public String username;

    @NameInMap("Email")
    public String email;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Province")
    public String province;

    @NameInMap("City")
    public String city;

    public static CreateDVOrderAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDVOrderAuditRequest self = new CreateDVOrderAuditRequest();
        return TeaModel.build(map, self);
    }

    public CreateDVOrderAuditRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateDVOrderAuditRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDVOrderAuditRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDVOrderAuditRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDVOrderAuditRequest setDomainVerifyType(String domainVerifyType) {
        this.domainVerifyType = domainVerifyType;
        return this;
    }
    public String getDomainVerifyType() {
        return this.domainVerifyType;
    }

    public CreateDVOrderAuditRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public CreateDVOrderAuditRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateDVOrderAuditRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateDVOrderAuditRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public CreateDVOrderAuditRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

}
