// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySystemStatResourceMetricOfResourceRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Group")
    public String group;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Resource")
    public String resource;

    public static QuerySystemStatResourceMetricOfResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemStatResourceMetricOfResourceRequest self = new QuerySystemStatResourceMetricOfResourceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySystemStatResourceMetricOfResourceRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QuerySystemStatResourceMetricOfResourceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QuerySystemStatResourceMetricOfResourceRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QuerySystemStatResourceMetricOfResourceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QuerySystemStatResourceMetricOfResourceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QuerySystemStatResourceMetricOfResourceRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
