// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSourceTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>enabled。</p>
     */
    @NameInMap("AutoScanNew")
    public String autoScanNew;

    /**
     * <strong>example:</strong>
     * <p>true。</p>
     */
    @NameInMap("DataSourceRecognizeEnabled")
    public Boolean dataSourceRecognizeEnabled;

    /**
     * <strong>example:</strong>
     * <p>alibaba_cloud_actiontrail_event_ingestion。</p>
     */
    @NameInMap("DataSourceTemplateId")
    public String dataSourceTemplateId;

    /**
     * <strong>example:</strong>
     * <p>alibaba_cloud_actiontrail_event_ingestion。</p>
     */
    @NameInMap("DataSourceTemplateName")
    public String dataSourceTemplateName;

    /**
     * <strong>example:</strong>
     * <p>zh。</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>aliyun-cloudsiem-data-173326*******。</p>
     */
    @NameInMap("LogProjectPattern")
    public String logProjectPattern;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou。</p>
     */
    @NameInMap("LogRegionIds")
    public String logRegionIds;

    /**
     * <strong>example:</strong>
     * <p>audit-activity。</p>
     */
    @NameInMap("LogStorePattern")
    public String logStorePattern;

    @NameInMap("LogUserIds")
    public java.util.List<String> logUserIds;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
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
