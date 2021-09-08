// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateWhitelistSettingRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("CertNo")
    public String certNo;

    @NameInMap("ValidDay")
    public Integer validDay;

    public static CreateWhitelistSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistSettingRequest self = new CreateWhitelistSettingRequest();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateWhitelistSettingRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateWhitelistSettingRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CreateWhitelistSettingRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public CreateWhitelistSettingRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public CreateWhitelistSettingRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateWhitelistSettingRequest setValidDay(Integer validDay) {
        this.validDay = validDay;
        return this;
    }
    public Integer getValidDay() {
        return this.validDay;
    }

}
