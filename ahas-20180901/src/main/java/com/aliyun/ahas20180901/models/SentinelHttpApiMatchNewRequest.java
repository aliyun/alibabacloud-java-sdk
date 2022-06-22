// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHttpApiMatchNewRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("HttpApiMatch")
    public String httpApiMatch;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelHttpApiMatchNewRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelHttpApiMatchNewRequest self = new SentinelHttpApiMatchNewRequest();
        return TeaModel.build(map, self);
    }

    public SentinelHttpApiMatchNewRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelHttpApiMatchNewRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelHttpApiMatchNewRequest setHttpApiMatch(String httpApiMatch) {
        this.httpApiMatch = httpApiMatch;
        return this;
    }
    public String getHttpApiMatch() {
        return this.httpApiMatch;
    }

    public SentinelHttpApiMatchNewRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelHttpApiMatchNewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
