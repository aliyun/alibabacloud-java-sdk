// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppPanoramicGraphRequest extends TeaModel {
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ViewId")
    public String viewId;

    public static QueryAppPanoramicGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppPanoramicGraphRequest self = new QueryAppPanoramicGraphRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppPanoramicGraphRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public QueryAppPanoramicGraphRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryAppPanoramicGraphRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryAppPanoramicGraphRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
