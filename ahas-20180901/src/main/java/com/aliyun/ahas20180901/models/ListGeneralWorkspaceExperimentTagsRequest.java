// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListGeneralWorkspaceExperimentTagsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Args")
    public String args;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static ListGeneralWorkspaceExperimentTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGeneralWorkspaceExperimentTagsRequest self = new ListGeneralWorkspaceExperimentTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListGeneralWorkspaceExperimentTagsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ListGeneralWorkspaceExperimentTagsRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public ListGeneralWorkspaceExperimentTagsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListGeneralWorkspaceExperimentTagsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
