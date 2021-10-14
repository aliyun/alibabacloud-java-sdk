// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class EditApgroupThirdAppRequest extends TeaModel {
    // apgroupId
    @NameInMap("ApgroupId")
    public Long apgroupId;

    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // appData
    @NameInMap("AppData")
    public String appData;

    // appKey
    @NameInMap("AppName")
    public String appName;

    // applyToSubGroup
    @NameInMap("ApplyToSubGroup")
    public Integer applyToSubGroup;

    // category
    @NameInMap("Category")
    public Integer category;

    // configType
    @NameInMap("ConfigType")
    public String configType;

    // id
    @NameInMap("Id")
    public Long id;

    // inheritParentGroup
    @NameInMap("InheritParentGroup")
    public Integer inheritParentGroup;

    // appName
    @NameInMap("ThirdAppName")
    public String thirdAppName;

    public static EditApgroupThirdAppRequest build(java.util.Map<String, ?> map) throws Exception {
        EditApgroupThirdAppRequest self = new EditApgroupThirdAppRequest();
        return TeaModel.build(map, self);
    }

    public EditApgroupThirdAppRequest setApgroupId(Long apgroupId) {
        this.apgroupId = apgroupId;
        return this;
    }
    public Long getApgroupId() {
        return this.apgroupId;
    }

    public EditApgroupThirdAppRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public EditApgroupThirdAppRequest setAppData(String appData) {
        this.appData = appData;
        return this;
    }
    public String getAppData() {
        return this.appData;
    }

    public EditApgroupThirdAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EditApgroupThirdAppRequest setApplyToSubGroup(Integer applyToSubGroup) {
        this.applyToSubGroup = applyToSubGroup;
        return this;
    }
    public Integer getApplyToSubGroup() {
        return this.applyToSubGroup;
    }

    public EditApgroupThirdAppRequest setCategory(Integer category) {
        this.category = category;
        return this;
    }
    public Integer getCategory() {
        return this.category;
    }

    public EditApgroupThirdAppRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public EditApgroupThirdAppRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public EditApgroupThirdAppRequest setInheritParentGroup(Integer inheritParentGroup) {
        this.inheritParentGroup = inheritParentGroup;
        return this;
    }
    public Integer getInheritParentGroup() {
        return this.inheritParentGroup;
    }

    public EditApgroupThirdAppRequest setThirdAppName(String thirdAppName) {
        this.thirdAppName = thirdAppName;
        return this;
    }
    public String getThirdAppName() {
        return this.thirdAppName;
    }

}
