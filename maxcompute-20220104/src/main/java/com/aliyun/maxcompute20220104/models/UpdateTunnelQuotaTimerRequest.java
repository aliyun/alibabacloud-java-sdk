// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateTunnelQuotaTimerRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public java.util.List<UpdateTunnelQuotaTimerRequestBody> body;

    @NameInMap("timezone")
    public String timezone;

    public static UpdateTunnelQuotaTimerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTunnelQuotaTimerRequest self = new UpdateTunnelQuotaTimerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTunnelQuotaTimerRequest setBody(java.util.List<UpdateTunnelQuotaTimerRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<UpdateTunnelQuotaTimerRequestBody> getBody() {
        return this.body;
    }

    public UpdateTunnelQuotaTimerRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public static class UpdateTunnelQuotaTimerRequestBodyTunnelQuotaParameter extends TeaModel {
        /**
         * <p>The number of elastically reserved slots.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("elasticReservedSlotNum")
        public Long elasticReservedSlotNum;

        /**
         * <p>The number of reserved slots.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("slotNum")
        public Long slotNum;

        public static UpdateTunnelQuotaTimerRequestBodyTunnelQuotaParameter build(java.util.Map<String, ?> map) throws Exception {
            UpdateTunnelQuotaTimerRequestBodyTunnelQuotaParameter self = new UpdateTunnelQuotaTimerRequestBodyTunnelQuotaParameter();
            return TeaModel.build(map, self);
        }

        public UpdateTunnelQuotaTimerRequestBodyTunnelQuotaParameter setElasticReservedSlotNum(Long elasticReservedSlotNum) {
            this.elasticReservedSlotNum = elasticReservedSlotNum;
            return this;
        }
        public Long getElasticReservedSlotNum() {
            return this.elasticReservedSlotNum;
        }

        public UpdateTunnelQuotaTimerRequestBodyTunnelQuotaParameter setSlotNum(Long slotNum) {
            this.slotNum = slotNum;
            return this;
        }
        public Long getSlotNum() {
            return this.slotNum;
        }

    }

    public static class UpdateTunnelQuotaTimerRequestBody extends TeaModel {
        /**
         * <p>The start time of the time-specific configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("beginTime")
        public String beginTime;

        /**
         * <p>The end time of the time-specific configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The parameters for the time-specific configuration.</p>
         */
        @NameInMap("tunnelQuotaParameter")
        public UpdateTunnelQuotaTimerRequestBodyTunnelQuotaParameter tunnelQuotaParameter;

        public static UpdateTunnelQuotaTimerRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateTunnelQuotaTimerRequestBody self = new UpdateTunnelQuotaTimerRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateTunnelQuotaTimerRequestBody setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public UpdateTunnelQuotaTimerRequestBody setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateTunnelQuotaTimerRequestBody setTunnelQuotaParameter(UpdateTunnelQuotaTimerRequestBodyTunnelQuotaParameter tunnelQuotaParameter) {
            this.tunnelQuotaParameter = tunnelQuotaParameter;
            return this;
        }
        public UpdateTunnelQuotaTimerRequestBodyTunnelQuotaParameter getTunnelQuotaParameter() {
            return this.tunnelQuotaParameter;
        }

    }

}
