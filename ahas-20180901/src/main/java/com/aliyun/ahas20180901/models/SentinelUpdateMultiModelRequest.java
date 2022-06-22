// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelUpdateMultiModelRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelUpdateMultiModelRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelUpdateMultiModelRequest self = new SentinelUpdateMultiModelRequest();
        return TeaModel.build(map, self);
    }

    public SentinelUpdateMultiModelRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelUpdateMultiModelRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelUpdateMultiModelRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public SentinelUpdateMultiModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public SentinelUpdateMultiModelRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
