// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateComputeSubQuotaRequest extends TeaModel {
    /**
     * <p>The list of level-2 quotas.</p>
     */
    @NameInMap("subQuotaInfoList")
    public java.util.List<UpdateComputeSubQuotaRequestSubQuotaInfoList> subQuotaInfoList;

    public static UpdateComputeSubQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeSubQuotaRequest self = new UpdateComputeSubQuotaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputeSubQuotaRequest setSubQuotaInfoList(java.util.List<UpdateComputeSubQuotaRequestSubQuotaInfoList> subQuotaInfoList) {
        this.subQuotaInfoList = subQuotaInfoList;
        return this;
    }
    public java.util.List<UpdateComputeSubQuotaRequestSubQuotaInfoList> getSubQuotaInfoList() {
        return this.subQuotaInfoList;
    }

    public static class UpdateComputeSubQuotaRequestSubQuotaInfoListParameter extends TeaModel {
        /**
         * <p>Specifies whether to enable the priority feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enablePriority")
        public Boolean enablePriority;

        /**
         * <p>Specifies whether the quota is strongly exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("forceReservedMin")
        public Boolean forceReservedMin;

        /**
         * <p>The value of minCU in Reserved CUs.</p>
         * <blockquote>
         * <p>The value of maxCU must be less than or equal to the value of maxCU in the level-1 quota that you purchased.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("maxCU")
        public Long maxCU;

        /**
         * <p>The value of maxCU in Reserved CUs.</p>
         * <blockquote>
         * <ul>
         * <li>The total value of minCU in all the level-2 quotas is equal to the value of minCU in the level-1 quota.</li>
         * <li>The value of minCU must be less than or equal to the value of maxCU in the level-2 quota and less than or equal to the value of minCU in the level-1 quota that you purchased.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("minCU")
        public Long minCU;

        /**
         * <p>Scheduling policy of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>Fifo/Fair</p>
         */
        @NameInMap("schedulerType")
        public String schedulerType;

        /**
         * <p>The upper limit for CUs that can be concurrently used by a job scheduled to the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("singleJobCULimit")
        public Long singleJobCULimit;

        public static UpdateComputeSubQuotaRequestSubQuotaInfoListParameter build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeSubQuotaRequestSubQuotaInfoListParameter self = new UpdateComputeSubQuotaRequestSubQuotaInfoListParameter();
            return TeaModel.build(map, self);
        }

        public UpdateComputeSubQuotaRequestSubQuotaInfoListParameter setEnablePriority(Boolean enablePriority) {
            this.enablePriority = enablePriority;
            return this;
        }
        public Boolean getEnablePriority() {
            return this.enablePriority;
        }

        public UpdateComputeSubQuotaRequestSubQuotaInfoListParameter setForceReservedMin(Boolean forceReservedMin) {
            this.forceReservedMin = forceReservedMin;
            return this;
        }
        public Boolean getForceReservedMin() {
            return this.forceReservedMin;
        }

        public UpdateComputeSubQuotaRequestSubQuotaInfoListParameter setMaxCU(Long maxCU) {
            this.maxCU = maxCU;
            return this;
        }
        public Long getMaxCU() {
            return this.maxCU;
        }

        public UpdateComputeSubQuotaRequestSubQuotaInfoListParameter setMinCU(Long minCU) {
            this.minCU = minCU;
            return this;
        }
        public Long getMinCU() {
            return this.minCU;
        }

        public UpdateComputeSubQuotaRequestSubQuotaInfoListParameter setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public UpdateComputeSubQuotaRequestSubQuotaInfoListParameter setSingleJobCULimit(Long singleJobCULimit) {
            this.singleJobCULimit = singleJobCULimit;
            return this;
        }
        public Long getSingleJobCULimit() {
            return this.singleJobCULimit;
        }

    }

    public static class UpdateComputeSubQuotaRequestSubQuotaInfoList extends TeaModel {
        /**
         * <p>The nickname of the level-2 quota.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>os_ComputeQuota</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>The parameters of the level-2 quota.</p>
         */
        @NameInMap("parameter")
        public UpdateComputeSubQuotaRequestSubQuotaInfoListParameter parameter;

        /**
         * <p>The type of quota.</p>
         * <blockquote>
         * <ul>
         * <li>FUXI_OFFLINE(default) : Quotas of this type are used to run batch jobs.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FUXI_OFFLINE</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateComputeSubQuotaRequestSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeSubQuotaRequestSubQuotaInfoList self = new UpdateComputeSubQuotaRequestSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public UpdateComputeSubQuotaRequestSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public UpdateComputeSubQuotaRequestSubQuotaInfoList setParameter(UpdateComputeSubQuotaRequestSubQuotaInfoListParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public UpdateComputeSubQuotaRequestSubQuotaInfoListParameter getParameter() {
            return this.parameter;
        }

        public UpdateComputeSubQuotaRequestSubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
