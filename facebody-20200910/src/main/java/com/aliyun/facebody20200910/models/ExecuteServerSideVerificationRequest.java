// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20200910.models;

import com.aliyun.tea.*;

public class ExecuteServerSideVerificationRequest extends TeaModel {
    @NameInMap("certificateName")
    public String certificateName;

    @NameInMap("certificateNumber")
    public String certificateNumber;

    @NameInMap("facialPictureData")
    public byte[] facialPictureData;

    @NameInMap("facialPictureUrl")
    public String facialPictureUrl;

    @NameInMap("sceneType")
    public String sceneType;

    public static ExecuteServerSideVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteServerSideVerificationRequest self = new ExecuteServerSideVerificationRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteServerSideVerificationRequest setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public ExecuteServerSideVerificationRequest setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public ExecuteServerSideVerificationRequest setFacialPictureData(byte[] facialPictureData) {
        this.facialPictureData = facialPictureData;
        return this;
    }
    public byte[] getFacialPictureData() {
        return this.facialPictureData;
    }

    public ExecuteServerSideVerificationRequest setFacialPictureUrl(String facialPictureUrl) {
        this.facialPictureUrl = facialPictureUrl;
        return this;
    }
    public String getFacialPictureUrl() {
        return this.facialPictureUrl;
    }

    public ExecuteServerSideVerificationRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

}
