// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetClusterServerDetailForAssignRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AssignId")
    public Long assignId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelGetClusterServerDetailForAssignRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetClusterServerDetailForAssignRequest self = new SentinelGetClusterServerDetailForAssignRequest();
        return TeaModel.build(map, self);
    }

    public SentinelGetClusterServerDetailForAssignRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelGetClusterServerDetailForAssignRequest setAssignId(Long assignId) {
        this.assignId = assignId;
        return this;
    }
    public Long getAssignId() {
        return this.assignId;
    }

    public SentinelGetClusterServerDetailForAssignRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelGetClusterServerDetailForAssignRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
