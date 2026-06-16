// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AddUserToAuthorizationRuleRequest extends TeaModel {
    /**
     * <p>The authorization rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
     */
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    /**
     * <p>A client token that you provide to ensure the idempotence of the request. Make sure that the client token is unique for each request. The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The time range of the validity period. This parameter is valid only when <strong>ValidityType</strong> is set to <strong>time_bound</strong>.</p>
     */
    @NameInMap("ValidityPeriod")
    public AddUserToAuthorizationRuleRequestValidityPeriod validityPeriod;

    /**
     * <p>The type of the validity period for the relationship. Valid values:</p>
     * <ul>
     * <li><p>permanent: The authorization is permanent.</p>
     * </li>
     * <li><p>time_bound: The authorization is valid for a custom time range.</p>
     * </li>
     * </ul>
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
         * <p>The end time of the validity period. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1704062061000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time of the validity period. The value is a UNIX timestamp. Unit: milliseconds.</p>
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
