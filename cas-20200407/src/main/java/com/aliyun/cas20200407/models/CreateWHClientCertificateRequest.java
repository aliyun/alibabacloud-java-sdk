// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWHClientCertificateRequest extends TeaModel {
    @NameInMap("AfterTime")
    public Long afterTime;

    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("BeforeTime")
    public Long beforeTime;

    @NameInMap("CommonName")
    public String commonName;

    @NameInMap("Csr")
    public String csr;

    @NameInMap("Days")
    public Long days;

    @NameInMap("ParentIdentifier")
    public String parentIdentifier;

    @NameInMap("SanType")
    public Long sanType;

    @NameInMap("SanValue")
    public String sanValue;

    public static CreateWHClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWHClientCertificateRequest self = new CreateWHClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateWHClientCertificateRequest setAfterTime(Long afterTime) {
        this.afterTime = afterTime;
        return this;
    }
    public Long getAfterTime() {
        return this.afterTime;
    }

    public CreateWHClientCertificateRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateWHClientCertificateRequest setBeforeTime(Long beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }
    public Long getBeforeTime() {
        return this.beforeTime;
    }

    public CreateWHClientCertificateRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateWHClientCertificateRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateWHClientCertificateRequest setDays(Long days) {
        this.days = days;
        return this;
    }
    public Long getDays() {
        return this.days;
    }

    public CreateWHClientCertificateRequest setParentIdentifier(String parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
        return this;
    }
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    public CreateWHClientCertificateRequest setSanType(Long sanType) {
        this.sanType = sanType;
        return this;
    }
    public Long getSanType() {
        return this.sanType;
    }

    public CreateWHClientCertificateRequest setSanValue(String sanValue) {
        this.sanValue = sanValue;
        return this;
    }
    public String getSanValue() {
        return this.sanValue;
    }

}
