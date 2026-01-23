// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteQualityRulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteQualityRulesRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteQualityRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityRulesRequest self = new DeleteQualityRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualityRulesRequest setDeleteCommand(DeleteQualityRulesRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteQualityRulesRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteQualityRulesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteQualityRulesRequestDeleteCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleIdList")
        public java.util.List<Long> ruleIdList;

        public static DeleteQualityRulesRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteQualityRulesRequestDeleteCommand self = new DeleteQualityRulesRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteQualityRulesRequestDeleteCommand setRuleIdList(java.util.List<Long> ruleIdList) {
            this.ruleIdList = ruleIdList;
            return this;
        }
        public java.util.List<Long> getRuleIdList() {
            return this.ruleIdList;
        }

    }

}
