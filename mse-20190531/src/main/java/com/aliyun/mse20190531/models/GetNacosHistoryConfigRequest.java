// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosHistoryConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the data.</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The name of the group.</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The version ID of the configuration.</p>
     */
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
