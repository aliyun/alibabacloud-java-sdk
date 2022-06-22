// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelChangeModelRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NewModel")
    public Long newModel;

    @NameInMap("OldModel")
    public String oldModel;

    public static SentinelChangeModelRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelChangeModelRequest self = new SentinelChangeModelRequest();
        return TeaModel.build(map, self);
    }

    public SentinelChangeModelRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelChangeModelRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelChangeModelRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelChangeModelRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelChangeModelRequest setNewModel(Long newModel) {
        this.newModel = newModel;
        return this;
    }
    public Long getNewModel() {
        return this.newModel;
    }

    public SentinelChangeModelRequest setOldModel(String oldModel) {
        this.oldModel = oldModel;
        return this;
    }
    public String getOldModel() {
        return this.oldModel;
    }

}
