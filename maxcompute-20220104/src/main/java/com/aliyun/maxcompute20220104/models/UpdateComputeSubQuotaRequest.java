// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateComputeSubQuotaRequest extends TeaModel {
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
        @NameInMap("enablePriority")
        public Boolean enablePriority;

        @NameInMap("forceReservedMin")
        public Boolean forceReservedMin;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("maxCU")
        public Long maxCU;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("minCU")
        public Long minCU;

        @NameInMap("schedulerType")
        public String schedulerType;

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
         * <p>This parameter is required.</p>
         */
        @NameInMap("nickName")
        public String nickName;

        @NameInMap("parameter")
        public UpdateComputeSubQuotaRequestSubQuotaInfoListParameter parameter;

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
