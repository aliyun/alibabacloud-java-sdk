// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterAssignMapUnbindSingleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AssignId")
    public Long assignId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelClusterAssignMapUnbindSingleRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterAssignMapUnbindSingleRequest self = new SentinelClusterAssignMapUnbindSingleRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterAssignMapUnbindSingleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelClusterAssignMapUnbindSingleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelClusterAssignMapUnbindSingleRequest setAssignId(Long assignId) {
        this.assignId = assignId;
        return this;
    }
    public Long getAssignId() {
        return this.assignId;
    }

    public SentinelClusterAssignMapUnbindSingleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelClusterAssignMapUnbindSingleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
