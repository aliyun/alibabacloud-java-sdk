// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ExperimentTaskOverviewIgnoreNamespaceRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Args")
    public String args;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static ExperimentTaskOverviewIgnoreNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExperimentTaskOverviewIgnoreNamespaceRequest self = new ExperimentTaskOverviewIgnoreNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public ExperimentTaskOverviewIgnoreNamespaceRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ExperimentTaskOverviewIgnoreNamespaceRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public ExperimentTaskOverviewIgnoreNamespaceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExperimentTaskOverviewIgnoreNamespaceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
