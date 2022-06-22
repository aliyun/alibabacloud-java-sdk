// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryThermodynamicDataRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AhasTimestamp")
    public Long ahasTimestamp;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Resource")
    public String resource;

    public static QueryThermodynamicDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThermodynamicDataRequest self = new QueryThermodynamicDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryThermodynamicDataRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryThermodynamicDataRequest setAhasTimestamp(Long ahasTimestamp) {
        this.ahasTimestamp = ahasTimestamp;
        return this;
    }
    public Long getAhasTimestamp() {
        return this.ahasTimestamp;
    }

    public QueryThermodynamicDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryThermodynamicDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryThermodynamicDataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryThermodynamicDataRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
