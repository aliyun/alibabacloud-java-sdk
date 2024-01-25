// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class AddCompanyTemplateRequest extends TeaModel {
    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("EslSize")
    public String eslSize;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IfDefault")
    public Boolean ifDefault;

    @NameInMap("IfMember")
    public Boolean ifMember;

    @NameInMap("IfOutOfInventory")
    public Boolean ifOutOfInventory;

    @NameInMap("IfPromotion")
    public Boolean ifPromotion;

    @NameInMap("IfSourceCode")
    public Boolean ifSourceCode;

    @NameInMap("Layout")
    public Integer layout;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateSceneId")
    public String templateSceneId;

    @NameInMap("TemplateType")
    public String templateType;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("Vendor")
    public String vendor;

    public static AddCompanyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCompanyTemplateRequest self = new AddCompanyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddCompanyTemplateRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public AddCompanyTemplateRequest setEslSize(String eslSize) {
        this.eslSize = eslSize;
        return this;
    }
    public String getEslSize() {
        return this.eslSize;
    }

    public AddCompanyTemplateRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public AddCompanyTemplateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddCompanyTemplateRequest setIfDefault(Boolean ifDefault) {
        this.ifDefault = ifDefault;
        return this;
    }
    public Boolean getIfDefault() {
        return this.ifDefault;
    }

    public AddCompanyTemplateRequest setIfMember(Boolean ifMember) {
        this.ifMember = ifMember;
        return this;
    }
    public Boolean getIfMember() {
        return this.ifMember;
    }

    public AddCompanyTemplateRequest setIfOutOfInventory(Boolean ifOutOfInventory) {
        this.ifOutOfInventory = ifOutOfInventory;
        return this;
    }
    public Boolean getIfOutOfInventory() {
        return this.ifOutOfInventory;
    }

    public AddCompanyTemplateRequest setIfPromotion(Boolean ifPromotion) {
        this.ifPromotion = ifPromotion;
        return this;
    }
    public Boolean getIfPromotion() {
        return this.ifPromotion;
    }

    public AddCompanyTemplateRequest setIfSourceCode(Boolean ifSourceCode) {
        this.ifSourceCode = ifSourceCode;
        return this;
    }
    public Boolean getIfSourceCode() {
        return this.ifSourceCode;
    }

    public AddCompanyTemplateRequest setLayout(Integer layout) {
        this.layout = layout;
        return this;
    }
    public Integer getLayout() {
        return this.layout;
    }

    public AddCompanyTemplateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public AddCompanyTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public AddCompanyTemplateRequest setTemplateSceneId(String templateSceneId) {
        this.templateSceneId = templateSceneId;
        return this;
    }
    public String getTemplateSceneId() {
        return this.templateSceneId;
    }

    public AddCompanyTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public AddCompanyTemplateRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public AddCompanyTemplateRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
