// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class NodeExceptionsRequest extends TeaModel {
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

    public static NodeExceptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        NodeExceptionsRequest self = new NodeExceptionsRequest();
        return TeaModel.build(map, self);
    }

    public NodeExceptionsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public NodeExceptionsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public NodeExceptionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public NodeExceptionsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public NodeExceptionsRequest setNode(String node) {
        this.node = node;
        return this;
    }
    public String getNode() {
        return this.node;
    }

}
