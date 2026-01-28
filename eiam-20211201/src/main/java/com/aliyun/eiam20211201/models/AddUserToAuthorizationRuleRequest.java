// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddUserToAuthorizationRuleRequest extends TeaModel {
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
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>账户ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>有效周期，当validityPeriodType为custom有效。</p>
     */
    @NameInMap("ValidityPeriod")
    public AddUserToAuthorizationRuleRequestValidityPeriod validityPeriod;

    /**
     * <p>有效期类型，枚举值：permanent（永久），time_bound（自定义时间范围）。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("ValidityType")
    public String validityType;

    public static AddUserToAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToAuthorizationRuleRequest self = new AddUserToAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToAuthorizationRuleRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public AddUserToAuthorizationRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddUserToAuthorizationRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddUserToAuthorizationRuleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AddUserToAuthorizationRuleRequest setValidityPeriod(AddUserToAuthorizationRuleRequestValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }
    public AddUserToAuthorizationRuleRequestValidityPeriod getValidityPeriod() {
        return this.validityPeriod;
    }

    public AddUserToAuthorizationRuleRequest setValidityType(String validityType) {
        this.validityType = validityType;
        return this;
    }
    public String getValidityType() {
        return this.validityType;
    }

    public static class AddUserToAuthorizationRuleRequestValidityPeriod extends TeaModel {
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

        public static AddUserToAuthorizationRuleRequestValidityPeriod build(java.util.Map<String, ?> map) throws Exception {
            AddUserToAuthorizationRuleRequestValidityPeriod self = new AddUserToAuthorizationRuleRequestValidityPeriod();
            return TeaModel.build(map, self);
        }

        public AddUserToAuthorizationRuleRequestValidityPeriod setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public AddUserToAuthorizationRuleRequestValidityPeriod setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
