// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleUserAttachmentRequest extends TeaModel {
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
     * <p>A client token used to ensure the idempotence of the request. Generate a unique value from your client for this parameter. ClientToken supports only ASCII characters and must be no more than 64 characters long. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
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
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The time range of the validity period. This parameter takes effect when ValidityType is set to time_bound.</p>
     */
    @NameInMap("ValidityPeriod")
    public UpdateAuthorizationRuleUserAttachmentRequestValidityPeriod validityPeriod;

    /**
     * <p>The validity period type of the association. Valid values:</p>
     * <ul>
     * <li><p>permanent: The association is permanent.</p>
     * </li>
     * <li><p>time_bound: The association is valid for a custom time range.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("ValidityType")
    public String validityType;

    public static UpdateAuthorizationRuleUserAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleUserAttachmentRequest self = new UpdateAuthorizationRuleUserAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleUserAttachmentRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public UpdateAuthorizationRuleUserAttachmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAuthorizationRuleUserAttachmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAuthorizationRuleUserAttachmentRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateAuthorizationRuleUserAttachmentRequest setValidityPeriod(UpdateAuthorizationRuleUserAttachmentRequestValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }
    public UpdateAuthorizationRuleUserAttachmentRequestValidityPeriod getValidityPeriod() {
        return this.validityPeriod;
    }

    public UpdateAuthorizationRuleUserAttachmentRequest setValidityType(String validityType) {
        this.validityType = validityType;
        return this;
    }
    public String getValidityType() {
        return this.validityType;
    }

    public static class UpdateAuthorizationRuleUserAttachmentRequestValidityPeriod extends TeaModel {
        /**
         * <p>The end time of the validity period. This is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1704062061000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time of the validity period. This is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1704042061000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static UpdateAuthorizationRuleUserAttachmentRequestValidityPeriod build(java.util.Map<String, ?> map) throws Exception {
            UpdateAuthorizationRuleUserAttachmentRequestValidityPeriod self = new UpdateAuthorizationRuleUserAttachmentRequestValidityPeriod();
            return TeaModel.build(map, self);
        }

        public UpdateAuthorizationRuleUserAttachmentRequestValidityPeriod setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public UpdateAuthorizationRuleUserAttachmentRequestValidityPeriod setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
