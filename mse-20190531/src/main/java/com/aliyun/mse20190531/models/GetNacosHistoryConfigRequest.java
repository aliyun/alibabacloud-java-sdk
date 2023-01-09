// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosHistoryConfigRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the data.
    @NameInMap("DataId")
    public String dataId;

    // The group.
    @NameInMap("Group")
    public String group;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The ID of the namespace.
    @NameInMap("NamespaceId")
    public String namespaceId;

    // The version ID of the configuration.
    @NameInMap("Nid")
    public String nid;

    public static GetNacosHistoryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNacosHistoryConfigRequest self = new GetNacosHistoryConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetNacosHistoryConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetNacosHistoryConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetNacosHistoryConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetNacosHistoryConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetNacosHistoryConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public GetNacosHistoryConfigRequest setNid(String nid) {
        this.nid = nid;
        return this;
    }
    public String getNid() {
        return this.nid;
    }

}
