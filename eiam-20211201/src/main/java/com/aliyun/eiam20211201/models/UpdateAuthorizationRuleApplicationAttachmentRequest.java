// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationRuleApplicationAttachmentRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

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
     * <p>A client token to ensure the idempotence of the request. Generate a unique value from your client for this parameter. The ClientToken can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
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
     * <p>The time range of the validity period. This parameter takes effect only when <strong>ValidityType</strong> is set to <strong>time_bound</strong>.</p>
     */
    @NameInMap("ValidityPeriod")
    public UpdateAuthorizationRuleApplicationAttachmentRequestValidityPeriod validityPeriod;

    /**
     * <p>The validity type of the relationship. Valid values:</p>
     * <ul>
     * <li><p>permanent: The relationship is permanent.</p>
     * </li>
     * <li><p>time_bound: The relationship is valid for a custom time range.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("ValidityType")
    public String validityType;

    public static UpdateAuthorizationRuleApplicationAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationRuleApplicationAttachmentRequest self = new UpdateAuthorizationRuleApplicationAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationRuleApplicationAttachmentRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateAuthorizationRuleApplicationAttachmentRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public UpdateAuthorizationRuleApplicationAttachmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAuthorizationRuleApplicationAttachmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAuthorizationRuleApplicationAttachmentRequest setValidityPeriod(UpdateAuthorizationRuleApplicationAttachmentRequestValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }
    public UpdateAuthorizationRuleApplicationAttachmentRequestValidityPeriod getValidityPeriod() {
        return this.validityPeriod;
    }

    public UpdateAuthorizationRuleApplicationAttachmentRequest setValidityType(String validityType) {
        this.validityType = validityType;
        return this;
    }
    public String getValidityType() {
        return this.validityType;
    }

    public static class UpdateAuthorizationRuleApplicationAttachmentRequestValidityPeriod extends TeaModel {
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

        public static UpdateAuthorizationRuleApplicationAttachmentRequestValidityPeriod build(java.util.Map<String, ?> map) throws Exception {
            UpdateAuthorizationRuleApplicationAttachmentRequestValidityPeriod self = new UpdateAuthorizationRuleApplicationAttachmentRequestValidityPeriod();
            return TeaModel.build(map, self);
        }

        public UpdateAuthorizationRuleApplicationAttachmentRequestValidityPeriod setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public UpdateAuthorizationRuleApplicationAttachmentRequestValidityPeriod setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
