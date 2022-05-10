// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaRequest extends TeaModel {
    @NameInMap("Nickname")
    public String nickname;

    @NameInMap("Parameters")
    public CreateQuotaRequestParameters parameters;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Type")
    public String type;

    @NameInMap("region")
    public String region;

    @NameInMap("tenantId")
    public String tenantId;

    public static CreateQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaRequest self = new CreateQuotaRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public CreateQuotaRequest setParameters(CreateQuotaRequestParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public CreateQuotaRequestParameters getParameters() {
        return this.parameters;
    }

    public CreateQuotaRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CreateQuotaRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateQuotaRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateQuotaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class CreateQuotaRequestParameters extends TeaModel {
        @NameInMap("AdhocCU")
        public Long adhocCU;

        @NameInMap("ElasticCU")
        public Long elasticCU;

        @NameInMap("EnablePreemptiveScheduling")
        public String enablePreemptiveScheduling;

        @NameInMap("EnablePriority")
        public String enablePriority;

        @NameInMap("MaxCU")
        public Long maxCU;

        @NameInMap("MinCU")
        public Long minCU;

        @NameInMap("SingleJobCULimit")
        public Long singleJobCULimit;

        public static CreateQuotaRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateQuotaRequestParameters self = new CreateQuotaRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateQuotaRequestParameters setAdhocCU(Long adhocCU) {
            this.adhocCU = adhocCU;
            return this;
        }
        public Long getAdhocCU() {
            return this.adhocCU;
        }

        public CreateQuotaRequestParameters setElasticCU(Long elasticCU) {
            this.elasticCU = elasticCU;
            return this;
        }
        public Long getElasticCU() {
            return this.elasticCU;
        }

        public CreateQuotaRequestParameters setEnablePreemptiveScheduling(String enablePreemptiveScheduling) {
            this.enablePreemptiveScheduling = enablePreemptiveScheduling;
            return this;
        }
        public String getEnablePreemptiveScheduling() {
            return this.enablePreemptiveScheduling;
        }

        public CreateQuotaRequestParameters setEnablePriority(String enablePriority) {
            this.enablePriority = enablePriority;
            return this;
        }
        public String getEnablePriority() {
            return this.enablePriority;
        }

        public CreateQuotaRequestParameters setMaxCU(Long maxCU) {
            this.maxCU = maxCU;
            return this;
        }
        public Long getMaxCU() {
            return this.maxCU;
        }

        public CreateQuotaRequestParameters setMinCU(Long minCU) {
            this.minCU = minCU;
            return this;
        }
        public Long getMinCU() {
            return this.minCU;
        }

        public CreateQuotaRequestParameters setSingleJobCULimit(Long singleJobCULimit) {
            this.singleJobCULimit = singleJobCULimit;
            return this;
        }
        public Long getSingleJobCULimit() {
            return this.singleJobCULimit;
        }

    }

}
