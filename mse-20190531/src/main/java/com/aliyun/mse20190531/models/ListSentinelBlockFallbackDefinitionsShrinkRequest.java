// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSentinelBlockFallbackDefinitionsShrinkRequest extends TeaModel {
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
     * <p>Behavior Classification Set.</p>
     */
    @NameInMap("ClassificationSet")
    public String classificationSetShrink;

    /**
     * <p>The name of the Microservices namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static ListSentinelBlockFallbackDefinitionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelBlockFallbackDefinitionsShrinkRequest self = new ListSentinelBlockFallbackDefinitionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSentinelBlockFallbackDefinitionsShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListSentinelBlockFallbackDefinitionsShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSentinelBlockFallbackDefinitionsShrinkRequest setClassificationSetShrink(String classificationSetShrink) {
        this.classificationSetShrink = classificationSetShrink;
        return this;
    }
    public String getClassificationSetShrink() {
        return this.classificationSetShrink;
    }

    public ListSentinelBlockFallbackDefinitionsShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
