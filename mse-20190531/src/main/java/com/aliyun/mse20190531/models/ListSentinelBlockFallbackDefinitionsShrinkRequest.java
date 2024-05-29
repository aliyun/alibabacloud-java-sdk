// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSentinelBlockFallbackDefinitionsShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ClassificationSet")
    public String classificationSetShrink;

    /**
     * <p>This parameter is required.</p>
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
