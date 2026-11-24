// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSourceTemplateShrinkRequest extends TeaModel {
    @NameInMap("AutoScanNew")
    public String autoScanNew;

    @NameInMap("DataSourceRecognizeEnabled")
    public Boolean dataSourceRecognizeEnabled;

    @NameInMap("DataSourceTemplateId")
    public String dataSourceTemplateId;

    @NameInMap("DataSourceTemplateName")
    public String dataSourceTemplateName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LogProjectPattern")
    public String logProjectPattern;

    @NameInMap("LogRegionIds")
    public String logRegionIds;

    @NameInMap("LogStorePattern")
    public String logStorePattern;

    @NameInMap("LogUserIds")
    public String logUserIdsShrink;

    @NameInMap("RegionId")
    public String regionId;

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
