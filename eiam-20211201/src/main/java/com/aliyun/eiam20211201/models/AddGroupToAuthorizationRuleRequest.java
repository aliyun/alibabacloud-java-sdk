// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddGroupToAuthorizationRuleRequest extends TeaModel {
    /**
     * <p>授权规则标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
     */
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>组ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_miu8e4t4d7i4u7uwezgr54xxxx</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>有效周期，当validityPeriodType为custom有效。</p>
     */
    @NameInMap("ValidityPeriod")
    public AddGroupToAuthorizationRuleRequestValidityPeriod validityPeriod;

    /**
     * <p>有效期类型，枚举值：permanent（永久），time_bound（自定义时间范围）。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("ValidityType")
    public String validityType;

    public static AddGroupToAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGroupToAuthorizationRuleRequest self = new AddGroupToAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddGroupToAuthorizationRuleRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public AddGroupToAuthorizationRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddGroupToAuthorizationRuleRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddGroupToAuthorizationRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddGroupToAuthorizationRuleRequest setValidityPeriod(AddGroupToAuthorizationRuleRequestValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }
    public AddGroupToAuthorizationRuleRequestValidityPeriod getValidityPeriod() {
        return this.validityPeriod;
    }

    public AddGroupToAuthorizationRuleRequest setValidityType(String validityType) {
        this.validityType = validityType;
        return this;
    }
    public String getValidityType() {
        return this.validityType;
    }

    public static class AddGroupToAuthorizationRuleRequestValidityPeriod extends TeaModel {
        /**
         * <p>授权规则生效结束时间，采用unix纪元精确到毫秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1704062061000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>授权规则生效开始时间，采用unix纪元精确到毫秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1704042061000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static AddGroupToAuthorizationRuleRequestValidityPeriod build(java.util.Map<String, ?> map) throws Exception {
            AddGroupToAuthorizationRuleRequestValidityPeriod self = new AddGroupToAuthorizationRuleRequestValidityPeriod();
            return TeaModel.build(map, self);
        }

        public AddGroupToAuthorizationRuleRequestValidityPeriod setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public AddGroupToAuthorizationRuleRequestValidityPeriod setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
