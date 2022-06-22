// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSentinelBlockFallbackDefinitionRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("FallbackBehavior")
    public String fallbackBehavior;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceClassification")
    public Integer resourceClassification;

    public static UpdateSentinelBlockFallbackDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSentinelBlockFallbackDefinitionRequest self = new UpdateSentinelBlockFallbackDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSentinelBlockFallbackDefinitionRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateSentinelBlockFallbackDefinitionRequest setFallbackBehavior(String fallbackBehavior) {
        this.fallbackBehavior = fallbackBehavior;
        return this;
    }
    public String getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    public UpdateSentinelBlockFallbackDefinitionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSentinelBlockFallbackDefinitionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateSentinelBlockFallbackDefinitionRequest setResourceClassification(Integer resourceClassification) {
        this.resourceClassification = resourceClassification;
        return this;
    }
    public Integer getResourceClassification() {
        return this.resourceClassification;
    }

}
