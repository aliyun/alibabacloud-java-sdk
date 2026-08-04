// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GenerateAliyunCertUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliyunPk")
    public String aliyunPk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ApplyChannel")
    public String applyChannel;

    @NameInMap("ApplyType")
    public String applyType;

    @NameInMap("Callback")
    public String callback;

    @NameInMap("CertWay")
    public String certWay;

    @NameInMap("IgnoreAlreadyCert")
    public Boolean ignoreAlreadyCert;

    @NameInMap("IsMobile")
    public Boolean isMobile;

    @NameInMap("IsOpenApp")
    public Boolean isOpenApp;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubjectType")
    public String subjectType;

    public static GenerateAliyunCertUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAliyunCertUrlRequest self = new GenerateAliyunCertUrlRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAliyunCertUrlRequest setAliyunPk(String aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public String getAliyunPk() {
        return this.aliyunPk;
    }

    public GenerateAliyunCertUrlRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GenerateAliyunCertUrlRequest setApplyChannel(String applyChannel) {
        this.applyChannel = applyChannel;
        return this;
    }
    public String getApplyChannel() {
        return this.applyChannel;
    }

    public GenerateAliyunCertUrlRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public GenerateAliyunCertUrlRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public GenerateAliyunCertUrlRequest setCertWay(String certWay) {
        this.certWay = certWay;
        return this;
    }
    public String getCertWay() {
        return this.certWay;
    }

    public GenerateAliyunCertUrlRequest setIgnoreAlreadyCert(Boolean ignoreAlreadyCert) {
        this.ignoreAlreadyCert = ignoreAlreadyCert;
        return this;
    }
    public Boolean getIgnoreAlreadyCert() {
        return this.ignoreAlreadyCert;
    }

    public GenerateAliyunCertUrlRequest setIsMobile(Boolean isMobile) {
        this.isMobile = isMobile;
        return this;
    }
    public Boolean getIsMobile() {
        return this.isMobile;
    }

    public GenerateAliyunCertUrlRequest setIsOpenApp(Boolean isOpenApp) {
        this.isOpenApp = isOpenApp;
        return this;
    }
    public Boolean getIsOpenApp() {
        return this.isOpenApp;
    }

    public GenerateAliyunCertUrlRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GenerateAliyunCertUrlRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GenerateAliyunCertUrlRequest setSubjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }
    public String getSubjectType() {
        return this.subjectType;
    }

}
