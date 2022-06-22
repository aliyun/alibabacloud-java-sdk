// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListSentinelBlockFallbackDefinitionsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ClassificationSet")
    public String classificationSet;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("SourceType")
    public String sourceType;

    public static ListSentinelBlockFallbackDefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelBlockFallbackDefinitionsRequest self = new ListSentinelBlockFallbackDefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSentinelBlockFallbackDefinitionsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ListSentinelBlockFallbackDefinitionsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSentinelBlockFallbackDefinitionsRequest setClassificationSet(String classificationSet) {
        this.classificationSet = classificationSet;
        return this;
    }
    public String getClassificationSet() {
        return this.classificationSet;
    }

    public ListSentinelBlockFallbackDefinitionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListSentinelBlockFallbackDefinitionsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListSentinelBlockFallbackDefinitionsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
