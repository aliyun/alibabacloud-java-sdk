// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneGroupRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // zh: Chinese en: English Default value: zh
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The IDs of applications. Separate application IDs with commas (,).
    @NameInMap("AppIds")
    public String appIds;

    // Specifies whether to enable database canary release.
    @NameInMap("DbGrayEnable")
    public Boolean dbGrayEnable;

    // Specifies whether to enable a lane group.
    @NameInMap("Enable")
    public Boolean enable;

    // The ingress application.
    @NameInMap("EntryApp")
    public String entryApp;

    // The creation time.
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // The update time.
    @NameInMap("GmtModified")
    public String gmtModified;

    // The ID of the primary key. The primary key is auto-increment.
    @NameInMap("Id")
    public Long id;

    // The license key in use.
    @NameInMap("LicenseKey")
    public String licenseKey;

    // The side for message filtering when the canary release for messaging feature is enabled.
    @NameInMap("MessageQueueFilterSide")
    public String messageQueueFilterSide;

    // Specifies whether to enable canary release for messaging.
    @NameInMap("MessageQueueGrayEnable")
    public Boolean messageQueueGrayEnable;

    // The name.
    @NameInMap("Name")
    public String name;

    // Region.
    @NameInMap("Region")
    public String region;

    // The service source. Set the value to edasmsc.
    @NameInMap("Source")
    public String source;

    // The status of the lane group. The value 0 indicates that the lane group is disabled. The value 1 indicates that the lane group is enabled.
    @NameInMap("Status")
    public Integer status;

    // The Alibaba Cloud account. The value is a number, such as 136246\*\*\*\*\*\*809. You can leave this parameter empty.
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

    public CreateOrUpdateSwimmingLaneGroupRequest setDbGrayEnable(Boolean dbGrayEnable) {
        this.dbGrayEnable = dbGrayEnable;
        return this;
    }
    public Boolean getDbGrayEnable() {
        return this.dbGrayEnable;
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

    public CreateOrUpdateSwimmingLaneGroupRequest setMessageQueueFilterSide(String messageQueueFilterSide) {
        this.messageQueueFilterSide = messageQueueFilterSide;
        return this;
    }
    public String getMessageQueueFilterSide() {
        return this.messageQueueFilterSide;
    }

    public CreateOrUpdateSwimmingLaneGroupRequest setMessageQueueGrayEnable(Boolean messageQueueGrayEnable) {
        this.messageQueueGrayEnable = messageQueueGrayEnable;
        return this;
    }
    public Boolean getMessageQueueGrayEnable() {
        return this.messageQueueGrayEnable;
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
