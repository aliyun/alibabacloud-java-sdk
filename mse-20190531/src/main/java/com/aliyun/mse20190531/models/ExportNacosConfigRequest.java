// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ExportNacosConfigRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Group")
    public String group;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MseSessionId")
    public String mseSessionId;

    @NameInMap("NamespaceId")
    public String namespaceId;

    public static ExportNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportNacosConfigRequest self = new ExportNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public ExportNacosConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ExportNacosConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExportNacosConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ExportNacosConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ExportNacosConfigRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ExportNacosConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportNacosConfigRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public ExportNacosConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
