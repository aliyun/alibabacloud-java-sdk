// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataBatchIngestionRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically discover new users.</p>
     * <ul>
     * <li><p>enabled: Enables the feature.</p>
     * </li>
     * <li><p>disabled: Disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("AutoScanNew")
    public String autoScanNew;

    /**
     * <p>The mode for batch data ingestion. Valid values:</p>
     * <ul>
     * <li><p>full</p>
     * </li>
     * <li><p>increment</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>full</p>
     */
    @NameInMap("DataBatchIngestionMode")
    public String dataBatchIngestionMode;

    /**
     * <p>The list of ingestion policy IDs.</p>
     */
    @NameInMap("DataIngestionIds")
    public java.util.List<String> dataIngestionIds;

    /**
     * <p>Specifies whether to automatically discover new Logstores.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataSourceRecognizeEnabled")
    public Boolean dataSourceRecognizeEnabled;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The list of user IDs for batch data ingestion.</p>
     */
    @NameInMap("LogUserIds")
    public java.util.List<Long> logUserIds;

    /**
     * <p>The region of the Data Management hub for threat analysis. Select a region for the management hub based on the region of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member whose perspective the administrator wants to switch to.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static UpdateDataBatchIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataBatchIngestionRequest self = new UpdateDataBatchIngestionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataBatchIngestionRequest setAutoScanNew(String autoScanNew) {
        this.autoScanNew = autoScanNew;
        return this;
    }
    public String getAutoScanNew() {
        return this.autoScanNew;
    }

    public UpdateDataBatchIngestionRequest setDataBatchIngestionMode(String dataBatchIngestionMode) {
        this.dataBatchIngestionMode = dataBatchIngestionMode;
        return this;
    }
    public String getDataBatchIngestionMode() {
        return this.dataBatchIngestionMode;
    }

    public UpdateDataBatchIngestionRequest setDataIngestionIds(java.util.List<String> dataIngestionIds) {
        this.dataIngestionIds = dataIngestionIds;
        return this;
    }
    public java.util.List<String> getDataIngestionIds() {
        return this.dataIngestionIds;
    }

    public UpdateDataBatchIngestionRequest setDataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
        this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
        return this;
    }
    public Boolean getDataSourceRecognizeEnabled() {
        return this.dataSourceRecognizeEnabled;
    }

    public UpdateDataBatchIngestionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataBatchIngestionRequest setLogUserIds(java.util.List<Long> logUserIds) {
        this.logUserIds = logUserIds;
        return this;
    }
    public java.util.List<Long> getLogUserIds() {
        return this.logUserIds;
    }

    public UpdateDataBatchIngestionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataBatchIngestionRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
