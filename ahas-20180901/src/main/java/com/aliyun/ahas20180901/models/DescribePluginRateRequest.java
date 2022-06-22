// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DescribePluginRateRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PluginType")
    public Integer pluginType;

    public static DescribePluginRateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginRateRequest self = new DescribePluginRateRequest();
        return TeaModel.build(map, self);
    }

    public DescribePluginRateRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public DescribePluginRateRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribePluginRateRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribePluginRateRequest setPluginType(Integer pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public Integer getPluginType() {
        return this.pluginType;
    }

}
