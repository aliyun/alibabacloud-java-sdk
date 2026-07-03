// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSourceTemplateShrinkRequest extends TeaModel {
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
    public String logUserIdsShrink;

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

    public static UpdateDataSourceTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceTemplateShrinkRequest self = new UpdateDataSourceTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceTemplateShrinkRequest setAutoScanNew(String autoScanNew) {
        this.autoScanNew = autoScanNew;
        return this;
    }
    public String getAutoScanNew() {
        return this.autoScanNew;
    }

    public UpdateDataSourceTemplateShrinkRequest setDataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
        this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
        return this;
    }
    public Boolean getDataSourceRecognizeEnabled() {
        return this.dataSourceRecognizeEnabled;
    }

    public UpdateDataSourceTemplateShrinkRequest setDataSourceTemplateId(String dataSourceTemplateId) {
        this.dataSourceTemplateId = dataSourceTemplateId;
        return this;
    }
    public String getDataSourceTemplateId() {
        return this.dataSourceTemplateId;
    }

    public UpdateDataSourceTemplateShrinkRequest setDataSourceTemplateName(String dataSourceTemplateName) {
        this.dataSourceTemplateName = dataSourceTemplateName;
        return this;
    }
    public String getDataSourceTemplateName() {
        return this.dataSourceTemplateName;
    }

    public UpdateDataSourceTemplateShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataSourceTemplateShrinkRequest setLogProjectPattern(String logProjectPattern) {
        this.logProjectPattern = logProjectPattern;
        return this;
    }
    public String getLogProjectPattern() {
        return this.logProjectPattern;
    }

    public UpdateDataSourceTemplateShrinkRequest setLogRegionIds(String logRegionIds) {
        this.logRegionIds = logRegionIds;
        return this;
    }
    public String getLogRegionIds() {
        return this.logRegionIds;
    }

    public UpdateDataSourceTemplateShrinkRequest setLogStorePattern(String logStorePattern) {
        this.logStorePattern = logStorePattern;
        return this;
    }
    public String getLogStorePattern() {
        return this.logStorePattern;
    }

    public UpdateDataSourceTemplateShrinkRequest setLogUserIdsShrink(String logUserIdsShrink) {
        this.logUserIdsShrink = logUserIdsShrink;
        return this;
    }
    public String getLogUserIdsShrink() {
        return this.logUserIdsShrink;
    }

    public UpdateDataSourceTemplateShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataSourceTemplateShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
