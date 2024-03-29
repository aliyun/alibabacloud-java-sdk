// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class ElementSmartVerifyRequest extends TeaModel {
    @NameInMap("CertFile")
    public String certFile;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("CertNationalEmblemUrl")
    public String certNationalEmblemUrl;

    @NameInMap("CertNo")
    public String certNo;

    @NameInMap("CertType")
    public String certType;

    @NameInMap("CertUrl")
    public String certUrl;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    @NameInMap("SceneId")
    public Long sceneId;

    public static ElementSmartVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        ElementSmartVerifyRequest self = new ElementSmartVerifyRequest();
        return TeaModel.build(map, self);
    }

    public ElementSmartVerifyRequest setCertFile(String certFile) {
        this.certFile = certFile;
        return this;
    }
    public String getCertFile() {
        return this.certFile;
    }

    public ElementSmartVerifyRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public ElementSmartVerifyRequest setCertNationalEmblemUrl(String certNationalEmblemUrl) {
        this.certNationalEmblemUrl = certNationalEmblemUrl;
        return this;
    }
    public String getCertNationalEmblemUrl() {
        return this.certNationalEmblemUrl;
    }

    public ElementSmartVerifyRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public ElementSmartVerifyRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public ElementSmartVerifyRequest setCertUrl(String certUrl) {
        this.certUrl = certUrl;
        return this;
    }
    public String getCertUrl() {
        return this.certUrl;
    }

    public ElementSmartVerifyRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ElementSmartVerifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ElementSmartVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
