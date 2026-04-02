// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesResult extends TeaModel {
    @NameInMap("alertRule")
    public AlertRuleV2 alertRule;

    /**
     * <p>成功删除的规则数量</p>
     */
    @NameInMap("deletedCount")
    public Integer deletedCount;

    /**
     * <p>成功删除的规则 UUID 列表</p>
     */
    @NameInMap("deletedUuidList")
    public java.util.List<String> deletedUuidList;

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

}
