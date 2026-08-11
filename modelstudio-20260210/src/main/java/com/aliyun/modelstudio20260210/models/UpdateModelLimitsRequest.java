// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateModelLimitsRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-ac3ef438bec22dc5</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <p>The throttling values for the workspace.</p>
     */
    @NameInMap("workspaceLimits")
    public java.util.List<UpdateModelLimitsRequestWorkspaceLimits> workspaceLimits;

    public static UpdateModelLimitsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelLimitsRequest self = new UpdateModelLimitsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelLimitsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateModelLimitsRequest setWorkspaceLimits(java.util.List<UpdateModelLimitsRequestWorkspaceLimits> workspaceLimits) {
        this.workspaceLimits = workspaceLimits;
        return this;
    }
    public java.util.List<UpdateModelLimitsRequestWorkspaceLimits> getWorkspaceLimits() {
        return this.workspaceLimits;
    }

    public static class UpdateModelLimitsRequestWorkspaceLimits extends TeaModel {
        /**
         * <p>The model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The throttling operation type. Valid values:</p>
         * <ul>
         * <li><strong>OVERLAY</strong>: Sets or overwrites the throttling configuration.</li>
         * <li><strong>DELETE</strong>: Deletes the throttling configuration (restores to no throttling).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OVERLAY</p>
         */
        @NameInMap("operationType")
        public String operationType;

        /**
         * <p>The request throttling value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("requestLimit")
        public Long requestLimit;

        /**
         * <p>The time period for request throttling. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("requestLimitPeriod")
        public Long requestLimitPeriod;

        /**
         * <p>The usage throttling value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("usageLimit")
        public Long usageLimit;

        /**
         * <p>The time period for usage throttling. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("usageLimitPeriod")
        public Long usageLimitPeriod;

        public static UpdateModelLimitsRequestWorkspaceLimits build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelLimitsRequestWorkspaceLimits self = new UpdateModelLimitsRequestWorkspaceLimits();
            return TeaModel.build(map, self);
        }

        public UpdateModelLimitsRequestWorkspaceLimits setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateModelLimitsRequestWorkspaceLimits setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public UpdateModelLimitsRequestWorkspaceLimits setRequestLimit(Long requestLimit) {
            this.requestLimit = requestLimit;
            return this;
        }
        public Long getRequestLimit() {
            return this.requestLimit;
        }

        public UpdateModelLimitsRequestWorkspaceLimits setRequestLimitPeriod(Long requestLimitPeriod) {
            this.requestLimitPeriod = requestLimitPeriod;
            return this;
        }
        public Long getRequestLimitPeriod() {
            return this.requestLimitPeriod;
        }

        public UpdateModelLimitsRequestWorkspaceLimits setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        public UpdateModelLimitsRequestWorkspaceLimits setUsageLimitPeriod(Long usageLimitPeriod) {
            this.usageLimitPeriod = usageLimitPeriod;
            return this;
        }
        public Long getUsageLimitPeriod() {
            return this.usageLimitPeriod;
        }

    }

}
