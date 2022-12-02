// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeviceForm extends TeaModel {
    @NameInMap("AccountConfig")
    public String accountConfig;

    @NameInMap("ConfigCompare")
    public String configCompare;

    @NameInMap("FormId")
    public String formId;

    @NameInMap("FormName")
    public String formName;

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
