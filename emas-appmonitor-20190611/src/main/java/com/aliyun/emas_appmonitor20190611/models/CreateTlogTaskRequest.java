// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class CreateTlogTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20000000</p>
     */
    @NameInMap("AliYunCurrentPk")
    public String aliYunCurrentPk;

    /**
     * <strong>example:</strong>
     * <p>20000000</p>
     */
    @NameInMap("AliYunMainPk")
    public String aliYunMainPk;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>emas_user</p>
     */
    @NameInMap("AliYunName")
    public String aliYunName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24780725</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <strong>example:</strong>
     * <p>1778860800000</p>
     */
    @NameInMap("BeginDate")
    public Long beginDate;

    /**
     * <strong>example:</strong>
     * <p>Redmi</p>
     */
    @NameInMap("Brand")
    public String brand;

    @NameInMap("City")
    public String city;

    /**
     * <strong>example:</strong>
     * <p>temp</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CollectionNums")
    public Long collectionNums;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Days")
    public String days;

    @NameInMap("DeviceJson")
    public String deviceJson;

    /**
     * <strong>example:</strong>
     * <p>1779465599999</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <strong>example:</strong>
     * <p>temp</p>
     */
    @NameInMap("ErrorType")
    public String errorType;

    /**
     * <strong>example:</strong>
     * <p>iPhone16</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>{&quot;First&quot;:true,&quot;Completed&quot;:true,&quot;NotifyPhone&quot;:true,&quot;NotifyEmail&quot;:true,&quot;NotifyWebhook&quot;:true,&quot;ContactGroupIds&quot;:[1]}</p>
     */
    @NameInMap("NotifySettingJson")
    public String notifySettingJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("OsVersion")
    public String osVersion;

    /**
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("TaskName")
    public String taskName;

    public static CreateTlogTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTlogTaskRequest self = new CreateTlogTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTlogTaskRequest setAliYunCurrentPk(String aliYunCurrentPk) {
        this.aliYunCurrentPk = aliYunCurrentPk;
        return this;
    }
    public String getAliYunCurrentPk() {
        return this.aliYunCurrentPk;
    }

    public CreateTlogTaskRequest setAliYunMainPk(String aliYunMainPk) {
        this.aliYunMainPk = aliYunMainPk;
        return this;
    }
    public String getAliYunMainPk() {
        return this.aliYunMainPk;
    }

    public CreateTlogTaskRequest setAliYunName(String aliYunName) {
        this.aliYunName = aliYunName;
        return this;
    }
    public String getAliYunName() {
        return this.aliYunName;
    }

    public CreateTlogTaskRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public CreateTlogTaskRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateTlogTaskRequest setBeginDate(Long beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public Long getBeginDate() {
        return this.beginDate;
    }

    public CreateTlogTaskRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public CreateTlogTaskRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CreateTlogTaskRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateTlogTaskRequest setCollectionNums(Long collectionNums) {
        this.collectionNums = collectionNums;
        return this;
    }
    public Long getCollectionNums() {
        return this.collectionNums;
    }

    public CreateTlogTaskRequest setDays(String days) {
        this.days = days;
        return this;
    }
    public String getDays() {
        return this.days;
    }

    public CreateTlogTaskRequest setDeviceJson(String deviceJson) {
        this.deviceJson = deviceJson;
        return this;
    }
    public String getDeviceJson() {
        return this.deviceJson;
    }

    public CreateTlogTaskRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public CreateTlogTaskRequest setErrorType(String errorType) {
        this.errorType = errorType;
        return this;
    }
    public String getErrorType() {
        return this.errorType;
    }

    public CreateTlogTaskRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateTlogTaskRequest setNotifySettingJson(String notifySettingJson) {
        this.notifySettingJson = notifySettingJson;
        return this;
    }
    public String getNotifySettingJson() {
        return this.notifySettingJson;
    }

    public CreateTlogTaskRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public CreateTlogTaskRequest setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public CreateTlogTaskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateTlogTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
