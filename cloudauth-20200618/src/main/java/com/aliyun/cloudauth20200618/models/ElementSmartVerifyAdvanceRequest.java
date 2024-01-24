// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class ElementSmartVerifyAdvanceRequest extends TeaModel {
    @NameInMap("CertFile")
    public java.io.InputStream certFileObject;

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

    public static ElementSmartVerifyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ElementSmartVerifyAdvanceRequest self = new ElementSmartVerifyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ElementSmartVerifyAdvanceRequest setCertFileObject(java.io.InputStream certFileObject) {
        this.certFileObject = certFileObject;
        return this;
    }
    public java.io.InputStream getCertFileObject() {
        return this.certFileObject;
    }

    public ElementSmartVerifyAdvanceRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public ElementSmartVerifyAdvanceRequest setCertNationalEmblemUrl(String certNationalEmblemUrl) {
        this.certNationalEmblemUrl = certNationalEmblemUrl;
        return this;
    }
    public String getCertNationalEmblemUrl() {
        return this.certNationalEmblemUrl;
    }

    public ElementSmartVerifyAdvanceRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public ElementSmartVerifyAdvanceRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public ElementSmartVerifyAdvanceRequest setCertUrl(String certUrl) {
        this.certUrl = certUrl;
        return this;
    }
    public String getCertUrl() {
        return this.certUrl;
    }

    public ElementSmartVerifyAdvanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ElementSmartVerifyAdvanceRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ElementSmartVerifyAdvanceRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
