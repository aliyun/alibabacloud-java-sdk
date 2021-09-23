// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Group")
    public String group;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("Beta")
    public Boolean beta;

    public static GetNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNacosConfigRequest self = new GetNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetNacosConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetNacosConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetNacosConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetNacosConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public GetNacosConfigRequest setBeta(Boolean beta) {
        this.beta = beta;
        return this;
    }
    public Boolean getBeta() {
        return this.beta;
    }

}
