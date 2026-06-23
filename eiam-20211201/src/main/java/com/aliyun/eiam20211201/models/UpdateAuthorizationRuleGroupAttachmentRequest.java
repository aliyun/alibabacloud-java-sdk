// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleGroupAttachmentRequest extends TeaModel {
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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate a parameter value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see References <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_miu8e4t4d7i4u7uwezgr54xxxx</p>
     */
    @NameInMap("GroupId")
    public String groupId;

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
     * <p>The time range of the validity period. This parameter takes effect only when <strong>ValidityType</strong> is set to <strong>time_bound</strong>.</p>
     */
    @NameInMap("ValidityPeriod")
    public UpdateAuthorizationRuleGroupAttachmentRequestValidityPeriod validityPeriod;

    /**
     * <p>The validity type of the relationship. Valid values:</p>
     * <ul>
     * <li>permanent: permanent</li>
     * <li>time_bound: custom time range.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("ValidityType")
    public String validityType;

    public static UpdateAuthorizationRuleGroupAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleGroupAttachmentRequest self = new UpdateAuthorizationRuleGroupAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleGroupAttachmentRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public UpdateAuthorizationRuleGroupAttachmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAuthorizationRuleGroupAttachmentRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateAuthorizationRuleGroupAttachmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAuthorizationRuleGroupAttachmentRequest setValidityPeriod(UpdateAuthorizationRuleGroupAttachmentRequestValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }
    public UpdateAuthorizationRuleGroupAttachmentRequestValidityPeriod getValidityPeriod() {
        return this.validityPeriod;
    }

    public UpdateAuthorizationRuleGroupAttachmentRequest setValidityType(String validityType) {
        this.validityType = validityType;
        return this;
    }
    public String getValidityType() {
        return this.validityType;
    }

    public static class UpdateAuthorizationRuleGroupAttachmentRequestValidityPeriod extends TeaModel {
        /**
         * <p>The end time of the validity period, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1704062061000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time of the validity period, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1704042061000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static UpdateAuthorizationRuleGroupAttachmentRequestValidityPeriod build(java.util.Map<String, ?> map) throws Exception {
            UpdateAuthorizationRuleGroupAttachmentRequestValidityPeriod self = new UpdateAuthorizationRuleGroupAttachmentRequestValidityPeriod();
            return TeaModel.build(map, self);
        }

        public UpdateAuthorizationRuleGroupAttachmentRequestValidityPeriod setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public UpdateAuthorizationRuleGroupAttachmentRequestValidityPeriod setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
