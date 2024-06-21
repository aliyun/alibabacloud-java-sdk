// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ExportNacosConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application tag.</p>
     * 
     * <strong>example:</strong>
     * <p>qjl-gateway-openapi</p>
     */
    @NameInMap("AppName")
    @Deprecated
    public String appName;

    /**
     * <p>The ID of the data that you want to export.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Multiple export methods are supported.</p>
     * </li>
     * <li><p>If you want to export a single configuration, you must leave the Ids parameter empty and specify the DataID and Group parameters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sms-mes-develop.prop****</p>
     */
    @NameInMap("DataId")
    @Deprecated
    public String dataId;

    /**
     * <p>The configuration group name and the ID of the configuration that you want to export. Separate multiple configurations with comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>testGroup+testDataId1,testGroup+testDataId2</p>
     */
    @NameInMap("DataIds")
    public String dataIds;

    /**
     * <p>The name of the configuration group.</p>
     * 
     * <strong>example:</strong>
     * <p>TIMEDTASK_COMMON_GROUP</p>
     */
    @NameInMap("Group")
    @Deprecated
    public String group;

    /**
     * <p>The ID of the primary key of a configuration item.</p>
     * <blockquote>
     * <ul>
     * <li>Multiple export methods are supported. You must specify this parameter if you want to export multiple configurations. - You can obtain the value of this parameter by calling the ListNacosConfigs operation. - If you specify this parameter, multiple configurations are exported. The DataId and Group parameters are invalid.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1709,1710</p>
     */
    @NameInMap("Ids")
    @Deprecated
    public String ids;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-2r42ddc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>ae77c258-4d4f-478f-baaa-084aee0****</p>
     */
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

    public ExportNacosConfigRequest setDataIds(String dataIds) {
        this.dataIds = dataIds;
        return this;
    }
    public String getDataIds() {
        return this.dataIds;
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
