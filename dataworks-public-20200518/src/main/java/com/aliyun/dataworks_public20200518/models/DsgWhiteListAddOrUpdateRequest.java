// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgWhiteListAddOrUpdateRequest extends TeaModel {
    /**
     * <p>A collection of whitelists.</p>
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
        /**
         * <p>The end of the time range to query. If you enter null, the whitelist is valid permanently.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the data masking whitelist.</p>
         * <ul>
         * <li>If you do not configure this parameter, the current operation is to add a data masking whitelist.</li>
         * <li>If you configure this parameter, the current operation is to modify a data masking whitelist. You can call the <a href="https://help.aliyun.com/document_detail/2786508.html">DsgWhiteListQueryList</a> operation to query the whitelist ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The ID of the data masking rule. You can call the <a href="https://help.aliyun.com/document_detail/2786578.html">DsgDesensPlanQueryList</a> operation to query the ID of the data masking rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("RuleId")
        public Integer ruleId;

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-10 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>A collection of user group IDs.</p>
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
