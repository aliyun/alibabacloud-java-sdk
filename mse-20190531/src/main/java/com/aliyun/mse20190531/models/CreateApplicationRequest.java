// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The programming language of the application.</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>MSE命名空间名字。</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region to which the application belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Specifies whether to start the switch.</p>
     */
    @NameInMap("SentinelEnable")
    public String sentinelEnable;

    /**
     * <p>The service where the application is deployed. A value of ACK indicates Container Service for Kubernetes.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The name of the Microservices Engine (MSE) namespace.</p>
     */
    @NameInMap("SwitchEnable")
    public String switchEnable;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateApplicationRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateApplicationRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateApplicationRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateApplicationRequest setSentinelEnable(String sentinelEnable) {
        this.sentinelEnable = sentinelEnable;
        return this;
    }
    public String getSentinelEnable() {
        return this.sentinelEnable;
    }

    public CreateApplicationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateApplicationRequest setSwitchEnable(String switchEnable) {
        this.switchEnable = switchEnable;
        return this;
    }
    public String getSwitchEnable() {
        return this.switchEnable;
    }

}
