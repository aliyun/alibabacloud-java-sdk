// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelCreateMultiModelRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelCreateMultiModelRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelCreateMultiModelRequest self = new SentinelCreateMultiModelRequest();
        return TeaModel.build(map, self);
    }

    public SentinelCreateMultiModelRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelCreateMultiModelRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelCreateMultiModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public SentinelCreateMultiModelRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
