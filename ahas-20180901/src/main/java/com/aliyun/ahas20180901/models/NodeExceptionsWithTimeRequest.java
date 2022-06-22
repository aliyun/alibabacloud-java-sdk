// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class NodeExceptionsWithTimeRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Node")
    public String node;

    @NameInMap("Time")
    public Long time;

    public static NodeExceptionsWithTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        NodeExceptionsWithTimeRequest self = new NodeExceptionsWithTimeRequest();
        return TeaModel.build(map, self);
    }

    public NodeExceptionsWithTimeRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public NodeExceptionsWithTimeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public NodeExceptionsWithTimeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public NodeExceptionsWithTimeRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public NodeExceptionsWithTimeRequest setNode(String node) {
        this.node = node;
        return this;
    }
    public String getNode() {
        return this.node;
    }

    public NodeExceptionsWithTimeRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}
