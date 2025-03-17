// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class BindSentinelBlockFallbackDefinitionRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-a</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Behavior ID. 0:the default behavior.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("FallbackId")
    public Long fallbackId;

    /**
     * <p>The microservice namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Interface Name: The resource to which the rule applies. It must match the interface name in the console\&quot;s interface details.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/a</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>Target rule type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static BindSentinelBlockFallbackDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        BindSentinelBlockFallbackDefinitionRequest self = new BindSentinelBlockFallbackDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public BindSentinelBlockFallbackDefinitionRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public BindSentinelBlockFallbackDefinitionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BindSentinelBlockFallbackDefinitionRequest setFallbackId(Long fallbackId) {
        this.fallbackId = fallbackId;
        return this;
    }
    public Long getFallbackId() {
        return this.fallbackId;
    }

    public BindSentinelBlockFallbackDefinitionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BindSentinelBlockFallbackDefinitionRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public BindSentinelBlockFallbackDefinitionRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
