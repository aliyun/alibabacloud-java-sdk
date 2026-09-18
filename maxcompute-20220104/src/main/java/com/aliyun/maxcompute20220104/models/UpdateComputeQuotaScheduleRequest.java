// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateComputeQuotaScheduleRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     */
    @NameInMap("body")
    public java.util.List<UpdateComputeQuotaScheduleRequestBody> body;

    /**
     * <p>The time zone.</p>
     * <blockquote>
     * <p>The default value is UTC+8.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>UTC+8</p>
     */
    @NameInMap("scheduleTimezone")
    public String scheduleTimezone;

    public static UpdateComputeQuotaScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeQuotaScheduleRequest self = new UpdateComputeQuotaScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputeQuotaScheduleRequest setBody(java.util.List<UpdateComputeQuotaScheduleRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<UpdateComputeQuotaScheduleRequestBody> getBody() {
        return this.body;
    }

    public UpdateComputeQuotaScheduleRequest setScheduleTimezone(String scheduleTimezone) {
        this.scheduleTimezone = scheduleTimezone;
        return this;
    }
    public String getScheduleTimezone() {
        return this.scheduleTimezone;
    }

    public static class UpdateComputeQuotaScheduleRequestBodyCondition extends TeaModel {
        /**
         * <p>The time when the plan takes effect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00</p>
         */
        @NameInMap("at")
        public String at;

        public static UpdateComputeQuotaScheduleRequestBodyCondition build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeQuotaScheduleRequestBodyCondition self = new UpdateComputeQuotaScheduleRequestBodyCondition();
            return TeaModel.build(map, self);
        }

        public UpdateComputeQuotaScheduleRequestBodyCondition setAt(String at) {
            this.at = at;
            return this;
        }
        public String getAt() {
            return this.at;
        }

    }

    public static class UpdateComputeQuotaScheduleRequestBody extends TeaModel {
        /**
         * <p>The condition for the plan to take effect.</p>
         */
        @NameInMap("condition")
        public UpdateComputeQuotaScheduleRequestBodyCondition condition;

        /**
         * <p>The name of the quota plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        @NameInMap("plan")
        public String plan;

        /**
         * <p>The type.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>Only daily is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>daily</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateComputeQuotaScheduleRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeQuotaScheduleRequestBody self = new UpdateComputeQuotaScheduleRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateComputeQuotaScheduleRequestBody setCondition(UpdateComputeQuotaScheduleRequestBodyCondition condition) {
            this.condition = condition;
            return this;
        }
        public UpdateComputeQuotaScheduleRequestBodyCondition getCondition() {
            return this.condition;
        }

        public UpdateComputeQuotaScheduleRequestBody setPlan(String plan) {
            this.plan = plan;
            return this;
        }
        public String getPlan() {
            return this.plan;
        }

        public UpdateComputeQuotaScheduleRequestBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
