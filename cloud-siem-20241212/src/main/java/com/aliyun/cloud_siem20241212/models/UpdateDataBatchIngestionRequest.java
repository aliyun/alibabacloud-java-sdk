// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataBatchIngestionRequest extends TeaModel {
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
    public java.util.List<String> dataIngestionIds;

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
    public java.util.List<Long> logUserIds;

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
