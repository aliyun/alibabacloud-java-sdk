// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class ContrastSmartVerifyRequest extends TeaModel {
    @NameInMap("CertName")
    public String certName;

    @NameInMap("CertNo")
    public String certNo;

    @NameInMap("CertType")
    public String certType;

    @NameInMap("FacePicFile")
    public String facePicFile;

    @NameInMap("FacePicString")
    public String facePicString;

    @NameInMap("FacePicUrl")
    public String facePicUrl;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("UserId")
    public String userId;

    public static ContrastSmartVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        ContrastSmartVerifyRequest self = new ContrastSmartVerifyRequest();
        return TeaModel.build(map, self);
    }

    public ContrastSmartVerifyRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public ContrastSmartVerifyRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public ContrastSmartVerifyRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public ContrastSmartVerifyRequest setFacePicFile(String facePicFile) {
        this.facePicFile = facePicFile;
        return this;
    }
    public String getFacePicFile() {
        return this.facePicFile;
    }

    public ContrastSmartVerifyRequest setFacePicString(String facePicString) {
        this.facePicString = facePicString;
        return this;
    }
    public String getFacePicString() {
        return this.facePicString;
    }

    public ContrastSmartVerifyRequest setFacePicUrl(String facePicUrl) {
        this.facePicUrl = facePicUrl;
        return this;
    }
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

    public ContrastSmartVerifyRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ContrastSmartVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ContrastSmartVerifyRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ContrastSmartVerifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ContrastSmartVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public ContrastSmartVerifyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
