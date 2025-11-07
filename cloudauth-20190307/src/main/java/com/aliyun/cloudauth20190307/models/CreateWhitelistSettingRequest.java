// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateWhitelistSettingRequest extends TeaModel {
    /**
     * <p>ID number to be whitelisted.</p>
     * 
     * <strong>example:</strong>
     * <p>44018219950810XXXX</p>
     */
    @NameInMap("CertNo")
    public String certNo;

    /**
     * <p>Certificate ID, used for whitelisting this specific authenticated user.</p>
     * 
     * <strong>example:</strong>
     * <p>sha6d0405f42926084e396e76a037d00</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <p>User language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Whitelist remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>测试白名单。</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000014526</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>Service type:</p>
     * <ul>
     * <li><strong>antcloudauth</strong>: Financial-grade real-person authentication.</li>
     * <li><strong>cloudauthst</strong> (discontinued): Enhanced real-person authentication.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>Visitor\&quot;s source IP address. No need to fill in, the system will automatically obtain it.</p>
     * 
     * <strong>example:</strong>
     * <p>27.115.63.58</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>Number of valid days after creating the whitelist.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ValidDay")
    public Integer validDay;

    public static CreateWhitelistSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistSettingRequest self = new CreateWhitelistSettingRequest();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistSettingRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateWhitelistSettingRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public CreateWhitelistSettingRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateWhitelistSettingRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateWhitelistSettingRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public CreateWhitelistSettingRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CreateWhitelistSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateWhitelistSettingRequest setValidDay(Integer validDay) {
        this.validDay = validDay;
        return this;
    }
    public Integer getValidDay() {
        return this.validDay;
    }

}
