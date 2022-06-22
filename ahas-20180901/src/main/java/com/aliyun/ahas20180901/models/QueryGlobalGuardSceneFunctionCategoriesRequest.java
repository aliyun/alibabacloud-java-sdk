// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryGlobalGuardSceneFunctionCategoriesRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Args")
    public String args;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryGlobalGuardSceneFunctionCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGlobalGuardSceneFunctionCategoriesRequest self = new QueryGlobalGuardSceneFunctionCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public QueryGlobalGuardSceneFunctionCategoriesRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryGlobalGuardSceneFunctionCategoriesRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public QueryGlobalGuardSceneFunctionCategoriesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryGlobalGuardSceneFunctionCategoriesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
