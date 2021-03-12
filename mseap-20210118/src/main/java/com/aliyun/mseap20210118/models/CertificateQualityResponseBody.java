// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class CertificateQualityResponseBody extends TeaModel {
    @NameInMap("ContainSeal")
    public String containSeal;

    @NameInMap("ContainWatermark")
    public String containWatermark;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Copy")
    public String copy;

    @NameInMap("Complete")
    public String complete;

    @NameInMap("NationalEmblem")
    public String nationalEmblem;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("Reflection")
    public String reflection;

    @NameInMap("Electronic")
    public String electronic;

    @NameInMap("ContainFront")
    public String containFront;

    @NameInMap("TextClarity")
    public String textClarity;

    public static CertificateQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CertificateQualityResponseBody self = new CertificateQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public CertificateQualityResponseBody setContainSeal(String containSeal) {
        this.containSeal = containSeal;
        return this;
    }
    public String getContainSeal() {
        return this.containSeal;
    }

    public CertificateQualityResponseBody setContainWatermark(String containWatermark) {
        this.containWatermark = containWatermark;
        return this;
    }
    public String getContainWatermark() {
        return this.containWatermark;
    }

    public CertificateQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CertificateQualityResponseBody setCopy(String copy) {
        this.copy = copy;
        return this;
    }
    public String getCopy() {
        return this.copy;
    }

    public CertificateQualityResponseBody setComplete(String complete) {
        this.complete = complete;
        return this;
    }
    public String getComplete() {
        return this.complete;
    }

    public CertificateQualityResponseBody setNationalEmblem(String nationalEmblem) {
        this.nationalEmblem = nationalEmblem;
        return this;
    }
    public String getNationalEmblem() {
        return this.nationalEmblem;
    }

    public CertificateQualityResponseBody setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CertificateQualityResponseBody setReflection(String reflection) {
        this.reflection = reflection;
        return this;
    }
    public String getReflection() {
        return this.reflection;
    }

    public CertificateQualityResponseBody setElectronic(String electronic) {
        this.electronic = electronic;
        return this;
    }
    public String getElectronic() {
        return this.electronic;
    }

    public CertificateQualityResponseBody setContainFront(String containFront) {
        this.containFront = containFront;
        return this;
    }
    public String getContainFront() {
        return this.containFront;
    }

    public CertificateQualityResponseBody setTextClarity(String textClarity) {
        this.textClarity = textClarity;
        return this;
    }
    public String getTextClarity() {
        return this.textClarity;
    }

}
