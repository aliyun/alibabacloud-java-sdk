// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetClusterClientDetailListForAssignRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AssignId")
    public Long assignId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelGetClusterClientDetailListForAssignRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetClusterClientDetailListForAssignRequest self = new SentinelGetClusterClientDetailListForAssignRequest();
        return TeaModel.build(map, self);
    }

    public SentinelGetClusterClientDetailListForAssignRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelGetClusterClientDetailListForAssignRequest setAssignId(Long assignId) {
        this.assignId = assignId;
        return this;
    }
    public Long getAssignId() {
        return this.assignId;
    }

    public SentinelGetClusterClientDetailListForAssignRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelGetClusterClientDetailListForAssignRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
