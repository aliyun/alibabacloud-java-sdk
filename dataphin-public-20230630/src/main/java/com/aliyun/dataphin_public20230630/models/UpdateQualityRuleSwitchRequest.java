// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateQualityRuleSwitchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateQualityRuleSwitchRequestUpdateCommand updateCommand;

    public static UpdateQualityRuleSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityRuleSwitchRequest self = new UpdateQualityRuleSwitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQualityRuleSwitchRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateQualityRuleSwitchRequest setUpdateCommand(UpdateQualityRuleSwitchRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateQualityRuleSwitchRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateQualityRuleSwitchRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Open")
        public Boolean open;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleIdList")
        public java.util.List<Long> ruleIdList;

        public static UpdateQualityRuleSwitchRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateQualityRuleSwitchRequestUpdateCommand self = new UpdateQualityRuleSwitchRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateQualityRuleSwitchRequestUpdateCommand setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

        public UpdateQualityRuleSwitchRequestUpdateCommand setRuleIdList(java.util.List<Long> ruleIdList) {
            this.ruleIdList = ruleIdList;
            return this;
        }
        public java.util.List<Long> getRuleIdList() {
            return this.ruleIdList;
        }

    }

}
