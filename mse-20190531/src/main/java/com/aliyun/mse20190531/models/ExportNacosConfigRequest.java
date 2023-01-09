// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ExportNacosConfigRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The tag of the application.
    @NameInMap("AppName")
    public String appName;

    // The ID of the data that you want to export.
    // 
    // > :
    // 
    // *   Multiple export methods are supported.
    // *   If you want to export a single configuration, you must leave the Ids parameter empty and specify the DataID and Group parameters.
    @NameInMap("DataId")
    public String dataId;

    // The name of the configuration group.
    @NameInMap("Group")
    public String group;

    // The ID of the primary key of a configuration item.
    // 
    // > : - Multiple export methods are supported. You must specify this parameter if you want to export multiple configurations. - You can obtain the value of this parameter by calling the ListNacosConfigs operation. - If you specify this parameter, multiple configurations are exported. The DataId and Group parameters are invalid.
    @NameInMap("Ids")
    public String ids;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The ID of the namespace.
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

    public ExportNacosConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
