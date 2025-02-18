// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateComputeQuotaPlanRequest extends TeaModel {
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
    public CreateComputeQuotaPlanRequestQuota quota;

    public static CreateComputeQuotaPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeQuotaPlanRequest self = new CreateComputeQuotaPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeQuotaPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateComputeQuotaPlanRequest setQuota(CreateComputeQuotaPlanRequestQuota quota) {
        this.quota = quota;
        return this;
    }
    public CreateComputeQuotaPlanRequestQuota getQuota() {
        return this.quota;
    }

    public static class CreateComputeQuotaPlanRequestQuotaParameter extends TeaModel {
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

        public static CreateComputeQuotaPlanRequestQuotaParameter build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeQuotaPlanRequestQuotaParameter self = new CreateComputeQuotaPlanRequestQuotaParameter();
            return TeaModel.build(map, self);
        }

        public CreateComputeQuotaPlanRequestQuotaParameter setElasticReservedCU(Long elasticReservedCU) {
            this.elasticReservedCU = elasticReservedCU;
            return this;
        }
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

    }

    public static class CreateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter extends TeaModel {
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

        public static CreateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter self = new CreateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter();
            return TeaModel.build(map, self);
        }

        public CreateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter setElasticReservedCU(Long elasticReservedCU) {
            this.elasticReservedCU = elasticReservedCU;
            return this;
        }
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        public CreateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter setMaxCU(Long maxCU) {
            this.maxCU = maxCU;
            return this;
        }
        public Long getMaxCU() {
            return this.maxCU;
        }

        public CreateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter setMinCU(Long minCU) {
            this.minCU = minCU;
            return this;
        }
        public Long getMinCU() {
            return this.minCU;
        }

    }

    public static class CreateComputeQuotaPlanRequestQuotaSubQuotaInfoList extends TeaModel {
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
        public CreateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter parameter;

        public static CreateComputeQuotaPlanRequestQuotaSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeQuotaPlanRequestQuotaSubQuotaInfoList self = new CreateComputeQuotaPlanRequestQuotaSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public CreateComputeQuotaPlanRequestQuotaSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public CreateComputeQuotaPlanRequestQuotaSubQuotaInfoList setParameter(CreateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public CreateComputeQuotaPlanRequestQuotaSubQuotaInfoListParameter getParameter() {
            return this.parameter;
        }

    }

    public static class CreateComputeQuotaPlanRequestQuota extends TeaModel {
        /**
         * <p>The parameters of level-1 quota.</p>
         */
        @NameInMap("parameter")
        public CreateComputeQuotaPlanRequestQuotaParameter parameter;

        /**
         * <p>The list of level-2 quotas.</p>
         */
        @NameInMap("subQuotaInfoList")
        public java.util.List<CreateComputeQuotaPlanRequestQuotaSubQuotaInfoList> subQuotaInfoList;

        public static CreateComputeQuotaPlanRequestQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeQuotaPlanRequestQuota self = new CreateComputeQuotaPlanRequestQuota();
            return TeaModel.build(map, self);
        }

        public CreateComputeQuotaPlanRequestQuota setParameter(CreateComputeQuotaPlanRequestQuotaParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public CreateComputeQuotaPlanRequestQuotaParameter getParameter() {
            return this.parameter;
        }

        public CreateComputeQuotaPlanRequestQuota setSubQuotaInfoList(java.util.List<CreateComputeQuotaPlanRequestQuotaSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<CreateComputeQuotaPlanRequestQuotaSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

    }

}
