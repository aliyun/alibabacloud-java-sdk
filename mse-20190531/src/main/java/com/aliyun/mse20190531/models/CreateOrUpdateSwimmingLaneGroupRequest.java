// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneGroupRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // 应用集合。以 "," 分割应用 id
    @NameInMap("AppIds")
    public String appIds;

    // 是否开启。
    @NameInMap("Enable")
    public Boolean enable;

    // 入口应用。格式 "来源系统:id"，比如 EDAS:UUID 或者 CSB:UUID
    @NameInMap("EntryApp")
    public String entryApp;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 更新时间
    @NameInMap("GmtModified")
    public String gmtModified;

    // 主键ID。由SP生成(数据库自增主键)。
    @NameInMap("Id")
    public Long id;

    // mse licenseKey
    @NameInMap("LicenseKey")
    public String licenseKey;

    // 名称
    @NameInMap("Name")
    public String name;

    // region
    @NameInMap("Region")
    public String region;

    // 来源。可选值为: EDAS。
    @NameInMap("Source")
    public String source;

    // 0 未生效
    @NameInMap("Status")
    public Integer status;

    // 阿里云账号。格式为数字，比如1362469756373809。
    @NameInMap("UserId")
    public String userId;

    public static CreateOrUpdateSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneGroupRequest self = new CreateOrUpdateSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setEntryApp(String entryApp) {
        this.entryApp = entryApp;
        return this;
    }
    public String getEntryApp() {
        return this.entryApp;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }
    public String getLicenseKey() {
        return this.licenseKey;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
