// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateComputeQuotaPlanRequest extends TeaModel {
    /**
     * <p>The name of quota plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>planA</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The parameters of quota plan.</p>
     */
    @NameInMap("quota")
    public UpdateComputeQuotaPlanRequestQuota quota;

    public static UpdateComputeQuotaPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeQuotaPlanRequest self = new UpdateComputeQuotaPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputeQuotaPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateComputeQuotaPlanRequest setQuota(UpdateComputeQuotaPlanRequestQuota quota) {
        this.quota = quota;
        return this;
    }
    public UpdateComputeQuotaPlanRequestQuota getQuota() {
        return this.quota;
    }

    public static class UpdateComputeQuotaPlanRequestQuotaParameter extends TeaModel {
        /**
         * <p>The value of elastic Reserved CUs in the level-1 quota.</p>
         * <blockquote>
         * <p>The default value is 0. The maximum value of this parameter must be equal to the number of subscription-based reserved CUs and cannot exceed 10,000 CUs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("elasticReservedCU")
        public Long elasticReservedCU;

        public static UpdateComputeQuotaPlanRequestQuotaParameter build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeQuotaPlanRequestQuotaParameter self = new UpdateComputeQuotaPlanRequestQuotaParameter();
            return TeaModel.build(map, self);
        }

        public UpdateComputeQuotaPlanRequestQuotaParameter setElasticReservedCU(Long elasticReservedCU) {
            this.elasticReservedCU = elasticReservedCU;
            return this;
        }
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

    }

    public static class UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter extends TeaModel {
        /**
         * <p>The value of elastic Reserved CUs.</p>
         * <blockquote>
         * <p>The total number of elastically reserved CUs in all the level-2 quotas is equal to the number of elastically reserved CUs in the level-1 quota.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("elasticReservedCU")
        public Long elasticReservedCU;

        /**
         * <p>The value of maxCU in Reserved CUs.</p>
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
         * <p>The value of minCU in Reserved CUs.</p>
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

        public static UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter self = new UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter();
            return TeaModel.build(map, self);
        }

        public UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter setElasticReservedCU(Long elasticReservedCU) {
            this.elasticReservedCU = elasticReservedCU;
            return this;
        }
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        public UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter setMaxCU(Long maxCU) {
            this.maxCU = maxCU;
            return this;
        }
        public Long getMaxCU() {
            return this.maxCU;
        }

        public UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter setMinCU(Long minCU) {
            this.minCU = minCU;
            return this;
        }
        public Long getMinCU() {
            return this.minCU;
        }

    }

    public static class UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoList extends TeaModel {
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
        public UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter parameter;

        public static UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoList self = new UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoList setParameter(UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter getParameter() {
            return this.parameter;
        }

    }

    public static class UpdateComputeQuotaPlanRequestQuota extends TeaModel {
        /**
         * <p>The parameters of level-1 quota.</p>
         */
        @NameInMap("parameter")
        public UpdateComputeQuotaPlanRequestQuotaParameter parameter;

        /**
         * <p>The list of level-2 quotas.</p>
         */
        @NameInMap("subQuotaInfoList")
        public java.util.List<UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoList> subQuotaInfoList;

        public static UpdateComputeQuotaPlanRequestQuota build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeQuotaPlanRequestQuota self = new UpdateComputeQuotaPlanRequestQuota();
            return TeaModel.build(map, self);
        }

        public UpdateComputeQuotaPlanRequestQuota setParameter(UpdateComputeQuotaPlanRequestQuotaParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public UpdateComputeQuotaPlanRequestQuotaParameter getParameter() {
            return this.parameter;
        }

        public UpdateComputeQuotaPlanRequestQuota setSubQuotaInfoList(java.util.List<UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<UpdateComputeQuotaPlanRequestQuotaSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

    }

}
