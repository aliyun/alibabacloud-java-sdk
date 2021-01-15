// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeviceForm extends TeaModel {
    // 是否需要配置账号信息
    @NameInMap("AccountConfig")
    public String accountConfig;

    // 是否需要展示配置备份
    @NameInMap("ConfigCompare")
    public String configCompare;

    // 设备形态ID
    @NameInMap("FormId")
    public String formId;

    // 设备形态名称
    @NameInMap("FormName")
    public String formName;

    // 设备形态属性列表
    @NameInMap("PropertiesList")
    public java.util.List<DeviceFormProperty> propertiesList;

    public static DeviceForm build(java.util.Map<String, ?> map) throws Exception {
        DeviceForm self = new DeviceForm();
        return TeaModel.build(map, self);
    }

    public DeviceForm setAccountConfig(String accountConfig) {
        this.accountConfig = accountConfig;
        return this;
    }
    public String getAccountConfig() {
        return this.accountConfig;
    }

    public DeviceForm setConfigCompare(String configCompare) {
        this.configCompare = configCompare;
        return this;
    }
    public String getConfigCompare() {
        return this.configCompare;
    }

    public DeviceForm setFormId(String formId) {
        this.formId = formId;
        return this;
    }
    public String getFormId() {
        return this.formId;
    }

    public DeviceForm setFormName(String formName) {
        this.formName = formName;
        return this;
    }
    public String getFormName() {
        return this.formName;
    }

    public DeviceForm setPropertiesList(java.util.List<DeviceFormProperty> propertiesList) {
        this.propertiesList = propertiesList;
        return this;
    }
    public java.util.List<DeviceFormProperty> getPropertiesList() {
        return this.propertiesList;
    }

}
