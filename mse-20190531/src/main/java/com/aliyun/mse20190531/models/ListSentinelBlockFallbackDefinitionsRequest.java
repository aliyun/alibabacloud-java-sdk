// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSentinelBlockFallbackDefinitionsRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ClassificationSet")
    public java.util.List<Integer> classificationSet;

    @NameInMap("Namespace")
    public String namespace;

    public static ListSentinelBlockFallbackDefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelBlockFallbackDefinitionsRequest self = new ListSentinelBlockFallbackDefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSentinelBlockFallbackDefinitionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListSentinelBlockFallbackDefinitionsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSentinelBlockFallbackDefinitionsRequest setClassificationSet(java.util.List<Integer> classificationSet) {
        this.classificationSet = classificationSet;
        return this;
    }
    public java.util.List<Integer> getClassificationSet() {
        return this.classificationSet;
    }

    public ListSentinelBlockFallbackDefinitionsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
