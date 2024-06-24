// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IsvRuleSaveRequest extends TeaModel {
    @NameInMap("apply_need")
    public Boolean applyNeed;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("book_type")
    public String bookType;

    @NameInMap("bookuser_list")
    public java.util.List<IsvRuleSaveRequestBookuserList> bookuserList;

    @NameInMap("rule_need")
    public Boolean ruleNeed;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static IsvRuleSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        IsvRuleSaveRequest self = new IsvRuleSaveRequest();
        return TeaModel.build(map, self);
    }

    public IsvRuleSaveRequest setApplyNeed(Boolean applyNeed) {
        this.applyNeed = applyNeed;
        return this;
    }
    public Boolean getApplyNeed() {
        return this.applyNeed;
    }

    public IsvRuleSaveRequest setBookType(String bookType) {
        this.bookType = bookType;
        return this;
    }
    public String getBookType() {
        return this.bookType;
    }

    public IsvRuleSaveRequest setBookuserList(java.util.List<IsvRuleSaveRequestBookuserList> bookuserList) {
        this.bookuserList = bookuserList;
        return this;
    }
    public java.util.List<IsvRuleSaveRequestBookuserList> getBookuserList() {
        return this.bookuserList;
    }

    public IsvRuleSaveRequest setRuleNeed(Boolean ruleNeed) {
        this.ruleNeed = ruleNeed;
        return this;
    }
    public Boolean getRuleNeed() {
        return this.ruleNeed;
    }

    public IsvRuleSaveRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public IsvRuleSaveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class IsvRuleSaveRequestBookuserList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("entity_id")
        public String entityId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("entity_type")
        public Integer entityType;

        public static IsvRuleSaveRequestBookuserList build(java.util.Map<String, ?> map) throws Exception {
            IsvRuleSaveRequestBookuserList self = new IsvRuleSaveRequestBookuserList();
            return TeaModel.build(map, self);
        }

        public IsvRuleSaveRequestBookuserList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public IsvRuleSaveRequestBookuserList setEntityType(Integer entityType) {
            this.entityType = entityType;
            return this;
        }
        public Integer getEntityType() {
            return this.entityType;
        }

    }

}
