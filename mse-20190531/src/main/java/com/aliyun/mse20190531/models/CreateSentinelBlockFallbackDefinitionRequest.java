// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateSentinelBlockFallbackDefinitionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>abcde@12345</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>example-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>{&quot;webFallbackMode&quot;:0,&quot;webRespMessage&quot;:&quot;{}&quot;,&quot;webRespStatusCode&quot;:429,&quot;webRespContentType&quot;:0}</p>
     */
    @NameInMap("FallbackBehavior")
    public String fallbackBehavior;

    /**
     * <strong>example:</strong>
     * <p>JAVA</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>MyFallback</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>1 Web
     * 2 Rpc</p>
     */
    @NameInMap("ResourceClassification")
    public Integer resourceClassification;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Scenario")
    public String scenario;

    /**
     * <strong>example:</strong>
     * <p>edasmsc</p>
     */
    @NameInMap("Source")
    public String source;

    public static CreateSentinelBlockFallbackDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSentinelBlockFallbackDefinitionRequest self = new CreateSentinelBlockFallbackDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSentinelBlockFallbackDefinitionRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setFallbackBehavior(String fallbackBehavior) {
        this.fallbackBehavior = fallbackBehavior;
        return this;
    }
    public String getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setResourceClassification(Integer resourceClassification) {
        this.resourceClassification = resourceClassification;
        return this;
    }
    public Integer getResourceClassification() {
        return this.resourceClassification;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
