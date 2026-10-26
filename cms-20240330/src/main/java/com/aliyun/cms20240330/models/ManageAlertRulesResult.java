// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesResult extends TeaModel {
    /**
     * <p>The V2 alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;uuid&quot;:&quot;cms_v2_81d01768-fee9-459f-af49-ab2704f1db2b&quot;,&quot;displayName&quot;:&quot;drill-e2e-验证规则&quot;,&quot;enabled&quot;:true}</p>
     */
    @NameInMap("alertRule")
    public AlertRuleV2 alertRule;

    /**
     * <p>The number of successfully deleted rules.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deletedCount")
    public Integer deletedCount;

    /**
     * <p>The list of UUIDs of successfully deleted rules.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cms_v2_81d01768-fee9-459f-af49-ab2704f1db2b&quot;]</p>
     */
    @NameInMap("deletedUuidList")
    public java.util.List<String> deletedUuidList;

    /**
     * <strong>example:</strong>
     * <p>7c27ee14-5f94-469f-912d-476f79c8a861</p>
     */
    @NameInMap("drillUuid")
    public String drillUuid;

    /**
     * <p>The number of successfully enabled or disabled rules.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("updatedCount")
    public Integer updatedCount;

    /**
     * <p>The list of UUIDs of successfully enabled or disabled rules.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890&quot;,&quot;b2c3d4e5-f6a7-8901-bcde-f12345678901&quot;]</p>
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

    public ManageAlertRulesResult setDrillUuid(String drillUuid) {
        this.drillUuid = drillUuid;
        return this;
    }
    public String getDrillUuid() {
        return this.drillUuid;
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
