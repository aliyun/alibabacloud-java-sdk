// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataBatchIngestionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>enabled。</p>
     */
    @NameInMap("AutoScanNew")
    public String autoScanNew;

    /**
     * <strong>example:</strong>
     * <p>full。</p>
     */
    @NameInMap("DataBatchIngestionMode")
    public String dataBatchIngestionMode;

    @NameInMap("DataIngestionIds")
    public String dataIngestionIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>true。</p>
     */
    @NameInMap("DataSourceRecognizeEnabled")
    public Boolean dataSourceRecognizeEnabled;

    /**
     * <strong>example:</strong>
     * <p>zh。</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("LogUserIds")
    public String logUserIdsShrink;

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

    public static UpdateDataBatchIngestionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataBatchIngestionShrinkRequest self = new UpdateDataBatchIngestionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataBatchIngestionShrinkRequest setAutoScanNew(String autoScanNew) {
        this.autoScanNew = autoScanNew;
        return this;
    }
    public String getAutoScanNew() {
        return this.autoScanNew;
    }

    public UpdateDataBatchIngestionShrinkRequest setDataBatchIngestionMode(String dataBatchIngestionMode) {
        this.dataBatchIngestionMode = dataBatchIngestionMode;
        return this;
    }
    public String getDataBatchIngestionMode() {
        return this.dataBatchIngestionMode;
    }

    public UpdateDataBatchIngestionShrinkRequest setDataIngestionIdsShrink(String dataIngestionIdsShrink) {
        this.dataIngestionIdsShrink = dataIngestionIdsShrink;
        return this;
    }
    public String getDataIngestionIdsShrink() {
        return this.dataIngestionIdsShrink;
    }

    public UpdateDataBatchIngestionShrinkRequest setDataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
        this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
        return this;
    }
    public Boolean getDataSourceRecognizeEnabled() {
        return this.dataSourceRecognizeEnabled;
    }

    public UpdateDataBatchIngestionShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataBatchIngestionShrinkRequest setLogUserIdsShrink(String logUserIdsShrink) {
        this.logUserIdsShrink = logUserIdsShrink;
        return this;
    }
    public String getLogUserIdsShrink() {
        return this.logUserIdsShrink;
    }

    public UpdateDataBatchIngestionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataBatchIngestionShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
