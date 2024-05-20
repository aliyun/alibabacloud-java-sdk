// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgWhiteListAddOrUpdateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WhiteLists")
    public java.util.List<DsgWhiteListAddOrUpdateRequestWhiteLists> whiteLists;

    public static DsgWhiteListAddOrUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgWhiteListAddOrUpdateRequest self = new DsgWhiteListAddOrUpdateRequest();
        return TeaModel.build(map, self);
    }

    public DsgWhiteListAddOrUpdateRequest setWhiteLists(java.util.List<DsgWhiteListAddOrUpdateRequestWhiteLists> whiteLists) {
        this.whiteLists = whiteLists;
        return this;
    }
    public java.util.List<DsgWhiteListAddOrUpdateRequestWhiteLists> getWhiteLists() {
        return this.whiteLists;
    }

    public static class DsgWhiteListAddOrUpdateRequestWhiteLists extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public Integer id;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleId")
        public Integer ruleId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<Integer> userGroupIds;

        public static DsgWhiteListAddOrUpdateRequestWhiteLists build(java.util.Map<String, ?> map) throws Exception {
            DsgWhiteListAddOrUpdateRequestWhiteLists self = new DsgWhiteListAddOrUpdateRequestWhiteLists();
            return TeaModel.build(map, self);
        }

        public DsgWhiteListAddOrUpdateRequestWhiteLists setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DsgWhiteListAddOrUpdateRequestWhiteLists setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DsgWhiteListAddOrUpdateRequestWhiteLists setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public DsgWhiteListAddOrUpdateRequestWhiteLists setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DsgWhiteListAddOrUpdateRequestWhiteLists setUserGroupIds(java.util.List<Integer> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<Integer> getUserGroupIds() {
            return this.userGroupIds;
        }

    }

}
