// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesResult extends TeaModel {
    /**
     * <p>The details of the created or updated alert rule.</p>
     */
    @NameInMap("alertRule")
    public AlertRuleV2 alertRule;

    /**
     * <p>The number of deleted alert rules.</p>
     */
    @NameInMap("deletedCount")
    public Integer deletedCount;

    /**
     * <p>A list of UUIDs of deleted alert rules.</p>
     */
    @NameInMap("deletedUuidList")
    public java.util.List<String> deletedUuidList;

    /**
     * <p>The number of updated alert rules.</p>
     */
    @NameInMap("updatedCount")
    public Integer updatedCount;

    /**
     * <p>A list of UUIDs of updated alert rules.</p>
     */
    @NameInMap("updatedUuidList")
    public java.util.List<String> updatedUuidList;

    public static ManageAlertRulesResult build(java.util.Map<String, ?> map) throws Exception {
        ManageAlertRulesResult self = new ManageAlertRulesResult();
        return TeaModel.build(map, self);
    }

    public ManageAlertRulesResult setAlertRule(AlertRuleV2 alertRule) {
        this.alertRule = alertRule;
        return this;
    }
    public AlertRuleV2 getAlertRule() {
        return this.alertRule;
    }

    public ManageAlertRulesResult setDeletedCount(Integer deletedCount) {
        this.deletedCount = deletedCount;
        return this;
    }
    public Integer getDeletedCount() {
        return this.deletedCount;
    }

    public ManageAlertRulesResult setDeletedUuidList(java.util.List<String> deletedUuidList) {
        this.deletedUuidList = deletedUuidList;
        return this;
    }
    public java.util.List<String> getDeletedUuidList() {
        return this.deletedUuidList;
    }

    public ManageAlertRulesResult setUpdatedCount(Integer updatedCount) {
        this.updatedCount = updatedCount;
        return this;
    }
    public Integer getUpdatedCount() {
        return this.updatedCount;
    }

    public ManageAlertRulesResult setUpdatedUuidList(java.util.List<String> updatedUuidList) {
        this.updatedUuidList = updatedUuidList;
        return this;
    }
    public java.util.List<String> getUpdatedUuidList() {
        return this.updatedUuidList;
    }

}
