// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateComputeQuotaPlanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("elasticReservedCU")
        public Long elasticReservedCU;

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
         * <p>This parameter is required.</p>
         */
        @NameInMap("nickName")
        public String nickName;

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
        @NameInMap("parameter")
        public UpdateComputeQuotaPlanRequestQuotaParameter parameter;

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
