// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryPluginsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PluginStatus")
    public Integer pluginStatus;

    @NameInMap("PluginType")
    public Integer pluginType;

    public static QueryPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPluginsRequest self = new QueryPluginsRequest();
        return TeaModel.build(map, self);
    }

    public QueryPluginsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryPluginsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryPluginsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public QueryPluginsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryPluginsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QueryPluginsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPluginsRequest setPluginStatus(Integer pluginStatus) {
        this.pluginStatus = pluginStatus;
        return this;
    }
    public Integer getPluginStatus() {
        return this.pluginStatus;
    }

    public QueryPluginsRequest setPluginType(Integer pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public Integer getPluginType() {
        return this.pluginType;
    }

}
