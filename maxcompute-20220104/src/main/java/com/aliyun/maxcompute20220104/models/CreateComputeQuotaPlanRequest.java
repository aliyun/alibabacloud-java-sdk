// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateComputeQuotaPlanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("nickName")
        public String nickName;

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
        @NameInMap("parameter")
        public CreateComputeQuotaPlanRequestQuotaParameter parameter;

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
