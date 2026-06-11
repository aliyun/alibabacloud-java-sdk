// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesFilter extends TeaModel {
    @NameInMap("datasourceType")
    public String datasourceType;

    /**
     * <p>Filters alert rules by display name.</p>
     */
    @NameInMap("displayName")
    public DisplayNameFilter displayName;

    /**
     * <p>Filters alert rules by enabled status.</p>
     */
    @NameInMap("enabled")
    public EnabledFilter enabled;

    /**
     * <p>Filters alert rules by label.</p>
     */
    @NameInMap("labels")
    public LabelsFilter labels;

    @NameInMap("observeResourceGlobalScope")
    public Boolean observeResourceGlobalScope;

    /**
     * <strong>example:</strong>
     * <p>i-bp1abcxxxxxxxx</p>
     */
    @NameInMap("observeResourceInstanceId")
    public String observeResourceInstanceId;

    @NameInMap("observeResourceType")
    public String observeResourceType;

    @NameInMap("severityLevels")
    public String severityLevels;

    /**
     * <p>Filters alert rules by status.</p>
     */
    @NameInMap("status")
    public StatusFilter status;

    /**
     * <p>Filters alert rules by UUID.</p>
     */
    @NameInMap("uuid")
    public UuidFilter uuid;

    public static QueryAlertRulesFilter build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesFilter self = new QueryAlertRulesFilter();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesFilter setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public QueryAlertRulesFilter setDisplayName(DisplayNameFilter displayName) {
        this.displayName = displayName;
        return this;
    }
    public DisplayNameFilter getDisplayName() {
        return this.displayName;
    }

    public QueryAlertRulesFilter setEnabled(EnabledFilter enabled) {
        this.enabled = enabled;
        return this;
    }
    public EnabledFilter getEnabled() {
        return this.enabled;
    }

    public QueryAlertRulesFilter setLabels(LabelsFilter labels) {
        this.labels = labels;
        return this;
    }
    public LabelsFilter getLabels() {
        return this.labels;
    }

    public QueryAlertRulesFilter setObserveResourceGlobalScope(Boolean observeResourceGlobalScope) {
        this.observeResourceGlobalScope = observeResourceGlobalScope;
        return this;
    }
    public Boolean getObserveResourceGlobalScope() {
        return this.observeResourceGlobalScope;
    }

    public QueryAlertRulesFilter setObserveResourceInstanceId(String observeResourceInstanceId) {
        this.observeResourceInstanceId = observeResourceInstanceId;
        return this;
    }
    public String getObserveResourceInstanceId() {
        return this.observeResourceInstanceId;
    }

    public QueryAlertRulesFilter setObserveResourceType(String observeResourceType) {
        this.observeResourceType = observeResourceType;
        return this;
    }
    public String getObserveResourceType() {
        return this.observeResourceType;
    }

    public QueryAlertRulesFilter setSeverityLevels(String severityLevels) {
        this.severityLevels = severityLevels;
        return this;
    }
    public String getSeverityLevels() {
        return this.severityLevels;
    }

    public QueryAlertRulesFilter setStatus(StatusFilter status) {
        this.status = status;
        return this;
    }
    public StatusFilter getStatus() {
        return this.status;
    }

    public QueryAlertRulesFilter setUuid(UuidFilter uuid) {
        this.uuid = uuid;
        return this;
    }
    public UuidFilter getUuid() {
        return this.uuid;
    }

}
