// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHttpApiMatchUpdateRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("HttpApiMatch")
    public String httpApiMatch;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelHttpApiMatchUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelHttpApiMatchUpdateRequest self = new SentinelHttpApiMatchUpdateRequest();
        return TeaModel.build(map, self);
    }

    public SentinelHttpApiMatchUpdateRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelHttpApiMatchUpdateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelHttpApiMatchUpdateRequest setHttpApiMatch(String httpApiMatch) {
        this.httpApiMatch = httpApiMatch;
        return this;
    }
    public String getHttpApiMatch() {
        return this.httpApiMatch;
    }

    public SentinelHttpApiMatchUpdateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelHttpApiMatchUpdateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelHttpApiMatchUpdateRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
