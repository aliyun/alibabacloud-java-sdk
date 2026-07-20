// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardRelateDeleteRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("from_group")
    public Boolean fromGroup;

    @NameInMap("remove_list")
    public java.util.List<TravelStandardRelateDeleteRequestRemoveList> removeList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6523763</p>
     */
    @NameInMap("rule_id")
    public Long ruleId;

    public static TravelStandardRelateDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardRelateDeleteRequest self = new TravelStandardRelateDeleteRequest();
        return TeaModel.build(map, self);
    }

    public TravelStandardRelateDeleteRequest setFromGroup(Boolean fromGroup) {
        this.fromGroup = fromGroup;
        return this;
    }
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    public TravelStandardRelateDeleteRequest setRemoveList(java.util.List<TravelStandardRelateDeleteRequestRemoveList> removeList) {
        this.removeList = removeList;
        return this;
    }
    public java.util.List<TravelStandardRelateDeleteRequestRemoveList> getRemoveList() {
        return this.removeList;
    }

    public TravelStandardRelateDeleteRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public static class TravelStandardRelateDeleteRequestRemoveList extends TeaModel {
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

        public static TravelStandardRelateDeleteRequestRemoveList build(java.util.Map<String, ?> map) throws Exception {
            TravelStandardRelateDeleteRequestRemoveList self = new TravelStandardRelateDeleteRequestRemoveList();
            return TeaModel.build(map, self);
        }

        public TravelStandardRelateDeleteRequestRemoveList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public TravelStandardRelateDeleteRequestRemoveList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

}
