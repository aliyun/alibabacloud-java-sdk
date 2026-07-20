// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardRelateAddRequest extends TeaModel {
    @NameInMap("add_list")
    public java.util.List<TravelStandardRelateAddRequestAddList> addList;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("from_group")
    public Boolean fromGroup;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6516571</p>
     */
    @NameInMap("rule_id")
    public Long ruleId;

    public static TravelStandardRelateAddRequest build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardRelateAddRequest self = new TravelStandardRelateAddRequest();
        return TeaModel.build(map, self);
    }

    public TravelStandardRelateAddRequest setAddList(java.util.List<TravelStandardRelateAddRequestAddList> addList) {
        this.addList = addList;
        return this;
    }
    public java.util.List<TravelStandardRelateAddRequestAddList> getAddList() {
        return this.addList;
    }

    public TravelStandardRelateAddRequest setFromGroup(Boolean fromGroup) {
        this.fromGroup = fromGroup;
        return this;
    }
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    public TravelStandardRelateAddRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public static class TravelStandardRelateAddRequestAddList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>667104628</p>
         */
        @NameInMap("entity_id")
        public String entityId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("entity_type")
        public String entityType;

        public static TravelStandardRelateAddRequestAddList build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardRelateAddRequestAddList self = new TravelStandardRelateAddRequestAddList();
            return TeaModel.build(map, self);
        }

        public TravelStandardRelateAddRequestAddList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public TravelStandardRelateAddRequestAddList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}
