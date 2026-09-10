// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesResult extends TeaModel {
    /**
     * <p>The alert rule V2.</p>
     */
    @NameInMap("alertRule")
    public AlertRuleV2 alertRule;

    /**
     * <p>The number of rules that were successfully deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deletedCount")
    public Integer deletedCount;

    /**
     * <p>The list of UUIDs of rules that were successfully deleted.</p>
     */
    @NameInMap("deletedUuidList")
    public java.util.List<String> deletedUuidList;

    /**
     * <p>The number of rules that were successfully enabled or disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("updatedCount")
    public Integer updatedCount;

    /**
     * <p>The list of UUIDs of rules that were successfully enabled or disabled.</p>
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
