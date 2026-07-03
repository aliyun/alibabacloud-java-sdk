// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSourceTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically discover new users.</p>
     * <ul>
     * <li><p>enabled: Enabled.</p>
     * </li>
     * <li><p>disabled: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("AutoScanNew")
    public String autoScanNew;

    /**
     * <p>Specifies whether to automatically discover new data sources.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataSourceRecognizeEnabled")
    public Boolean dataSourceRecognizeEnabled;

    /**
     * <p>The ID of the data source template.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_actiontrail_event_ingestion</p>
     */
    @NameInMap("DataSourceTemplateId")
    public String dataSourceTemplateId;

    /**
     * <p>The name of the data source template.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_actiontrail_event_ingestion</p>
     */
    @NameInMap("DataSourceTemplateName")
    public String dataSourceTemplateName;

    /**
     * <p>The language of the response message. Valid values:</p>
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
     * <p>The matching rule for the names of Simple Log Service projects.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-cloudsiem-data-173326*******</p>
     */
    @NameInMap("LogProjectPattern")
    public String logProjectPattern;

    /**
     * <p>The list of IDs of log storage regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LogRegionIds")
    public String logRegionIds;

    /**
     * <p>The matching rule for the names of Simple Log Service Logstores.</p>
     * 
     * <strong>example:</strong>
     * <p>audit-activity</p>
     */
    @NameInMap("LogStorePattern")
    public String logStorePattern;

    /**
     * <p>The list of user IDs for batch data access.</p>
     */
    @NameInMap("LogUserIds")
    public java.util.List<String> logUserIds;

    /**
     * <p>The region where the Management Hub of threat analysis is located. Select a region based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Assets are outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member. This parameter lets an administrator switch to the perspective of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static UpdateDataSourceTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceTemplateRequest self = new UpdateDataSourceTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceTemplateRequest setAutoScanNew(String autoScanNew) {
        this.autoScanNew = autoScanNew;
        return this;
    }
    public String getAutoScanNew() {
        return this.autoScanNew;
    }

    public UpdateDataSourceTemplateRequest setDataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
        this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
        return this;
    }
    public Boolean getDataSourceRecognizeEnabled() {
        return this.dataSourceRecognizeEnabled;
    }

    public UpdateDataSourceTemplateRequest setDataSourceTemplateId(String dataSourceTemplateId) {
        this.dataSourceTemplateId = dataSourceTemplateId;
        return this;
    }
    public String getDataSourceTemplateId() {
        return this.dataSourceTemplateId;
    }

    public UpdateDataSourceTemplateRequest setDataSourceTemplateName(String dataSourceTemplateName) {
        this.dataSourceTemplateName = dataSourceTemplateName;
        return this;
    }
    public String getDataSourceTemplateName() {
        return this.dataSourceTemplateName;
    }

    public UpdateDataSourceTemplateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataSourceTemplateRequest setLogProjectPattern(String logProjectPattern) {
        this.logProjectPattern = logProjectPattern;
        return this;
    }
    public String getLogProjectPattern() {
        return this.logProjectPattern;
    }

    public UpdateDataSourceTemplateRequest setLogRegionIds(String logRegionIds) {
        this.logRegionIds = logRegionIds;
        return this;
    }
    public String getLogRegionIds() {
        return this.logRegionIds;
    }

    public UpdateDataSourceTemplateRequest setLogStorePattern(String logStorePattern) {
        this.logStorePattern = logStorePattern;
        return this;
    }
    public String getLogStorePattern() {
        return this.logStorePattern;
    }

    public UpdateDataSourceTemplateRequest setLogUserIds(java.util.List<String> logUserIds) {
        this.logUserIds = logUserIds;
        return this;
    }
    public java.util.List<String> getLogUserIds() {
        return this.logUserIds;
    }

    public UpdateDataSourceTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataSourceTemplateRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
