// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDeviceFormRequest extends TeaModel {
    /**
     * <p>是否需要账号配置</p>
     */
    @NameInMap("AccountConfig")
    public Boolean accountConfig;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>是否支持配置生成</p>
     */
    @NameInMap("ConfigCompare")
    public Boolean configCompare;

    @NameInMap("DetailDisplay")
    public Boolean detailDisplay;

    /**
     * <p>设备形态名称</p>
     */
    @NameInMap("DeviceFormName")
    public String deviceFormName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RelatedDeviceFormId")
    public String relatedDeviceFormId;

    @NameInMap("ResourceUse")
    public String resourceUse;

    @NameInMap("Script")
    public String script;

    @NameInMap("UniqueKey")
    public String uniqueKey;

    public static CreateDeviceFormRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceFormRequest self = new CreateDeviceFormRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceFormRequest setAccountConfig(Boolean accountConfig) {
        this.accountConfig = accountConfig;
        return this;
    }
    public Boolean getAccountConfig() {
        return this.accountConfig;
    }

    public CreateDeviceFormRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDeviceFormRequest setConfigCompare(Boolean configCompare) {
        this.configCompare = configCompare;
        return this;
    }
    public Boolean getConfigCompare() {
        return this.configCompare;
    }

    public CreateDeviceFormRequest setDetailDisplay(Boolean detailDisplay) {
        this.detailDisplay = detailDisplay;
        return this;
    }
    public Boolean getDetailDisplay() {
        return this.detailDisplay;
    }

    public CreateDeviceFormRequest setDeviceFormName(String deviceFormName) {
        this.deviceFormName = deviceFormName;
        return this;
    }
    public String getDeviceFormName() {
        return this.deviceFormName;
    }

    public CreateDeviceFormRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDeviceFormRequest setRelatedDeviceFormId(String relatedDeviceFormId) {
        this.relatedDeviceFormId = relatedDeviceFormId;
        return this;
    }
    public String getRelatedDeviceFormId() {
        return this.relatedDeviceFormId;
    }

    public CreateDeviceFormRequest setResourceUse(String resourceUse) {
        this.resourceUse = resourceUse;
        return this;
    }
    public String getResourceUse() {
        return this.resourceUse;
    }

    public CreateDeviceFormRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public CreateDeviceFormRequest setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
        return this;
    }
    public String getUniqueKey() {
        return this.uniqueKey;
    }

}
